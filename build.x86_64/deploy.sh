#!/bin/bash
#-----------------------------------------------------------
PRODUCT=pf
BUILD_HOME=$HOME/eclipse.build
TARGET_HOME=sead1:/home/share/sead/openre
scp $BUILD_HOME/I.$PRODUCT/*.zip $TARGET_HOME
svn copy $repo/openpf/trunk $repo/openpf/tags/`date +%d-%m-%Y` -m "deployed"
