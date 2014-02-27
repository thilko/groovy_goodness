def printMe(String value){
  println value
}

def names = ["a", "fancy", "list"]
names.each { println it}
names.each(this.&printMe)


// works also with java methods
