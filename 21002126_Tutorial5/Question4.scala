object Question4 {
  def main(args: Array[String]): Unit = {
    def Classify(num:Int):Int={
      if (num==0) 0
      else if ((num==1)|| (num== -1)) 1
      else Classify(num%2)
    }
    print("Enter the number: ")
    var num= scala.io.StdIn.readInt()
    if(Classify(num)==1) print("Odd")
    else print("Even")
  }
}
