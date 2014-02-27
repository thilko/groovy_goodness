class Commander {
  // use close as argument
  def commandMe(Closure c) {
    "Use closure as argument... ${c()}"
  }
}

def c = new Commander()
println c.commandMe { "cool!" }

def cl = { "geht auch!" }
println c.commandMe(cl)
