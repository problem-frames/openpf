#!/bin/bash
# eclipse SDK + delta pack
script=$0
cd $(dirname $0) >/dev/null
script=${script#\.*/}
script_folder=`pwd` script=${script/\.sh/} product=eclipse-SDK-3.6.1-linux-gtk-x86_64 deltapack=eclipse-3.6.1-delta-pack.zip pf.sh $*
