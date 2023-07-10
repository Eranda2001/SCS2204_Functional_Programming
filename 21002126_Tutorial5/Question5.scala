object Question5 {
  def main(args: Array[String]): Unit = {

    def sumofEven(n:Int): Int = {
      if (n==0 || n==1) 0
      else if (n%2==0) n-2+ sumofEven(n-2)
      else n-1+ sumofEven(n-1)
    }
    print("Enter the number: ")
    val num= scala.io.StdIn.readInt()
    println("Sum of the even numbers: "+ sumofEven(num))
  }
}
