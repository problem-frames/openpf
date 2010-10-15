#!/bin/bash
RETURN=`pwd`
VERSION=3.6
mkdir -p $HOME/IDE
if [ ! -f $HOME/IDE/pf-$VERSION.sh ]; then
	cp pf-$VERSION.sh $HOME/IDE
	cp pf.sh $HOME/IDE
fi
cd $HOME/IDE
mkdir -p archive
cd archive
if [ ! -d archive/eclipse-modeling-helios-incubation-linux-gtk-x86_64.tar.gz ]; then
	wget http://sead1.open.ac.uk/pf/development-kit/eclipse-modeling-helios-incubation-linux-gtk-x86_64.tar.gz
fi
if [ ! -d archive/eclipse-$VERSION-delta-pack.zip ]; then
	wget http://sead1.open.ac.uk/pf/development-kit/eclipse-$VERSION-delta-pack.zip
fi
cd ..
if [ ! -d archive/eclipse-SDK-more-required-products.zip ]; then
	wget http://sead1.open.ac.uk/pf/development-kit/eclipse-SDK-more-required-products.zip
fi
if [ ! -d product ]; then
	unzip -o archive/eclipse-SDK-more-required-products.zip
fi
pf-$VERSION.sh
cd $RETURN
