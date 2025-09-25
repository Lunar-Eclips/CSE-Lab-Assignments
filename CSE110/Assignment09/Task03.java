package CSE110.Assignment09;

import java.util.Scanner;
public class Task03 
{
    public static void main (String[] args)
    {
        // Enter the array here
        int [] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the the index ");
        int index = sc.nextInt();
        print_elements(arr, index);
        
    }

    public static void print_elements(int[] arr, int index) 
    {

        if (index >= arr.length) 
        {
            return;
        }

        System.out.println(arr[index]);
        print_elements(arr, index + 1);
    }

}
