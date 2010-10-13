#!/bin/bash
#-----------------------------------------------------------
IDE=$HOME/IDE
VERSION=3.6
export ECLIPSE_HOME=$IDE/pf-$VERSION.product/eclipse
TEST_APPLICATION_ID=org.eclipse.ui.ide.workbench
TEST_PLUGIN_ID=problem
TEST_CLASS=uk.ac.open.CreateProblemExamplesTest
TEST_PLUGIN_ID=core
TEST_CLASS=uk.ac.open.CreateExamplesTest
OS=macosx
WS=cocoa
ARCH=x86_64
#-----------------------------------------------------------
if [ -e configuration ]; then rm -rf configuration; fi
cp -r $ECLIPSE_HOME/configuration .
#$ECLIPSE_HOME/eclipse 
java -Xms256M -Xmx768M -XX:MaxPermSize=512M -classpath $ECLIPSE_HOME/plugins/org.eclipse.equinox.launcher_*.jar -XstartOnFirstThread org.eclipse.core.launcher.Main \
 -application org.eclipse.swtbot.eclipse.junit4.headless.swtbottestapplication \
 -data workspace \
 -testApplication $TEST_APPLICATION_ID \
 -testPluginName $TEST_PLUGIN_ID \
 -className $TEST_CLASS \
 formatter=org.apache.tools.ant.taskdefs.optional.junit.XMLJUnitResultFormatter,$ECLIPSE_HOME/$TEST_CLASS.xml \
 formatter=org.apache.tools.ant.taskdefs.optional.junit.PlainJUnitResultFormatter \
 -os $OS -ws $WS -arch $ARCH \
 -consoleLog -debug #-console -noExit
