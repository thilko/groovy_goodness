// checked exceptions does not needed to be catched
// new Long("something_wrong")


try {
  new Long("something_wrong")
}catch(all){ // shortcut for Exception
  println all
}
