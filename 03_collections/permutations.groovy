def languages = ['Hannes', 'Soenke', 'Sebastian']
def result = []
languages.eachPermutation {
result << it }
assert 6 == result.size()
assert ['Hannes', 'Soenke', 'Sebastian'] == result[0]
assert ['Hannes', 'Sebastian', 'Soenke'] == result[1]
assert [['Soenke', 'Hannes', 'Sebastian'],
        ['Soenke', 'Sebastian', 'Hannes']] ==
       result.findAll { it[0] == 'Soenke' }

