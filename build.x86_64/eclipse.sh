#!/bin/bash
PRODUCT=problem
VERSION=3.6
export ECLIPSE_SDK=$HOME/IDE/sdk/$VERSION
export ECLIPSE_HOME=$ECLIPSE_SDK/eclipse
rm -rf configuration
cp -rf $ECLIPSE_HOME/configuration .
$ECLIPSE_SDK/eclipse/eclipse -plugincustomization plugin_customization.ini -configuration configuration -data `pwd`/../workspace
