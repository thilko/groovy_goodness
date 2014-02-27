// switch statement uses the isCase() method whoch could be overriden
class Switch{
  static def superSwitch(value){
    switch(value){
     case ~/(\d+)-(\d+)/:
        println "pattern match"
        break
    case BigDecimal:
        println "big decimal"
        break
    case 42..50:
        println "a range"
        break
    case 34:
        println "object equals"
        break
    case { it in Contract && it.hasAgreement() }:
        println "with closure"
        break
    case ["hello", "bernd"]:
        println "with map"
        break
    default:
        println "default"
    }
  }
}

class Contract {
  def hasAgreement(){ true }
}


Switch.superSwitch("3434-234343") // pattern
Switch.superSwitch(BigDecimal.TEN)  // class
Switch.superSwitch(43)  // range
Switch.superSwitch(new Contract())  //closure
Switch.superSwitch(34)  //object
Switch.superSwitch("bernd")  // map
Switch.superSwitch("bernd the bread love misses baguette")  // default
