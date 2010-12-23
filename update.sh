#!/bin/bash
for syntax in ontology problem argument; do
	#captalise the first letter
	Syntax=`echo "${syntax:0:1}" | tr "[:lower:]" "[:upper:]"`${syntax:1}
	trac-admin /home/share/repo/trac/openre attachment remove wiki:Examples/$syntax $Syntax.xtext
	trac-admin /home/share/repo/trac/openre attachment add wiki:Examples/$syntax workspace/$syntax/samples/$Syntax.xtext
done
