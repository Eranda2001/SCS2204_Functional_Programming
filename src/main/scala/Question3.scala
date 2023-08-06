object Question3 {
  def filterPrime(num: List[Int]): List[Int] = {
    val isPrime: Int => Boolean = n => {
      def isprime(rem: Int): Boolean = {
        if (rem * rem > n) true
        else if (n % rem == 0) false
        else isprime(rem + 1)
      }
      if (n <= 1) false
      else if (n == 2) true
      else isprime(2)
    }
    num.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    print("Enter number list separated by a comma: ")
    val input = scala.io.StdIn.readLine()
    val num: List[Int] = input.split(",").map(_.toInt).toList

    val filteredList = filterPrime(num)
    println(filteredList)
  }
}
