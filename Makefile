export SHELL := /bin/bash
export PYTHONPATH := $(shell pwd)

generate:
	openapi-generator generate -i amber-api.yml -g java

init:
	[ -f ./target/junit-platform-console-standalone-1.9.2.jar ] && true || \
	(cd target && \
	wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.2/junit-platform-console-standalone-1.9.2.jar)

format-check:
	@. local-env/bin/activate && \
	pycodestyle --first boonamber/__init__.py

# test-v1, test-v1next, test-dev, test-qa
# run stock profiles from secrets manager
test-%: test-compile
	java -jar junit-platform-console-standalone-1.9.2.jar \
	--class-path target \
	--select-package org.openapitools.client.api

test: test-default

test-compile: init
	javac -d target -cp target:junit-platform-console-standalone-1.9.2.jar \
	src/test/java/org/openapitools/client/api/*.java


test-env-check:
	@if [[ "${AMBER_TEST_LICENSE_FILE}" == "" || "${AMBER_TEST_LICENSE_ID}" == "" ]]; then \
		echo "AMBER_TEST_LICENSE_FILE and AMBER_TEST_LICENSE_ID are required in environment"; \
		exit 1; \
	fi

.PHONY: format-check test test-env-check
