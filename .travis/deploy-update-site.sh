#!/bin/bash

export DEPLOY_REPO='https://github.com/atlanmod/updates'
export TARGET_BRANCH="master"
export KEEP_HISTORY=false
export SRC_FOLDER="deployment/update/target/repository"
export DEST_FOLDER="cypriot/snapshot"
export DEPLOY_KEY="deploy-key-updates"

export OUT_DIR="out-updates"

# Add an index.html that instructs users browing the update site URL in a
# browser to use it in Eclipse instead.
#
# We put the contents of the `static` folder into the SRC_FOLDER because the
# DEST_FOLDER will be erased and populated by the safe-deploy script.
cp -r deployment/update/static/. ${SRC_FOLDER}

bash .travis/safe-deploy.sh