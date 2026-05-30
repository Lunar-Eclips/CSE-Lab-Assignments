//Task 6
import java.util.Scanner;
public class task6{
 public static void main(String[] args) {
 
   Scanner sc = new Scanner(System.in);
 System.out.println("Enter first Number");
 int num1 = sc.nextInt();
 System.out.println("Enter second Number");
 int num2 = sc.nextInt();
 System.out.println("Enter third Number");
 int num3 = sc.nextInt();
 if (num1==num2 && num2==num3)
 {
 System.out.println("All numbers are equal");
 } else if (num1==num2 || num2==num3) {
 System.out.println("Neither all are equal or different");
 }
 else
 {
   System.out.println("All numbers are not different");
 }
 
} 
}
