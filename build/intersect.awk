BEGIN{
  while ((getline line < "product.plugins.txt")) {
    a[line]=1;
  }
  while ((getline line < "workspace.plugins.txt")) {
    if (a[line]) {
      print line;
    }
  }
}
