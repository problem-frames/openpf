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
cd software
tar xvfz minisat-2.2.0.tar.gz
cd minisat-2.2.0
make rs
mv minisat_static ../../solvers
