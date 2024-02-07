object EvenOdd {
  def main(args: Array[String]): Unit = {
    val nums = (0 to 30).toList
    println("Original list:")
    println(nums)

    val even_nums = nums.filter(_ % 2 == 0)
    println("Even numbers of the said list:")
    println(even_nums)

    val odd_nums = nums.filter(_ % 2 != 0)
    println("Odd numbers of the said list:")
    println(odd_nums)
  }
}
