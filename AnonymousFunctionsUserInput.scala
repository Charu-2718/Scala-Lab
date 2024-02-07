object AnonymousFunctionsUserInput {
  def main(args: Array[String]): Unit = {
    println("Enter two numbers:")
    val num1 = scala.io.StdIn.readInt()
    val num2 = scala.io.StdIn.readInt()

    val add = (_: Int) + (_: Int)
    val sub = (_: Int) - (_: Int)
    val mul = (_: Int) * (_: Int)

    println("Addition: " + add(num1, num2))
    println("Subtraction: " + sub(num1, num2))
    println("Multiplication: " + mul(num1, num2))
  }
}
