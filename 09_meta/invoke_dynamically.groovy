class Bed {
  String name
  String location
}

def or1 = new Bed(name: "4847879B27", location: "here")

// invoke dynamically by string arg
println "Name of the bed is: " + or1."name"
