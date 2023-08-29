object Q1 {
  def calculateAverage(Celsius: List[Double]): Double = {
    val Fahrenheit = Celsius.map(celsius => (celsius * 9 / 5) + 32)
    val totalFahrenheit = Fahrenheit.reduce(_ + _)
    val averageFahrenheit = totalFahrenheit / Fahrenheit.length
    averageFahrenheit
  }
  def main(args: Array[String]): Unit = {
    val Celsius: List[Double] = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(Celsius)
    println(s"Average temperature in fahrenheits: $averageFahrenheit")
  }
}
