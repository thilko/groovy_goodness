import static groovy.io.FileType.*
import static groovy.io.FileVisitResult.*
def groovySrcDir = new File(".")
def countFilesAndDirs = 0

groovySrcDir.traverse {
    countFilesAndDirs++
}
println "Total files and directories in ${groovySrcDir.canonicalPath}: $countFilesAndDirs"

def printer = { println it }
groovySrcDir.traverse(type: FILES, visit: printer, nameFilter: ~/.*\.groovy$/)
