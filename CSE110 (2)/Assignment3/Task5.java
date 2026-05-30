import java.util.Scanner;

public class Task5{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter the N-digit vault code: ");
  int code = sc.nextInt();
  
  int temp = code;
  int digits = 0;
  
  while(temp > 0){
   temp = temp / 10;
   digits++;
  }
  
  int divider = 1;
  for(int i=1; i<digits; i++){
   divider = divider * 10;
  }
  
  for(int i=1; i<=digits; i++){
   int digit = code / divider;
   System.out.print(digit);
   code = code % divider;
   divider = divider / 10;
   if(i < digits){
    System.out.print(", ");
   }
  }
  
  sc.close();
 }
}
