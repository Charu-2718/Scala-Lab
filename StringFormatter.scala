//Charu Gupta
object StringFormatter {
  def main(args: Array[String]): Unit = {
    println("Enter a name:")
    val inputName = scala.io.StdIn.readLine()

    val formattedName = formatNames(inputName, toUpper)
    println(s"To Upper: $formattedName")

    val formattedName2 = formatNames(inputName, toLower)
    println(s"To Lower: $formattedName2")

    val formattedName3 = formatNames(inputName, reverse)
    println(s"Reversed: $formattedName3")
  }

  def toUpper(str: String): String = str.toUpperCase
  def toLower(str: String): String = str.toLowerCase
  def reverse(str: String): String = str.reverse

  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }
}
