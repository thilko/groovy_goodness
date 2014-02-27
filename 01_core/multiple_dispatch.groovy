abstract class Device{
  def name
}
class Fabius extends Device{ }

class Primus extends Device{ }

class Factory {
  static def construct(Device device){
    println "construct an abstract ${device.name}"
  }

  static def construct(Fabius device){
    println "construct a fabius ${device.name}"
  }

  static def construct(Primus device){
    println "construct a primus ${device.name}"
  }
}


Device primus = new Primus(name: "298383928289898")
Device fabius = new Fabius(name: "48498430949879877")

Factory.construct(primus)
Factory.construct(fabius)
