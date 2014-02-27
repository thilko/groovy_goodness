class CareUnit {
  String name
  List<Room> rooms = []
}

class Room {
  String name
}

def builder = new ObjectGraphBuilder(classLoader: getClass().classLoader)
def icu = builder.careUnit(name: "ICU") {
  room(name: "ICU1")
  room(name: "ICU2")
}

println icu.rooms[1].name

