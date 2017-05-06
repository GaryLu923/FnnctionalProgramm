package sum

/**
  * Created by gary.lu on 2017/4/22.
  *  Practice for currying
  */
object Main {
  def main(args: Array[String]) {
    println("sumMethod:" +sumMethod(p=>p*p)(f=>f)(3,5))
  }
  def sumMethod(p :Long=>Long)(f:String=>String)(number1:Long,number2:Long): Long =
    if(number2<=number1)0
    else p(number1)+
      sumMethod(p)(f)(number1+2,number2)
  def sumProduct(int: Int):Long= sumMethod(int=>int*int)(f=>f)(3,5)
  //TODO implement sqrt method
//  def sqrt(y:Double)=

  def square(x:Long)=x*x


}
