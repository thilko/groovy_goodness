import groovy.transform.*

@EqualsAndHashCode
class Patient {
  String firstName, lastName
  int age
}

def max1 = new Patient(firstName: "max", lastName: "meyer", age: 23)
def max2 = new Patient(firstName: "max", lastName: "meyer", age: 23)
println max1.equals(max2)
