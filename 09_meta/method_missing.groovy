class Human {
  def methodMissing(String name, args){
    println "missing method name: $name with args $args"
  }

}

Human horst = new Human()
horst.fly(height: 400)
