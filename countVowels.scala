//Charu
def countVowels(str: String): Int = {
  str.toLowerCase.count(c => "aeiou".contains(c))
}


val words = List("Scala", "is", "a", "functional", "programming", "language")


for (word <- words) {
  val numVowels = countVowels(word)
  println(s"Number of vowels in '$word': $numVowels")
}
