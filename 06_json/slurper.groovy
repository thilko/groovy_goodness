import groovy.json.*

def jsonText = '''
{
  "careUnit": {
    "name": "ICU",
    "rooms": ["ICU1", "ICU2", "ICU3"]
  }
}
'''

def json = new JsonSlurper().parseText(jsonText)
println json.careUnit.rooms[2]
