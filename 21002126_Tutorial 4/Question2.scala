object Question2 {
  def main(args: Array[String]): Unit = {
    def compare(value: Int): String= value match{
      case value if value<=0 => "Negative/Zero Number"
      case value if value%2==0 => "Even Number"
      case _=> "Odd Number"
    }
    print("Enter the number: ");
    var value= scala.io.StdIn.readInt();
    println("Entered number is a "+compare(value))
  }
}
