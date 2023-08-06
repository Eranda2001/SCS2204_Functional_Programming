object Question2 {
  def calculateSquare(num: List[Int]): List[Int] = {
    num.map(x => x*x)
  }

  def main(args: Array[String]): Unit = {
    print("Enter number list seeperated by a comma: ")
    val input = scala.io.StdIn.readLine()
    val num: List[Int] = input.split(",").map(_.toInt).toList

    val squareList= calculateSquare(num)

    println(squareList)
  }
}
