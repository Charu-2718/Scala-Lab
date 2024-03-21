//Charu
object Counter {
  private var count: Int = 0
  
  def increment(): Unit = {
    count += 1
  }
  
  def decrement(): Unit = {
    count -= 1
  }
  
  def getCount: Int = count
}


Counter.increment()
Counter.increment()
Counter.increment()
println("Current count: " + Counter.getCount)  
Counter.decrement()
println("Current count after decrement: " + Counter.getCount)  
