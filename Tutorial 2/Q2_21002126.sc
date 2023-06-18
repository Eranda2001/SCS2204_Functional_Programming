package Demo

object Demo {
  def main(args:Array[String]):Unit={
    var a=2
    var b=3
    var c=4
    var d=5
    var k=4.3f
    var g=1

    //Prefix operators are not a part of Scala syntax
    b-=1//Prefix Operation
    println(b*a + c*d)
    d-=1// Postfix operation
    println(a)
    a+=1
    println(-2*(g-k) +c)//g is not given in the question. Considered to be 1
    println(c==c)
    c+=1//c++ operation
    c+=1//++c operation
    println(c== c*a)
    a+=1//a++ operation

  }
}
