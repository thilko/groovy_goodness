def aFile = new File("test.txt")

// write into a file
aFile << "This is the end of the world we knowing..."

// read
println aFile.text

// delete
aFile.delete()
