object Question2 {
  def main(args: Array[String]): Unit = {
    def prime(num: Int, i: Int = 2): Boolean = {
      //println(num)
      //println(i)
      if (num <= 1) {
        false
      }
      else if (i >= num) {
        true
      }
      else if (num % i == 0) {
        false
      }
      else prime(num, i + 1)
    }
    print("Enter the number: ")
    var n= scala.io.StdIn.readInt()
    print("Prime numbers: ")
    for(a <- 1 to n){
      //var v= prime()
      if(prime(a)){
        printf("%d ", a)
      }
    }
  }
}
