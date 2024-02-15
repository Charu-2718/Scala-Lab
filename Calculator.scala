//Charu Gupta
object Calculator {
  def main(args: Array[String]): Unit = {
    println("Enter two numbers:")
    val num1 = scala.io.StdIn.readDouble()
    val num2 = scala.io.StdIn.readDouble()

    println("Select operation (+, -, *, /):")
    val operation = scala.io.StdIn.readLine()

    val result = performOperation(num1, num2, operation)
    println(s"Result: $result")
  }

  def performOperation(x: Double, y: Double, operation: String): Double = {
    val operator: (Double, Double) => Double = operation match {
      case "+" => _ + _
      case "-" => _ - _
      case "*" => _ * _
      case "/" => _ / _
      case _   => throw new IllegalArgumentException("Invalid operation")
    }

    operator(x, y)
  }
}
