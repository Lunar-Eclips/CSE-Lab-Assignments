package CSE110.Assignment07;
import java.util.Scanner;
import java.util.Arrays;


public class task01 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the number of input ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        
        for (int i = 0; i < N; i++) 
        {
            System.out.print("Enter the number ");
                arr1[i] = sc.nextInt();
            if (arr1[i] > 0) 
            {
                arr2[i] = 1;
            }
            else
            {
                arr2[i] = 0;
            }
        }
        
        System.out.println(Arrays.toString(arr2));
    }    
}
