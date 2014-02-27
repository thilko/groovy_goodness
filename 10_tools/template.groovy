import groovy.text.*
def simple = new SimpleTemplateEngine()
def source = '''Dear $name,
Please respond to this e-mail before ${(now + 7).format("dd-MM-yyyy")}
Kind regards, mrhaki'''
def binding = [now: new Date(109, 11, 1), name: 'Hubert Klein Ikkink']
def output = simple.createTemplate(source).make(binding).toString()

println output
