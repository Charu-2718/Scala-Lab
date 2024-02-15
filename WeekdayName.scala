//Charu Gupta
object WeekdayName {
  def main(args: Array[String]): Unit = {
    println("Enter a weekday number (1-7): ")
    val weekdayNumber = scala.io.StdIn.readInt()

    val weekdayName = weekdayNumber match {
      case 1 => "Sunday"
      case 2 => "Monday"
      case 3 => "Tuesday"
      case 4 => "Wednesday"
      case 5 => "Thursday"
      case 6 => "Friday"
      case 7 => "Saturday"
      case _ => "Invalid weekday number"
    }

    println(s"The weekday is: $weekdayName")
  }
}
