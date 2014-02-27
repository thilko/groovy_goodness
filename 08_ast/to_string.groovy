import groovy.transform.*

@ToString
class Patient {
  String firstName, lastName
  int age
}

println new Patient(firstName: "Harry", lastName: "Hirsch", age: 42)
