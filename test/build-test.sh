cd ../workspace/problem
rm -f problem_*.jar
eant clean
eant build.update.jar
rm -f $HOME/IDE/pf-3.6.product/eclipse/plugins/problem_*.jar
rm -f $HOME/IDE/pf-3.6.product/retain/eclipse/plugins/problem_*.jar
cp problem_*.jar $HOME/IDE/pf-3.6.product/eclipse/plugins
cp problem_*.jar $HOME/IDE/pf-3.6.product/retain/eclipse/plugins
cd -
rm -rf $HOME/workspace
eant
