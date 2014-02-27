class Archive {

  @Lazy def size = { new File("/Users/thilko/Documents").directorySize() }()

}

def a = new Archive()
println a.size
