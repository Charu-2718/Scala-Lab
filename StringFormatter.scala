//Charu Gupta
object StringFormatter {
  // Convert a string to uppercase without using pre-built functions
  def toUpper(name: String): String = {
    val builder = new StringBuilder
    for (char <- name) {
      if (char >= 'a' && char <= 'z') {
        builder.append((char - 32).toChar)
      } else {
        builder.append(char)
      }
    }
    builder.toString()
  }

  // Convert a string to lowercase without using pre-built functions
  def toLower(name: String): String = {
    val builder = new StringBuilder
    for (char <- name) {
      if (char >= 'A' && char <= 'Z') {
        builder.append((char + 32).toChar)
      } else {
        builder.append(char)
      }
    }
    builder.toString()
  }

  // Reverse a string without using pre-built functions
  def reverse(name: String): String = {
    val builder = new StringBuilder
    for (i <- name.length - 1 to 0 by -1) {
      builder.append(name(i))
    }
    builder.toString()
  }

  // Format a string using a provided formatting function
  def formatNames(name: String)(formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val name = scala.io.StdIn.readLine()
    
    println("Please select an option:")
    println("1. Convert to Uppercase")
    println("2. Convert to Lowercase")
    println("3. Reverse the String")
    
    scala.io.StdIn.readInt() match {
      case 1 =>
        println("Uppercase: " + formatNames(name)(toUpper))
      case 2 =>
        println("Lowercase: " + formatNames(name)(toLower))
      case 3 =>
        println("Reversed: " + formatNames(name)(reverse))
      case _ =>
        println("Invalid option selected.")
    }
  }
}