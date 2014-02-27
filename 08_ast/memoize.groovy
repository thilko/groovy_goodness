import groovy.transform.*
class FileSystem {

  Random r = new Random()
  @Memoized
  int sizeOfHome(String path){
    r.nextInt(100)
  }
}

def f = new FileSystem()
println f.sizeOfHome()
println f.sizeOfHome()
println f.sizeOfHome()
println f.sizeOfHome()
