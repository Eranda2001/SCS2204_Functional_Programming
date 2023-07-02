object Question3 {
  def main(args: Array[String]): Unit = {
    def toUpper(str: String): String={
      str.toUpperCase()
    }
   def toLower(str: String): String={
     str.toLowerCase()
   }

    def formatNames(names: String, index: Int): String = {
        val charToChange = names.charAt(index)
        val charModified =  charToChange.toUpper
        names.patch(index, charModified.toString, 1)
    }
    println(toUpper("Benny"))
    println(formatNames("Niroshan",1))
    println(toLower("Saman"))
    println(formatNames("Kumara",5))

  }
}
