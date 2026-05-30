import java.util.Scanner;
public class task07
{
    public static void main(String[] args)
    { // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the hourglass: ");
        int row = sc.nextInt();

        // Upper part 
        for (int row_count = row; row_count >= 1; row_count--)
        {
            // spaces before numbers
            for (int space_counter = 1; space_counter <= row - row_count; space_counter++)
            {
                System.out.print(" ");
            }
            // ascending numbers
            for (int num = 1; num <= row_count; num++)
            {
                System.out.print(num);
            }
            // descending numbers
            for (int num = row_count - 1; num >= 1; num--)
            {
                System.out.print(num);
            }
            System.out.println();
        }

        // Lower part 
        for (int row_count = 2; row_count <= row; row_count++)
        {
            // spaces before numbers
            for (int space_counter = 1; space_counter <= row - row_count; space_counter++)
            {
                System.out.print(" ");
            }
            // ascending numbers
            for (int num = 1; num <= row_count; num++)
            {
                System.out.print(num);
            }
            // descending numbers
            for (int num = row_count - 1; num >= 1; num--)
            {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
