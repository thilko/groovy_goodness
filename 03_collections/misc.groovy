// groupBy
// unique
// orderBy
// GroovyCollections.combinations

def letters = 'a'..'g'
assert letters.collate(3) == [['a', 'b', 'c'],
                              ['d', 'e', 'f'],
                              ['g']]
