object Question3 {
  def main(args: Array[String]): Unit = {
    print("Enter the number: ")
    var n= scala.io.StdIn.readInt()
    def Sum(n: Int):Int= {
      if(n>=0) n+Sum(n-1)
      else 0
    }
    println("Sum up to the given number: "+Sum(n))

  }
}
