package CSE110.Assignment08;

import java.util.Scanner;

public class Task01 
{
public static void main(String[]args)
 {
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter number for checking prime");
 int n =sc.nextInt();
 boolean check=isPrime(n);
 System.out.println(check);
  System.out.println("Enter number for checking perfect");
 int m =sc.nextInt();
 boolean check2=isPerfect(m);
 System.out.println(check2);
 System.out.println("Enter number for sum");
  int p =sc.nextInt();
  System.out.print(special_sum(p));

 }

 public static boolean isPrime(int num)
 {
 if (num <= 1)
  {
    return false;
  }
  else
  {
    for (int i=2; i<=Math.sqrt(num); i++)
    {
      if (num % i == 0)
      {
        return false;
      }
    }
    return true;
  }
 }

 public static boolean isPerfect(int num)
 {
  if (isPrime(num)==true)
  {
    return false;
  }
  else
  {
   int sum=0;
   for (int i=1; i<=num/2;i++)
   {
    if (num%i==0)
    {
        sum+=i;
    }
   }
   if (sum==num)
   {
    return true;
   }
   else
   {
    return false;
   }

  }
 }

 public static int special_sum(int num)
 {
    int sum_prime=0;
    int sum_perfect=0;
    for (int i=0; i<=num; i++)
    {
        if (isPrime(i))
        {
            sum_prime+=i;
        }
        if (isPerfect(i))
        {
            sum_perfect+=i;
        }
    }
    return sum_prime+sum_perfect;
 }

}
