BEGIN{
  while ((getline line < "product.features.txt")) {
    a[line]=1;
  }
  while ((getline line < "workspace.plugins.txt")) {
    if (a[line]) {
      print line;
    }
  }
}
