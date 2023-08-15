object Q1 {
      val Interest: Double => Double = amount => {
        if (amount <= 20000) {
          amount* 0.02
        }
        else if (amount <= 200000) {
          amount * 0.04
        }
        else if (amount <= 2000000) {
          amount* 0.035
        }
        else {
          amount* 0.065
        }
      }
      def main(args: Array[String]): Unit = {
        print("Enter the amount that interest should be calculated:  ")
        val amount = scala.io.StdIn.readInt()

        val interest = Interest(amount)
        println(s"The interest for Rs. $amount deposit is Rs. $interest")
      }
}
