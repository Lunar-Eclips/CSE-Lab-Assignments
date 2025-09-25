package CSE110.Assignment09;

import java.util.Scanner;
public class Task01 
{
 public static void main (String[] args)
 {

  Scanner sc= new Scanner(System.in);
  System.out.print("Enter the value of n ");
  int n = sc.nextInt();
  int x =factorial(n); 
  System.out.println(x); 
  
}    
public static int factorial(int n) 
{
        if (n == 0 || n == 1) 
        {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
