package Demo

object Demo {
  def main(args:Array[String]):Unit={
    def Normal(normal_hours: Int): Double= normal_hours*250//Normal Hours income
    def OT(ot_hours: Int): Double= ot_hours*80// OT Hours income
    def Total_Salary(normal_hours: Int, ot_hours: Int): Double= Normal(normal_hours)+ OT(ot_hours)// Total Income
    def Tax(normal_hours: Int, ot_hours: Int): Double= 0.12*Total_Salary(normal_hours: Int, ot_hours: Int)//Tax payable
    def Take_Home_Salary(normal_hours: Int, ot_hours: Int)= Total_Salary(normal_hours: Int, ot_hours: Int)- Tax(normal_hours: Int, ot_hours: Int)//Final Salary

    printf("Take home salary is: Rs. %.2f", Take_Home_Salary(40, 30))
  }
}
