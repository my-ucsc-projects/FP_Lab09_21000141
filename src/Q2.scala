class Rational(num: Int, den: Int){
  require(denominator!=0,"Error,Denominator can't be 0");
  var numerator: Int = num
  var denominator: Int = den
  var rationalNum:Double = numerator.toDouble/denominator.toDouble;
  
  def sub(rationalVal:Rational): Rational = {
    var d = denominator * (rationalVal.denominator);
    var a = numerator*rationalVal.denominator;
    var b = denominator*rationalVal.numerator;

    var answer = new Rational(a-b,d);
    return answer
  }

}

object Q2  extends App{
  var x = new Rational(3,4)
  var y = new Rational(5,8)
  var z = x.sub(y);
  println("The Answer rational number is "+z.rationalNum);

}
