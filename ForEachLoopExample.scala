object ForEachLoopExample {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)


    numbers.foreach { num =>
     
      val square = num * num
      println(s"The square of $num is: $square")
    }
  }
}
