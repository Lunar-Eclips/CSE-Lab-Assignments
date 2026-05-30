import java.util.Scanner;

public class Task4{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter an integer number: ");
  int num = sc.nextInt();
  
  while(num > 0){
   int digit = num % 10;
   System.out.print(digit);
   num = num / 10;
   if(num > 0){
    System.out.print(", ");
   }
  }
  
  sc.close();
 }
}
