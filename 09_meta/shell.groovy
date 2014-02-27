def script = '''
careUnit { println "hello"}
'''

def binding = new Binding()
binding.careUnit =  { Closure c ->
  c()
}


def shell = new GroovyShell(binding)
shell.evaluate(script)
