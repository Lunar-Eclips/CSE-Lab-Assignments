package CSE110.Assignment07;

import java.util.Array;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        System.out.print("Enter the length of the Array ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr1 = new double[N];
        double sum = 0;
        for (int i = 0; i < N; i++) 
        {
            System.out.print("Enter the number ");
            arr1[i] = sc.nextDouble();
            sum += arr1[i];
        }
        double max = arr1[0];
        double min = arr1[0];
        int max_index = 0;
        int min_index = 0;
        for (int j = 0; j < N; j++) 
        { if (j == N-1)
            {
                break;
            }
            if (arr1[j] > max) 
            {
                max = arr1[j];
                max_index = j;
            }

            if (min > arr1[j] ) 
            {
                min = arr1[j];
                min_index = j;
            }
        }
            double avg = sum / N;
            System.out.println("Maximum element " + max + " at " + max_index);
            System.out.println("Minimum element " + min + " at " + min_index);
            System.out.println("Summation:" + sum);
            System.out.println("Average:" + avg);
    }
}
