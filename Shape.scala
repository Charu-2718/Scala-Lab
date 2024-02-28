//Charu Gupta
abstract class Shape {
  def draw(): Unit
}

class Circle extends Shape {
  override def draw(): Unit = println("Drawing Circle")
}

class Rectangle extends Shape {
  override def draw(): Unit = println("Drawing Rectangle")
}

class Triangle extends Shape {
  override def draw(): Unit = println("Drawing Triangle")
}

val circleObj = new Circle
circleObj.draw()

val rectangleObj = new Rectangle
rectangleObj.draw()

val triangleObj = new Triangle
triangleObj.draw()
