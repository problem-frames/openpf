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
tar -zxvf relsat_2.00.tar.gz
sed -e 's/friend SATPreprocessor;//g' SATSolver.h >SATSolver.h.1
mv SATSolver.h.1 SATSolver.h
sed -e 's/#include "getopt.h"//g' sat_solve.cpp >sat_solve.cpp.1
mv sat_solve.cpp.1 sat_solve.cpp
sed -e 's/void main/int main/g' sat_solve.cpp >sat_solve.cpp.1
mv sat_solve.cpp.1 sat_solve.cpp
sed -e 's/CC = xlC/CC = g++/g' Makefile >Makefile1
sed -e 's/CFLAGS = -DNDEBUG -O3 -Q -+ -I\.\/gmp/CFLAGS = -static -DNDEBUG/g' Makefile1 >Makefile2
sed -e 's/LIBS = -lm \.\/gmp\/libgmp.a/LIBS = -lm \/usr\/lib\/libgmp.dll.a/g' Makefile2 >Makefile3
make -f Makefile3
mv relsat.exe ../../solvers
