def careUnit = new Expando(name: "ICU")
careUnit.rooms = ["ICU42", "ICU43"]
careUnit.allPatients = { ["Hans Meiser", "Hella von Sinnen"]}

// attributes
println careUnit.rooms

// methods
println careUnit.allPatients()
