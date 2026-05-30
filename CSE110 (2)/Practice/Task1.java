import java.util.Scanner;

public class Task1 {
// Char numbers go in and int numbers return 
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int totalX = 0;
        int totalY = 0;

        //only used to gather elements of x
        boolean isPositive = true;
        int coefficient = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '-') {
                isPositive = false;
                coefficient = 0;
            } else if (currentChar == '+') {
                isPositive = true;
                coefficient = 0;
            } else if (currentChar >= '0' && currentChar <= '9') {
                int digit = currentChar - 48; 
                coefficient = coefficient * 10 + digit;
            } else if (currentChar == 'x') {
                int magnitude = (coefficient == 0) ? 1 : coefficient;
                if (isPositive) {
                    totalX += magnitude;
                } else {
                    totalX -= magnitude;
                }
                coefficient = 0;
            } else if (currentChar == 'y') {
                // if we see a 'y', we just reset the coefficient so it doesn't carry over
                // we do NOT add to total here because this loop is only for x
                coefficient = 0;
            }
        }

        //only used to gather elements of y
        // we must reset these variables before the second loop
        isPositive = true;
        coefficient = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '-') {
                isPositive = false;
                coefficient = 0;
            } else if (currentChar == '+') {
                isPositive = true;
                coefficient = 0;
            } else if (currentChar >= '0' && currentChar <= '9') {
                int digit = currentChar - 48;
                coefficient = coefficient * 10 + digit;
            } else if (currentChar == 'y') {
                int magnitude = (coefficient == 0) ? 1 : coefficient;
                if (isPositive) {
                    totalY += magnitude;
                } else {
                    totalY -= magnitude;
                }
                coefficient = 0;
            } else if (currentChar == 'x') {
                // if we see an 'x', we reset so it doesn't carry over
                // We do NOT add to total here because this loop is only for y
                coefficient = 0;
            }
        }

        // output Formatting
        String result = "";

        // add X part
        if (totalX != 0) {
            if (totalX < 0) {
                result += "-";
                totalX = -totalX; // manually make positive
            }
            result += totalX + "x";
        }

        // add Y part
        if (totalY != 0) {
            if (totalY > 0) {
                if (result.length() > 0) {
                    result += "+";
                }
            } else {
                result += "-";
                totalY = -totalY; // manually make positive
            }
            result += totalY + "y";
        }

        if (result.length() == 0) {
            System.out.println("Output: 0");
        } else {
            System.out.println("Output: " + result);
        }
    }
}