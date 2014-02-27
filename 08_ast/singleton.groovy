import groovy.transform.*

@Singleton
class Util {
  def fancyMethod() {
    println 42
  }
}


Util.instance.fancyMethod()

// produces RuntimeException
new Util()
