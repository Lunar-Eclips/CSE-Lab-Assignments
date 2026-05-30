public class MoneyTracker{
 public String name;
 public double balance;
 public double lastIncome;
 public double lastExpense;

 public MoneyTracker(){
  System.out.println("A new money tracker has been launched.");
  this.balance = 0.0;
 }

 public void createTracker(String name){
  this.name = name;
  this.balance = 1.0;
 }

 public void income(double amount){
  this.balance += amount;
  this.lastIncome = amount;
  System.out.println("Balance Updated!");
 }

 public void expense(double amount){
  if(amount > this.balance){
   System.out.println("Not enough balance.");
  }
  else{
   this.balance -= amount;
   this.lastExpense = amount;
   if(this.balance == 0){
    System.out.println("You're broke!");
   }
   else{
    System.out.println("Balance Updated.");
   }
  }
 }

 public void showHistory(){
  System.out.println("Last added: " + this.lastIncome);
  System.out.println("Last spent: " + this.lastExpense);
 }

 public String info(){
  return "Name: " + this.name + "\nCurrent Balance: " + this.balance;
 }
}
