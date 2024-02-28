//Charu Gupta
class Area(length: Double, breadth: Double) {
  def returnArea(): Double = length * breadth
}

print("Enter length: ")
val length = scala.io.StdIn.readDouble()

print("Enter breadth: ")
val breadth = scala.io.StdIn.readDouble()

val rectangleObj = new Area(length, breadth)

println(s"Area of the rectangle: ${rectangleObj.returnArea()}")
