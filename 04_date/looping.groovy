def today = new Date()

today.upto(today + 7){
  println it
}

today.downto(today - 7){
  println it.format("EEEE")
}

