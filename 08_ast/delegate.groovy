class Surgery {
  @Delegate
  Date startTime

  @Delegate
  List<String> surgeons = []

  // boolean after(Date anotherDate) {
  //   throw new Exception("test")
  // }
}

def scoliosis = new Surgery(startTime: new Date())
scoliosis << "Dr. Meiser" << "Dr. Klopp"


println scoliosis.after(new Date() + 4 )
println scoliosis.surgeons
