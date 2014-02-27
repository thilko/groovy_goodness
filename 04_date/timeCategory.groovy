import groovy.time.*

use(TimeCategory){
  // durations
  def releaseDate = (3.years + 3.months + 15.days)
 
  println releaseDate
  println 1.day.ago
  println 1.day.ago + releaseDate

  // from now
  println 1.week.from.now.toString()

}
