import java.util.Scanner;
import java.util.Arrays;

public class array_prac2
{
public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  int [] arr1= {5,25,7,49,8,64,6,36};
  
  for (int i=0;i<arr1.length-1;i++)
   {
    int minIndex=i;
    
    for (int j=i+1;j<arr1.length;j++ )
     {
      
      if (arr1[j]<arr1[minIndex])
      {
        minIndex=j;
      }
     }
          
      int temp = arr1[minIndex];
      arr1[minIndex] = arr1[i];
      arr1[i] = temp;
      
   }
  
  System.out.print(Arrays.toString(arr1));
 }
}