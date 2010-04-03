#!/bin/bash
#-----------------------------------------------------------
PRODUCT=openome
BUILD_HOME=$HOME/eclipse.build
TARGET_HOME=/home/share/sead/archev
cp $BUILD_HOME/I.$PRODUCT/*.zip $TARGET_HOME
sudo mount -t cifs //penelope/staff_websites/staff/yy66 $HOME/penelope -o user=yy66,workgroup=open-university
cp $BUILD_HOME/I.$PRODUCT/*.zip $HOME/penelope/tool/java/istar/latest
cp $BUILD_HOME/I.$PRODUCT/*.zip $HOME/penelope/tool/java/istar/rcp
sudo umount $HOME/penelope
