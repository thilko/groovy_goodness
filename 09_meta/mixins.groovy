@Mixin([Nubs, Case])
class Patient { def startCase(){ println "bla"} }

class Case {

  def startCase() {
    println "start case for ${this}"
  }
}

class Nubs {

  def startCase() {
    println "start nubs for ${this}"
  }
}

// apply to classes
def herbert = new Patient()
herbert.startCase()


// apply to object instances
def s = "Bernd the bread"
s.metaClass.mixin Case
s.startCase()
