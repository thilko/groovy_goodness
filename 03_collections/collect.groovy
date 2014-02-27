def list = [10, 20, 30, [1, 2, 3, [25, 50]], ['Groovy']]
println list.collectAll { it*2 }
