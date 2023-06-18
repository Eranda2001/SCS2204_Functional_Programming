package Demo

object Demo {
  def main(args:Array[String]):Unit={
    def Spectators(price :Int): Int=((15-price)/5)*20+ 120
    def Revenue(price :Int): Int= Spectators(price)* price
    def Cost(price: Int): Int= Spectators(price)*3+ 500
    def Profit(price: Int): Int= Revenue(price)- Cost(price)
    printf("Enter the Price: ")
    var price= scala.io.StdIn.readInt()//Getting ticket price as a user input

    printf("Final Profit for ticket price %d is: Rs. %d", price, Profit(price))
  }
}
