class Patient {
  String firstName, lastName
}

@Newify
def theRubyWay(){
  Patient.new(firstName: "Karl", lastName: "Klammer")
}

println theRubyWay().firstName
