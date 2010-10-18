#!/bin/bash
p=$1
cd ../workspace/$p
rm -f "$p"_*.jar
eant clean
eant build.update.jar
rm -f $HOME/IDE/pf-3.6.product/eclipse/plugins/"$p"_*.jar
rm -f $HOME/IDE/pf-3.6.product/retain/eclipse/plugins/"$p"_*.jar
cp "$p"_*.jar $HOME/IDE/pf-3.6.product/eclipse/plugins
cp "$p"_*.jar $HOME/IDE/pf-3.6.product/retain/eclipse/plugins
cd -
