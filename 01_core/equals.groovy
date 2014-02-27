println null == 42 //f alse
println null.equals(42) // false

// object identity
Integer test = 1000  // try it with 127
Integer test1 = test
Integer test2 = 1000

println test.is(test1) // true
println test.is(test2) // false
