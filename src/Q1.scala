class Rational(numerator: Int, denominator: Int){
  require(denominator!=0,"Error,Denominator can't be 0");
  var rationalNum:Double = numerator.toDouble/denominator.toDouble;
  def neg(): Unit = {
    var y = new Rational(-1*numerator,denominator);
    println("The negetive rational number is "+y.rationalNum)
  }

}

object Q1 extends App{
  var x = new Rational(5,2)

  println("The rational number is "+x.rationalNum);
  x.neg()

}
