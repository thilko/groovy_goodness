def randomCalculator = { new Random().nextInt(100) }
println randomCalculator()
println randomCalculator()

randomCalculator = randomCalculator.memoize()

println randomCalculator()
println randomCalculator()
println randomCalculator()
