#!/bin/bash
#-----------------------------------------------------------
PRODUCT=pf
BUILD_HOME=$HOME/eclipse.build
TARGET_HOME=sead1:/home/share/sead/pf
scp $BUILD_HOME/I.$PRODUCT/*.zip $TARGET_HOME
