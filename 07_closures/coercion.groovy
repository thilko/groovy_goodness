// closures are converted to appropriate SAM
def t = new Thread({
  100.times {println it}
})

t.start()
