//Charu Gupta
object NumberFilter {
  def main(args: Array[String]): Unit = {
    val numbers = List(-2, -1, 0, 1, 2, 3, 4, 5, 6)

    println("Filtered even numbers: " + filterList(numbers, isEven))
    println("Filtered odd numbers: " + filterList(numbers, isOdd))
    println("Filtered positive numbers: " + filterList(numbers, isPositive))
    println("Filtered negative numbers: " + filterList(numbers, isNegative))
    println("Filtered zero: " + filterList(numbers, isZero))
  }

  def isEven(num: Int): Boolean = num % 2 == 0
  def isOdd(num: Int): Boolean = num % 2 != 0
  def isPositive(num: Int): Boolean = num > 0
  def isNegative(num: Int): Boolean = num < 0
  def isZero(num: Int): Boolean = num == 0

  def filterList(numbers: List[Int], filterFunction: Int => Boolean): List[Int] = {
    numbers.filter(filterFunction)
  }
}
