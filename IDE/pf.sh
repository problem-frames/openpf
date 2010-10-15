#!/bin/bash
# eclipse SDK + delta pack

# create symbolic links for the plugins for the RCP build
function collect() {
	# $1 is either features or plugins
	p1=$2
	p2=`pwd`/$2
	# calculate how many features/plugins in p1 are missing in p2
	for f in $p2/*/eclipse/$1/*; do
	 if [[ ! "$f" =~ $3 ]]; then
	    if [ ! -e $p2/$3/eclipse/$1/$(basename $f) ]; then
		cp -rf $f $p2/$3/eclipse/$1/$(basename $f)
	    fi
	 fi
	done
}

function retain() {
	# $1 is either features or plugins
	f1=
	f2=
	p1=$2
	p2=$3
	mkdir -p $p2/retain/eclipse/$1
	# calculate how many features/plugins in p1 are missing in p2
	for f in `ls $p1/$1`; do
		f1+=" $f"
	done
	for f in `ls $p2/*/eclipse/$1`; do
		f2+=" $f"
	done
	for f in $f1; do
	  x=0
	  for ff in $f2; do
		  if [ "$f" = "$ff" ]; then
			  x=1
			  break
		  fi
	  done
	  if [[ $x = 0 ]]; then
		  cp -rf $p1/$1/$f $p2/retain/eclipse/$1
	  fi
	done
}

copying() {
	retain features $3 $1
	retain plugins $3 $1
	collect features $1 $2
	collect plugins $1 $2
}

# install/run Eclipse for the product named after the script
folder=`pwd`
archive=$folder/archive
mkdir -p $script.product
cd $script.product >/dev/null
if [ ! -d $product ]; then
	mkdir -p $product
	cd $product >/dev/null
	tar xfz $archive/$product.tar.gz
	unzip -o $archive/$deltapack > /dev/null
	cd - >/dev/null
fi
rm -rf eclipse
ln -sf $product/eclipse .
rm -rf eclipse/links
mkdir -p eclipse/links
for e in *; do
 if [[ ! "$e" =~ ^eclipse ]]; then
  if [ ! -f eclipse/links/$e.link ]; then
        echo $e
	echo path=`pwd`/$e > eclipse/links/$e.link
  fi
 fi
done
cd $script_folder >/dev/null
if [[ 2 > 1 ]]; then
mkdir -p ./product
for f in ./product/*; do
	cd $script.product/ >/dev/null
	if [ ! -d $(basename $f) ]; then
		ln -sf .$f $(basename $f)
	fi
	cd .. >/dev/null
done
if [ ! -d $script.product/retain ]; then
	copying $script.product $product $HOME/IDE/sdk/3.6pf/eclipse
	copying $script.product $product $HOME/demo/pf
fi
fi

# run Eclipse if parameters are provided
if [[ $# > 0 ]]; then
	$script.product/eclipse/eclipse $*
else
	echo Finished
fi
cd $folder >/dev/null
