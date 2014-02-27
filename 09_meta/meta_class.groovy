class Human {
  Human(){
    this.metaClass = new ExpandoMetaClass(Human, false, true)
    this.metaClass.initialize()
  }

  def methodMissing(String name, args){
    this.metaClass."$name" = { -> println "fly with bernd the bread!"}
    this."$name"()
  }

}

Human horst = new Human()
horst.fly(height: 400)


/*
Number.metaClass {
    multiply { Amount amount -> amount.times(delegate) }
    div      { Amount amount -> amount.inverse().times(delegate) }
}


Class.metaClass.static.fqn = { delegate.name }
assert String.fqn() == "java.lang.String"


Class.metaClass {
    'static' {
        fqn { delegate.name }
    }
}

*/


// add methods to interfaces
// List.metaClass.sizeDoubled = {-> delegate.size() * 2 }
