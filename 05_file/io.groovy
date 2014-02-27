def aFile = new File("test.txt")

// write into a file
aFile << "This is the end of the world we knowing..."

// read
println aFile.text

// write
aFile.write "How much is the fish"
aFile << "Hei hei mitä kuuluu?"

println aFile.text

// delete
aFile.delete()
