import java.util.Scanner;

public class task3{
  public static void main (String [] args ){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter number of days: ");
  int days = sc.nextInt();
  
  for (int i = 1; i <= days; i++){
    System.out.println("Enter sales for Day " + i + ": ");
    double p1 = sc.nextDouble();
    double p2 = sc.nextDouble();
    double p3 = sc.nextDouble();
    
    double total = p1 + p2 + p3;
    double tax = 0;
    
    if (total >= 500) {
      tax = total * 0.10;
    } else if (total >= 200) {
      tax = total * 0.05;
    } else if (total >= 100) {
      tax = total * 0.02;
    }
    
    double finalTotal = total + tax;
    System.out.println("Day " + i + ": Total Sales with Tax: " + finalTotal);
  }
  } 
}