// some checks for numbers
assert "42".isNumber()
assert "42".isInteger()
assert "42".isBigInteger()
assert "42.42".isBigDecimal()

// ... and for characters
assert ((char)'k').isLowerCase()
assert ((char)'K').isUpperCase()
