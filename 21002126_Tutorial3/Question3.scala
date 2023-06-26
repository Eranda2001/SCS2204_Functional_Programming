package Lab3

object Question3 {
  def main(args:Array[String]): Unit={
    print("Enter num1: ");
    val num1= scala.io.StdIn.readInt();
    print("Enter num2: ");
    val num2= scala.io.StdIn.readInt();
    def average(n1:Int, n2:Int)={
      val value=BigDecimal((n1+n2)/2.0);
      value.setScale(2);
    }
    println("Mean of the two numbers: "+ average(num1,num2));
  }
}
