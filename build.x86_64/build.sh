#!/bin/bash
#-----------------------------------------------------------
PROJECT=problem
PRODUCT=pf
IDE=$HOME/IDE
VERSION=3.6
export ECLIPSE_HOME=$IDE/sdk/$VERSION/eclipse
export BUILD_HOME=$HOME/eclipse.build
export PRODUCT_HOME=$(cd ..; pwd)
#-----------------------------------------------------------
PRODUCT_FILE=$PRODUCT.product
PROJECT_FILE=$PROJECT
#/software/git-1.6.0.3/bin/git svn rebase
\ls ../workspace > workspace.plugins.txt
/usr/bin/xsltproc product.xsl ../workspace/$PROJECT_FILE/$PRODUCT_FILE > product.plugins.txt
files=`awk -f intersect.awk`
rm -rf $BUILD_HOME
mkdir -p $BUILD_HOME/features
mkdir -p $BUILD_HOME/plugins
cd $BUILD_HOME/plugins
for f in $files;  do
  echo $f
  ln -sf $PRODUCT_HOME/workspace/$f .
done
rm -rf $BUILD_HOME/I.$PRODUCT/*
cd -
cp -r $ECLIPSE_HOME/configuration .
sed -e "s/MYPRODUCT/\/$PROJECT_FILE\/$PRODUCT_FILE/" productBuild.properties  | sed -e "s/MYVERSION/$VERSION/" | sed -e "s/PRODUCT/$PRODUCT/" > build.properties
#$ECLIPSE_HOME/eclipse -configuration configuration -nosplash -application org.eclipse.ant.core.antRunner -buildfile $ECLIPSE_HOME/plugins/org.eclipse.pde.build_*/scripts/productBuild/productBuild.xml -Dbuilder=. $*
cp $ECLIPSE_HOME/plugins/org.eclipse.pde.build_*/scripts/productBuild/productBuild.xml build.xml
$ECLIPSE_HOME/eclipse -configuration configuration -nosplash -application org.eclipse.ant.core.antRunner -Dbuilder=. $*
#./deploy.sh
if [ $? ]; then
 exit
fi
