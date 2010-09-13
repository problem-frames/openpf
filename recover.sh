git clone -l .git ../openpf-$1
cd ../openpf-$1
rev=`git svn find-rev r$1`
git reset --hard $rev
cd build.macosx
build.sh
cd demo
rm -rf pf
unzip ~/eclipse.build/I.pf/pf-macosx.cocoa.x86_64.zip
open pf/pf.app
cd -
