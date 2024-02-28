//Charu Gupta
class Triangle {
  val side1: Int = 3
  val side2: Int = 4
  val side3: Int = 5

  val area: Double = {
    val s = (side1 + side2 + side3) / 2.0
    math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
  }

  val perimeter: Int = side1 + side2 + side3
}

val triangleObj = new Triangle

println(s"Area: ${triangleObj.area}, Perimeter: ${triangleObj.perimeter}")


