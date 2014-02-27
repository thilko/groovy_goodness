// can be a file or url
def systemConfig = """

ithaca.host = 'http://localhost:8443/ithaca'

environments {

  dev {
    ithaca.host = 'http://localhost:8443/ithaca'
  }

  test {
    ithaca.host = 'http://dmaid0309:8443/ithaca'
  }

  production {
    ithaca.host = 'http://dmaid0052:8443/ithaca'
  }
}

app {
  version = version()
}

def version() {
    '1.0'
}

"""


def testConfig = new ConfigSlurper("test").parse(systemConfig)
println testConfig.ithaca.host

def productionConfig = new ConfigSlurper("production").parse(systemConfig)
println productionConfig.ithaca.host
println productionConfig.app.version
