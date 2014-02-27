import groovy.transform.Synchronized

class Surgeon {

  @Synchronized("start")
  def start(def surgery) { }

  @Synchronized("document")
  def document() { }

}


// default synchronization locks on this
