class CareUnit {
  def name
  def room

  def clean(firstName, lastName, age){
    println "I was cleaned by $firstName, $lastName($age)"
  }

  def isCase(name){
    this.name == name
  }
}

class Room {
  def bed
}

class Bed {
  def name
}


def ortho = new CareUnit(name: "ortho", room:new Room(bed: new Bed(name: "3763")))
def neuro = new CareUnit(name: "neuro")

// safe navigation
println ortho.room?.bed?.name
println neuro.room?.bed?.name


// elvis operator
def roomName = "or1"
def anotherRoomName = null

println (roomName != null)? roomName : "default room name"
println (roomName ?: "default room name")
println (anotherRoomName ?: "default room name")


// spread dot
def wisdom = ["simplicity", "over", "complexity"]
println wisdom*.toUpperCase()

// spread operator
ortho.clean(["Hans", "Meiser", 1946])

// in operator
def languages = ["ruby", "groovy", "shell"]
println "ruby" in languages
println ortho in [neuro, ortho]

