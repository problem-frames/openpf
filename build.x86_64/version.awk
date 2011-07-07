!/qualifier/ {
 print $0
}
/qualifier/ {
  gsub(/qualifier/, "", $0)
  print $0
}
