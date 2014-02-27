import groovy.json.*

def builder = new JsonBuilder()
builder.careUnit {
  name("ICU")
  rooms("ICU1", "ICU2", "ICU3")
}

println builder.toString()
println JsonOutput.prettyPrint(builder.toString())
