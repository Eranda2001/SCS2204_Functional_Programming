object Question1 {
  def main (args:Array[String]):Unit= {
    def interest(amount: BigDecimal): BigDecimal= amount match{
      case amount if amount<=20000 => amount*0.02
      case amount if amount<=200000 => amount*0.04
      case amount if amount<=2000000 => amount*0.035
      case _=> amount*0.065
    }
    print("Enter the amount: ")
    var amount: BigDecimal= scala.io.StdIn.readInt()
    amount.setScale(2)
    println("The interest for give value: Rs. "+interest(amount));
  }
}
