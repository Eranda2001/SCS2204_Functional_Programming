object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter the number to match: ")
    val str= scala.io.StdIn.readLine()
    val value= str.toInt

    val oddEven: Int => String = num => num match {
      case n if n <= 0 => "Number is negative or zero"
      case n if n % 2 == 0 => "Number is even"
      case n => "Number is odd"
    }

    val classify = oddEven(value)
    println(classify)
  }
}
