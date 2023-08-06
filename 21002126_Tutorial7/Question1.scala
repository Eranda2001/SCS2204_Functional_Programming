object Question1 {
  def filterEvenNumbers(num: List[Int]): List[Int]={
    num.filter(x => x%2 == 0)
  }

  def main(args: Array[String]): Unit = {
    print("Enter number list seeperated by a comma: ")
    val input = scala.io.StdIn.readLine()
    val num: List[Int] = input.split(",").map(_.toInt).toList

    val filteredList= filterEvenNumbers(num)

    println(filterEvenNumbers(filteredList))

  }
}
