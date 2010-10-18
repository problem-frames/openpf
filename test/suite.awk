! /^#/{
 cmd1 = "build.sh " $1
 cmd2="rm -rf $HOME/workspace"
 cmd3 = "eant -Dplugin.name=" $1 " -Dclass.name=" $2
 system (cmd1);
 system (cmd2);
 system (cmd3);
}
