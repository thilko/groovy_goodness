import groovy.transform.Immutable
@Immutable(copyWith = true)
class Surgery {
  Date startTime
  String surgeon
  String executionBed
}


def surgery = new Surgery(startTime: new Date(),
                          surgeon: "Dolly Buster",
                          executionBed: "basement1")

// property access for final fields
println surgery.startTime

// toString()
println surgery

// will throw an exception
surgery.surgeon = "Oliver Geissler"

// equals/hashCode methods are added
