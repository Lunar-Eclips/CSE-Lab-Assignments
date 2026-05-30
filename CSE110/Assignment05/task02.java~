import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        // First line
        System.out.println(row);

        // other lines
        for (int row_count = row - 1; row_count >= 2; row_count--) 
        {
            System.out.print(row_count);
            for (int space_counter = 1; space_counter <= row - row_count - 1; space_counter++) {
                System.out.print(" ");
            }
            System.out.println(row);
        }

        // Last line
        if (row > 1) 
        {
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
