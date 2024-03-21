//Charu
class Person(val name: String, val age: Int) {
  def introduce(): Unit = {
    println(s"Hi, my name is $name and I'm $age years old.")
  }
}

class Employee(name: String, age: Int, val employee_Id: String, val department: String, val salary: Double) extends Person(name, age) {
  def employee_details(): Unit = {
    println(s"I am $name. I work in $department and my employee id is $employee_Id.")
  }
}

val person = new Person("John", 30)
person.introduce()

val employee = new Employee("Alice", 25, "EMP123", "IT", 50000)
employee.introduce()
employee.employee_details()
