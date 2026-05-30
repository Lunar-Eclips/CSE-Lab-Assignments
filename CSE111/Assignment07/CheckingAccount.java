public class CheckingAccount extends Account{
  public static int count;
  public CheckingAccount(){
  this(0.0);
  }
  public CheckingAccount(double input){
   super(input);
   count++;
  }
}