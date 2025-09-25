import java.util.Scanner;
import java.util.Arrays;
public class array_task1
{
public static void main(String[]args)
 {
  Scanner sc = new Scanner(System.in);
  int [] arr= new int [10];
  for (int i =0;i<10;i++)
  {
    System.out.print("Enter the number");
    int n=sc.nextInt();
    arr[i]=n;
  }
  System.out.print(Arrays.toString(arr));
 }
}