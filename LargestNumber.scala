object LargestNumber {
  def findLargestNumber(num1: Int, num2: Int): Int = {
    if (num1 > num2) num1 else num2
  }

  def main(args: Array[String]): Unit = {
    println("Enter first number:")
    val num1 = scala.io.StdIn.readInt()

    println("Enter second number:")
    val num2 = scala.io.StdIn.readInt()

    val result = findLargestNumber(num1, num2)
    println(s"The largest number is: $result")
  }
}
