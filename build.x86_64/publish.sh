#!/bin/bash
# see http://wiki.eclipse.org/Equinox/p2/Publisher
ECLIPSE_HOME=$HOME/IDE/pf-3.6.product/eclipse
SITEXML=file:/$HOME/build/cruisecontrol-bin-2.8.3/projects/openpf/workspace/problem.update/site.xml 
CATEGORYXML=file:/$HOME/build/cruisecontrol-bin-2.8.3/projects/openpf/workspace/problem.update/category.xml 
BUILT_REPO=$HOME/eclipse.build/update-3.6
PUBLIC_REPO=/home/share/sead/openre/update
USERGUIDE=$HOME/build/cruisecontrol-bin-2.8.3/projects/openpf/doc/UserGuide
rm -rf $PUBLIC_REPO
awk -f version.awk $HOME/build/cruisecontrol-bin-2.8.3/projects/openpf/workspace/problem.update/site-qualifier.xml > $HOME/build/cruisecontrol-bin-2.8.3/projects/openpf/workspace/problem.update/site.xml
awk -f version.awk $HOME/build/cruisecontrol-bin-2.8.3/projects/openpf/workspace/problem.update/category-qualifier.xml > $HOME/build/cruisecontrol-bin-2.8.3/projects/openpf/workspace/problem.update/category.xml
java -cp $ECLIPSE_HOME/plugins/org.eclipse.equinox.launcher_*.jar org.eclipse.core.launcher.Main -application org.eclipse.equinox.p2.publisher.UpdateSitePublisher -metadataRepository file://home/share/sead/pf/update -artifactRepository file://home/share/sead/pf/update -source $SITEXML -configs cocoa.macosx.x86_64 -configs gtk.linux.x86_64 -compress -publishArtifacts
java -cp $ECLIPSE_HOME/plugins/org.eclipse.equinox.launcher_*.jar org.eclipse.core.launcher.Main -application org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher -metadataRepository file://home/share/sead/pf/update -artifactRepository file://home/share/sead/pf/update -source $BUILD_REPO -configs cocoa.macosx.x86_64 -compress -publishArtifacts
java -cp $ECLIPSE_HOME/plugins/org.eclipse.equinox.launcher_*.jar org.eclipse.core.launcher.Main -application org.eclipse.equinox.p2.publisher.CategoryPublisher -metadataRepository file://home/share/sead/pf/update -categoryDefinition $CATEGORYXML -categoryQualifier -compress
cp $HOME/build/cruisecontrol-bin-2.8.3/projects/openpf/workspace/problem.update/site.xml $PUBLIC_REPO
cp -r $BUILT_REPO/features $PUBLIC_REPO 
cp -r $BUILT_REPO/plugins $PUBLIC_REPO 
cp $USERGUIDE $PUBLIC_REPO
