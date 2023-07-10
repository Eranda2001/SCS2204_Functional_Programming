object Question1 {
  def main(args: Array[String]): Unit = {
    print("Enter the number to check: ")
    val n= scala.io.StdIn.readInt()
    println(prime(n))
  }

  def prime(num: Int, i: Int = 2): Boolean = {
    //println(num)
    //println(i)
    if (num <= 1) {
      false
    }
    else if (i>=num) {
      true
    }
    else if (num%i==0) {
      false
    }
    else prime(num, i + 1)
  }

}
