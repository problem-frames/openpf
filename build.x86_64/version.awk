/qualifier/ {
  split($2, a, /qualifier/)
  split(a[1], b, /"/)
  system ("ls /home/yy66/eclipse.build/update-3.6/" b[2] "* > /tmp/p")
  getline line < "/tmp/p"
  split(line, c, "1.0.0.")
  split(c[2], d, ".jar")
  gsub(/qualifier/, d[1], $0)
  print $0
}
!/qualifier/ {
 print $0
}
