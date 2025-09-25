import java.util.Scanner;
import java.util.Arrays;
public class array_practice
{
public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  int [] arr1=new int[10];
  int [] arr2=new int[5]; //odd
  int [] arr3=new int[5]; //even
  int odd_count=0;
  int even_count=0;
  for (int i=0;i<10;i++)
   {
    int n=sc.nextInt();
    arr1[i]=n;
    if (n%2==0)
     {
      arr3[even_count]=n;
      even_count++;
     }
    else
     {
      arr2[odd_count]=n;
      odd_count++;
     }
   }
          // Create final array of size (odd_count + even_count)
        int[] arr4 = new int[odd_count + even_count];

        // Copy odds first
        for (int i = 0; i < odd_count; i++) 
        {
            arr4[i] = arr2[i];
        }

        // Copy evens after odds
        for (int i = 0; i < even_count; i++) 
        {
            arr4[odd_count + i] = arr3[i];
        }

        // Print final array
        System.out.println("Final array (odds first, then evens): " + Arrays.toString(arr4));
 }
}