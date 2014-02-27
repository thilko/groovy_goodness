// use map with constructor new StringTokenizer(String, String)
def explicitTokenizer = ["1,2,3,4,5,6,7,8,9", ","] as StringTokenizer
println explicitTokenizer.countTokens()

// or do it implicit
StringTokenizer implicitTokenizer = ["hello,world", ","]
println implicitTokenizer.countTokens()


// use map as constructor for GroovyBeans
def importantAlert = new Alert(severity: 4, message: "something bad happened")
println importantAlert.severity

class Alert {
  int severity
  String message
}
