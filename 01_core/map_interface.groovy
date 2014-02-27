// you can use a map as interface implementation
def runnable = [
  run: {
    10.times { println "Something really expensive here. $it"}
  }
] as Runnable

def t = new Thread(runnable)
t.start()
t.join()


// or use a closure directly if it is a SAM interface
def x = new Thread({ println "... and sometimes cheap"})
x.start()
x.join()
