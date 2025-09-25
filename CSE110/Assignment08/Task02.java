package CSE110.Assignment08;

import java.util.Scanner;
public class Task02 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        showDots(a);
        System.out.println();
        int n = sc.nextInt();
        show_palindrome(n);
        System.out.println();
        showDiamond(n);
    }
    
    public static void showDots(int num)
    {
        for(int i=0;i<num;i++)
        {
            System.out.print(".");
        }
    }

    public static void show_palindrome(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(i);
        }
        for(int i=n-1;i>=1;i--)
        {
            System.out.print(i);
        }
    }
    
    public static void showDiamond(int n)
    {
        int totalWidth=2*n-1;
        
        for(int i=1;i<=n;i++)
        {
            int numChars=2*i-1;
            int dotsEachSide = (totalWidth - numChars)/2;
            
            showDots(dotsEachSide);
            show_palindrome(i);
            showDots(dotsEachSide);
            System.out.println();
        }
        
        for(int i = n - 1; i >= 1; i--)
        {
            int numChars = 2 * i - 1;
            int dotsEachSide =(totalWidth - numChars)/2;
            
            showDots(dotsEachSide);
            show_palindrome(i);
            showDots(dotsEachSide);
            System.out.println();
        }
    }
}