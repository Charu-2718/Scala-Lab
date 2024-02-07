object ValVar{
  def main(args: Array[String]): Unit = {
    // Declaring a val
    val pi: Double = 3.14159
    println("Value of pi: " + pi)

    // Declaring a var
    var counter: Int = 0
    println("Initial counter value: "+ counter)

    // Reassigning the var
    counter = counter + 1
    println("Updated counter value: "+counter)
  }
}
