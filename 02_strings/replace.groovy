println replaceWithClosure()

def replaceWithClosure(){
  "jetzt kommt ein Karton".replaceAll("Karton") {
    ['awesome', 'cool', 'okay'][new Random().nextInt(3)]
  }
}


println "hello world".replaceAll(~/ello/, "ELLO")


// content replacement
def replacement = {
  if(it == '3'){
    'x'
  }else if(it == '4'){
    'y'
  }
}

println "3647461".collectReplacements(replacement)
