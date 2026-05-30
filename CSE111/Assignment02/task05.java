import java.util.Scanner;
public class task05{
  public static void main ( String [] args ){
  Scanner sc = new Scanner (System.in);
  
  System.out.println("Enter the amount the customer need to pay(Taka)");
  int bill = sc.nextInt();
  
  System.out.println("Enter the amount, customer gave(Taka)");
  int input = sc.nextInt();
  
  if ( bill > input ){
   System.out.println("Please pay " + (bill - input) + " taka more.");
  } else {
   int change = input - bill;
   System.out.println("The returned amount is " + change + " taka.");
   
   int hundred = change / 100;
   change = change % 100;
   
   int fifty = change / 50;
   change = change % 50;
   
   int twenty = change / 20;
   change = change % 20;
   
   int ten = change / 10;
   change = change % 10;
   
   int five = change / 5;
   change = change % 5;
   
   int two = change / 2;
   change = change % 2;
   
   int one = change;
   
   System.out.println("100 taka note: " + hundred);
   System.out.println("50 taka note: " + fifty);
   System.out.println("20 taka note: " + twenty);
   System.out.println("10 taka note: " + ten);
   System.out.println("5 taka coin: " + five);
   System.out.println("2 taka coin: " + two);
   System.out.println("1 taka coin: " + one);
  }
  }
}
