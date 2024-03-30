// Question 3
// Charu Gupta
// Define a trait for student records
trait StudentRecords {
  var name: String = _
  var department: String = _
  var roll: Int = _
  var subjectName: String = _
  var marks: Int = _

  def displayMarks(): Unit = {
    println(s"Marks for $name in $subjectName: $marks")
  }
}

// Define a trait for student projects
trait StudentProject {
  var projectName: String = _
  var projectCredit: Int = _
  var projectMarks: Int = _
  var status: String = _

  def projDetails(): Unit = {
    println(s"Project: $projectName, Marks: $projectMarks, Status: $status")
  }
}

// Define a class for student details inheriting from StudentRecords
class StudentDetails extends StudentRecords with StudentProject {
  // Method to find the student with the highest marks
  def findTopScorer(students: Seq[StudentDetails]): String = {
    val topStudent = students.maxBy(_.marks)
    s"Top Scorer: ${topStudent.name}, Marks: ${topStudent.marks}"
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    // Example usage
    val student1 = new StudentDetails {
      name = "John"
      department = "Computer Science"
      roll = 1
      subjectName = "Math"
      marks = 90
      projectName = "Scala Project"
      projectCredit = 10
      projectMarks = 8
      status = "Pass"
    }

    val student2 = new StudentDetails {
      name = "Alice"
      department = "Electrical Engineering"
      roll = 2
      subjectName = "Physics"
      marks = 95
      projectName = "Java Project"
      projectCredit = 8
      projectMarks = 7
      status = "Fail"
    }

    val students = Seq(student1, student2)

    // Display marks of individual students
    students.foreach(_.displayMarks())

    // Display project details of individual students
    students.foreach(_.projDetails())

    // Find the student with the highest marks
    println(student1.findTopScorer(students))
  }
}
