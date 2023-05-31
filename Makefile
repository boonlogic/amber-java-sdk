export SHELL := /bin/bash
export PYTHONPATH := $(shell pwd)

generate:
	openapi-generator generate -i amber-api.yml -g java -c "config.yaml" \
	--http-user-agent "BoonLogic / Amber Java SDK / requests" \
	--global-property=modelTests=false \
	--global-property=apiTests=false \
	
build:
	mvn compile

# test-v1, test-v1next, test-dev, test-qa
# run stock profiles from secrets manager
test-%: test-env-check
	AMBER_TEST_LICENSE_ID=$* mvn test -Dtest="com.boonamber.**"

test-env-check:
	@if [[ "${AMBER_TEST_LICENSE_FILE}" == "" ]]; then \
		echo "AMBER_TEST_LICENSE_FILE is required in environment"; \
		exit 1; \
	fi

release:
	. ./bin/increment_release.sh && \
	git add pom.xml && git commit -m "increment version to $$VERSION" && git push && \
	git tag -a "v$$VERSION" && \
	git push origin --tags

.PHONY: format-check test test-env-check
