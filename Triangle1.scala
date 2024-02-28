//Charu Gupta
class Triangle1(side1: Double, side2: Double, side3: Double) {
  def this() = this(3, 4, 5)

  val area: Double = {
    val s = (side1 + side2 + side3) / 2.0
    math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
  }

  val perimeter: Double = side1 + side2 + side3
}

val triangleObj = new Triangle1()

println(s"Area: ${triangleObj.area}, Perimeter: ${triangleObj.perimeter}")

