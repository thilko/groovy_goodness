def (a, b) = ["hello", "draeger"]
assert a == "hello"
assert b == "draeger"

// more values are ignored
def (c,d) = ["hello", "draeger", "world"]
assert d == "draeger"

// with regexp
def money = "12 euro"
def regexp = /(\d+) (\w+)/
def (exp, amount, currency) = (money =~ regexp)[0]
assert amount == "12"
assert currency == "euro"

