object Q1 {
  def main(args: Array[String]): Unit = {
    val num = new Rational(3, 1)
    println(s"x = $num")

    val negativeVal = num.neg
    println(s"Negative x = $negativeVal")
  }
}
