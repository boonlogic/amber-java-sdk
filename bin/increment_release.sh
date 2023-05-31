#!/usr/bin/env bash

# increment version number
export OLDVERSION="$(cat pom.xml | grep "^    <version>.*</version>$" | awk -F'[><]' '{print $3}')"
export VERSION="$(echo ${OLDVERSION} | awk -F. -v OFS=. '{$NF += 1 ; print}')"

if [ "$(uname)" == "Darwin" ]; then
    # Do something under Mac OS X platform 
    sed -i '' -e "s/$OLDVERSION/$VERSION/g" pom.xml
elif [ "$(expr substr $(uname -s) 1 5)" == "Linux" ]; then
    # Do something under GNU/Linux platform
    sed -i "s/$OLDVERSION/$VERSION/g" pom.xml
fi
