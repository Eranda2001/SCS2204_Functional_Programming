package Lab3

object Question1 {
  def main(args:Array[String]):Unit={
    val string1= scala.io.StdIn.readLine("Enter the String: ");
    def reverseString(s: String):String={
      if(s.length<=1){
        s
      }else{
        reverseString(s.tail)+s.head;
      }
    }
    printf("Reversed string: %s", reverseString((string1)));
  }
}
