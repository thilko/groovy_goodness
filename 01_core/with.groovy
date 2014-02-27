class Directory {
  def size
  def path
  def entries
}
def home = new Directory()
home.with {
  size = 1_000
  path = "/Users/richtthi"
  entries = [".zshrc", ".gitconfig"]

  println it.class
}

println home.entries
