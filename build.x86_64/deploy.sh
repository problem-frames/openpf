#!/bin/bash
#-----------------------------------------------------------
PRODUCT=pf
BUILD_HOME=$HOME/eclipse.build
TARGET_HOME=/home/share/sead/openre
cp $BUILD_HOME/I.$PRODUCT/*.zip $TARGET_HOME
./publish.sh
svn copy $repo/openpf/trunk $repo/openpf/tags/`date +%d-%m-%Y` -m "deployed"
