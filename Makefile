export SHELL := /bin/bash
export PYTHONPATH := $(shell pwd)

generate:
	openapi-generator generate -i amber-api.yml -g java -c "config.yaml" \
	--http-user-agent "BoonLogic / Amber Java SDK / requests" \
	--global-property=modelTests=false \
	--global-property=apiTests=false \

init:
	[ -f ./target/junit-platform-console-standalone-1.9.2.jar ] && true || \
	(cd target && \
	wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.2/junit-platform-console-standalone-1.9.2.jar)

format-check:
	@. local-env/bin/activate && \
	pycodestyle --first boonamber/__init__.py

# test-v1, test-v1next, test-dev, test-qa
# run stock profiles from secrets manager
test-%: test-env-check
	AMBER_TEST_LICENSE_ID=$* mvn test -Dtest="org.boonamber.client.**"

test-env-check:
	@if [[ "${AMBER_TEST_LICENSE_FILE}" == "" ]]; then \
		echo "AMBER_TEST_LICENSE_FILE is required in environment"; \
		exit 1; \
	fi

.PHONY: format-check test test-env-check
