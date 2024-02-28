//Charu Gupta
import scala.io.StdIn
class Student(var name: String, var roll_no: Int)

print("Enter your name: ")
val enteredName = StdIn.readLine()

print("Enter your roll number: ")
val enteredRollNo = StdIn.readInt()

val studentObj = new Student(enteredName, enteredRollNo)
println(s"Name: ${studentObj.name}, Roll No: ${studentObj.roll_no}")


