object AnonymousFunctions {
  def main(args: Array[String]): Unit = {
    val add = (a: Int, b: Int) => a + b
    val sub = (a: Int, b: Int) => a - b
    val mul = (a: Int, b: Int) => a * b

    println("Addition: " + add(5, 3))
    println("Subtraction: " + sub(5, 3))
    println("Multiplication: " + mul(5, 3))
  }
}
