object Q3 {
  def main(args: Array[String]): Unit = {
    val toUpper: String => String = str => str.toUpperCase
    val toLower: String => String = str => str.toLowerCase

    val formatNames: (String, Int) => String = (names, index) => {
      val charToChange = names.charAt(index)
      val charModified = charToChange.toUpper
      names.patch(index, charModified.toString, 1)
    }

    println(toUpper("Benny"))
    println(formatNames("Niroshan", 1))
    println(toLower("Saman"))
    println(formatNames("Kumara", 5))
  }
}
