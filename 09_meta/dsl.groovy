enum Surgery {
  amputation, rectoscopy
}

Integer.metaClass.getHours = {-> delegate}

import static Surgery.*

def doctor(String name) {
  [ "was" : {Integer i->
    [ "_in" :{ Surgery s->
        println "$name was $i hours in an $s"
      }]  
    }]
}


doctor "lector" was 4.hours _in amputation
