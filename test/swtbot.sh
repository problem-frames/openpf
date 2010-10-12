#!/bin/bash
#-----------------------------------------------------------
PROJECT=problem
PRODUCT=pf
IDE=$HOME/IDE
VERSION=3.6
export ECLIPSE_HOME=$IDE/pf-$VERSION.product/eclipse
export BUILD_HOME=$HOME/eclipse.build
export PRODUCT_HOME=$(cd ..; pwd)
TEST_APPLICATION_ID=org.eclipse.ui.ide.workbench
TEST_PLUGIN_ID=problem
TEST_CLASS=uk.ac.open.CreateProblemExamplesTest
OS=macosx
WS=cocoa
ARCH=x86_64
#-----------------------------------------------------------
cp -r $ECLIPSE_HOME/configuration .
# formatter=org.apache.tools.ant.taskdefs.optional.junit.XMLJUnitResultFormatter,$ECLIPSE_HOME/$TEST_CLASS.xml \
# formatter=org.apache.tools.ant.taskdefs.optional.junit.PlainJUnitResultFormatter \
$ECLIPSE_HOME/eclipse -configuration configuration -nosplash \
 -data ../workspace \
 -application org.eclipse.swtbot.eclipse.junit4.headless.swtbottestapplication \
 -testApplication $TEST_APPLICATION_ID \
 -testPluginName $TEST_PLUGIN_ID \
 -className $TEST_CLASS \
 -os $OS -ws $WS -arch $ARCH \
 -consoleLog -debug # -console -noExit
