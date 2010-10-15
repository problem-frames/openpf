#!/bin/bash
# eclipse SDK + delta pack
script=$0
cd $(dirname $0) >/dev/null
script=${script#\.*/} script_folder=`pwd` script=${script/\.sh/} product=eclipse-modeling-helios-incubation-linux-gtk-x86_64 deltapack=eclipse-3.6-delta-pack.zip pf.sh $*
