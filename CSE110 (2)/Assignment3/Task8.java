import java.util.Scanner;

public class Task8{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter an integer: ");
  int n = sc.nextInt();
  
  int nonNeg = 0;
  int neg = 0;
  
  for(int i=1; i<=n; i++){
   System.out.print("Enter number " + i + ": ");
   int num = sc.nextInt();
   
   if(num >= 0){
    nonNeg++;
   } else {
    neg++;
   }
  }
  
  System.out.println(nonNeg + " Non-negative Numbers");
  System.out.println(neg + " Negative Numbers");
  
  sc.close();
 }
}
