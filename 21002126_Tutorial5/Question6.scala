object Question6 {
  def main(args: Array[String]): Unit = {
    def fibonacci(n:Int):Int= {
      if (n<=1) n
      else fibonacci(n-1)+ fibonacci(n-2)
    }
    print("Enter the number: ")
    val num= scala.io.StdIn.readInt()
    for (i <- 1 to num){
      println(s"Fibonacci number ${i}: "+fibonacci(i))
    }
  }
}
