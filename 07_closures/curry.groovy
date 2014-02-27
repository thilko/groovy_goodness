// Simple sample.
def addNumbers = { x, y -> x + y }
def addOne = addNumbers.curry(1)
assert 5 == addOne(4)


// curry from right to left
def subtractNumbers = { x, y -> x - y }
def subtractOne = subtractNumbers.rcurry(10)
assert -5 == subtractOne(5)


// ncurry to curry various arguments
