//Charu
object SumDigits {
  def sumDigits(num: Double): Int = {
    val numStr = num.abs.toString
    def sumDigitsHelper(str: String): Int = {
      if (str.isEmpty) {
        0
      } else if (str.head == '.') {
        sumDigitsHelper(str.tail)
      } else {
        val digit = str.head.asDigit
        digit + sumDigitsHelper(str.tail)
      }
    }

    sumDigitsHelper(numStr)
  }
}

println(SumDigits.sumDigits(12.5))  
