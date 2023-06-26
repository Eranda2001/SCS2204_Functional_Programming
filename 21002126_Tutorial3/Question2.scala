package Lab3

object Question2 {
  def main(args:Array[String]):Unit={
    print("Enter number of values: ");
    val num:Int= scala.io.StdIn.readInt();
    var list1: List[String]= List();
    for(x <- 1 to num){
      val str=scala.io.StdIn.readLine("Enter the string: ");
      if(str.length>5){
        list1= list1 ++ Array(str);
      }
    }
    println(list1);

  }

}
