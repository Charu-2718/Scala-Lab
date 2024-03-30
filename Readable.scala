// Question 4
// Charu gUpta
trait Readable {
  def read(): Unit
}

// Trait for Writable
trait Writable {
  def write(data: String): Unit
}

// Trait for Erasable
trait Erasable {
  def erase(): Unit
}

// Class File extending Readable, Writable, and Erasable traits
class File extends Readable with Writable with Erasable {
  private var content: String = ""

  // Implementation of read method
  def read(): Unit = {
    println("Reading file content:")
    println(content)
  }

  // Implementation of write method
  def write(data: String): Unit = {
    println("Writing to file:")
    content = data
  }

  // Implementation of erase method
  def erase(): Unit = {
    println("Erasing file content")
    content = ""
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val file = new File()

    // Using read method
    file.read()

    // Using write method
    file.write("This is some sample text.")

    // Using read method after writing
    file.read()

    // Using erase method
    file.erase()

    // Using read method after erasing
    file.read()
  }
}
