#!/bin/bash
#-----------------------------------------------------------
PROJECT=problem
PRODUCT=pf
IDE=$HOME/IDE
VERSION=3.6
export ECLIPSE_HOME=$IDE/pf-$VERSION.product/eclipse
export BUILD_HOME=$HOME/eclipse.build
export PRODUCT_HOME=$(cd ..; pwd)
#-----------------------------------------------------------
PRODUCT_FILE=$PRODUCT.product
PROJECT_FILE=$PROJECT
if [ ! -f $ECLIPSE_HOME/plugins/org.eclipse.xtext_1.0.1.v201008251220.jar ]; then
	cp -r ~/IDE/pf-3.6.product/more/eclipse/features/* ~/IDE/pf-3.6.product/eclipse/features/
	cp -r ~/IDE/pf-3.6.product/more/eclipse/plugins/* ~/IDE/pf-3.6.product/eclipse/plugins/
fi
\ls ../workspace > workspace.plugins.txt
/usr/bin/xsltproc product.xsl ../workspace/$PROJECT_FILE/$PRODUCT_FILE > product.plugins.txt
/usr/bin/xsltproc feature.xsl ../workspace/$PROJECT_FILE/$PRODUCT_FILE > product.features.txt
files=`awk -f intersect.awk`
feature_files=`awk -f feature_intersect.awk`
rm -rf $BUILD_HOME
mkdir -p $BUILD_HOME/features
mkdir -p $BUILD_HOME/plugins
cd $BUILD_HOME/plugins
for f in $files;  do
  echo $f
  ln -sf $PRODUCT_HOME/workspace/$f .
done
cd -
cd $BUILD_HOME/features
for f in $feature_files;  do
  echo $f
  ln -sf $PRODUCT_HOME/workspace/$f .
done
rm -rf $BUILD_HOME/I.$PRODUCT/*
cd -
cp -r $ECLIPSE_HOME/configuration .
sed -e "s/MYPRODUCT/\/$PROJECT_FILE\/$PRODUCT_FILE/" productBuild.properties  | sed -e "s/MYVERSION/pf-$VERSION.product/" | sed -e "s/PRODUCT/$PRODUCT/" > build.properties
#$ECLIPSE_HOME/eclipse -configuration configuration -nosplash -application org.eclipse.ant.core.antRunner -buildfile $ECLIPSE_HOME/plugins/org.eclipse.pde.build_*/scripts/productBuild/productBuild.xml -Dbuilder=. $*
cp $ECLIPSE_HOME/plugins/org.eclipse.pde.build_*/scripts/productBuild/productBuild.xml build.xml
$ECLIPSE_HOME/eclipse -configuration configuration -nosplash -application org.eclipse.ant.core.antRunner -Dbuilder=. -buildfile `pwd`/build.xml $*
#./deploy.sh
if [ $? ]; then
 exit
fi
