class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator should not be 0")

  private val value: Int = gcd(n.abs, d.abs)
  val numerator: Int = n / value
  val denominator: Int = d / value

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational = new Rational(-numerator, denominator)

  def sub(that: Rational): Rational = {
    new Rational(numerator * that.denominator - that.numerator * denominator, denominator * that.denominator)
  }

  override def toString: String = s"$numerator/$denominator"
}

object Q2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y).sub(z)
    println(s"x- y- z = $result")
  }
}
