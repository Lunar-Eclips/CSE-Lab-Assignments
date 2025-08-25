package CSE110.Assignment07;

import java.util.Scanner;

public class task04 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array 1: ");
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) 
        {
            System.out.print("Enter number: ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the length of array 2: ");
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) 
        {
            System.out.print("Enter number: ");
            arr2[i] = sc.nextInt();
        }
         boolean isSubset = true;
        for (int i = 0; i < M; i++) 
        {
            boolean found = false;
            for (int j = 0; j < N; j++) 
            {
                if (arr2[i] == arr1[j]) 
                {
                    found = true;
                    break;
                }
            }
            if (!found) 
            {
                isSubset = false;
                break;
            }
        }
        if (isSubset) 
        {
            System.out.println("Array 2 is a subset of Array 1.");
        } 
        else 
        {
            System.out.println("Array 2 is NOT a subset of Array 1.");
        }
    }
}
