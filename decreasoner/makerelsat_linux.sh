#
# Copyright (c) 2005 IBM Corporation and others.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Common Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/cpl-v10.html
#
# Contributors: 
# IBM - Initial implementation
#
cd software/relsat-dist
tar -xvf relsat_2.02.tar
# g++296
sed -e 's/CC = xlC/CC = g++/g' Makefile.linux >Makefile1
sed -e 's/CFLAGS = -DNDEBUG -O3 -Q -+ -I\.\/gmp/CFLAGS = -static -DNDEBUG/g' Makefile1 >Makefile2
sed -e 's/LIBS = -lm \.\/gmp\/libgmp.a/LIBS = -lm \/usr\/lib\/libgmp.a/g' Makefile2 >Makefile3
make -f Makefile3
mv relsat ../../solvers
