class Patients implements Iterable {
    def names = ["bernd", "horst", "herbert", "heinz"]
    def counter = 0

    @Override
    Iterator iterator() {
      [hasNext: { counter <= names.size() },
        next: { names[counter++] }] as Iterator
    }
}

def p = new Patients()
p.each {println it}
