import java.util.Scanner;

public class task03 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: "); 
        int row = sc.nextInt();

        // Upper part
        for (int row_count = 1; row_count < row; row_count++) 
        {
            for (int space_counter = 1; space_counter <= row - row_count; space_counter++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= 2 * row_count - 1; num++) {
                if (num == 1 || num == 2 * row_count - 1) {
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Base part
        for (int num = 1; num <= 2 * row - 1; num++) {
            System.out.print(num);
        }
        System.out.println();
    }
}