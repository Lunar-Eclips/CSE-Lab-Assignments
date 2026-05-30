public class ComplexNumber extends RealNumber{
 public double imaginaryValue;

 public ComplexNumber(){
  super(1.0);
  this.imaginaryValue = 1.0;
 }

 public ComplexNumber(double realValue, double imaginaryValue){
  super(realValue);
  this.imaginaryValue = imaginaryValue;
 }

 public String details(){
  return getReal() + "\nImaginaryPart: " + imaginaryValue;
 }
}
