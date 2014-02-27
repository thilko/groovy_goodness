// single quotes
def a = 'lorum ipsum'

// double quotes
def b = "tempor invidunt"

// GString
assert "lorum ipsum tempor invidunt" == "${a} ${b}"
assert "lorum ipsum TEMPOR INVIDUNT" == "${a} ${b.toUpperCase()}"


// multiline strings
def c = """lorum ipsum Lorem ipsum dolor sit amet, consetetur sadipscing elitr,
sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat,
sed diam voluptua. At vero eos et accusam et
"""

// dollar slashy strings
def regexp = /.*"(.*)".*\/(.*)\//
def regexpDollar = $/.*"(.*)".*/(.*)//$

// get informations about GStrings
def user = "draeger"
def language = "groovy"
def s = "Hello $user, welcome to $language"
assert s.valueCount == 2
assert s.values == ["draeger", "groovy"]
