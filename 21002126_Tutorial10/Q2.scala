object Q2 {
  def Count(words: List[String]): Int = {
    val letterCount = words.map(word => word.length)
    val total = letterCount.reduce(_ + _)
    total
  }
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val total = Count(words)
    println(s"Total count of letter occurrences: $total")
  }
}
