package CSE110.Assignment07;
    import java.util.Scanner;
    import java.util.Arrays;

public class task02 
{
     public static void main(String[]args)
    {
    System.out.print("Enter N ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num=0;
        int[] arr1 = new int[N];
        boolean same = false;
        for (int i = 0; i < N; i++) 
        {
            System.out.print("Enter the number ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the search number ");
        int last=sc.nextInt();
        for (int j = 0; j <= N; j++)
            {
             if (last== arr1[j]) 
             {
                same = true;
                num =j;
                break;
             }
            }
            if (same)
             {
              System.out.println(last+ " is at index "+num);
             }
        if (same==false)
             {
                System.out.println("Element not found");
             }
    }

}