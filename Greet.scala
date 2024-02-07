object Greet {
  def wishGoodMorning(name: String = "Guest"): Unit = {
    println(s"Good morning, $name!")
  }

  def main(args: Array[String]): Unit = {
    println("Enter your name:")
    val userName = scala.io.StdIn.readLine()

    wishGoodMorning(userName)
  }
}
