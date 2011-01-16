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
pdflatex doc
bibtex doc
pdflatex doc
pdflatex doc
rm doc.aux doc.bbl doc.blg doc.log
acroread doc.pdf
