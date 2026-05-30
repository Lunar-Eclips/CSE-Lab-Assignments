// Task 3

import java.util.Scanner;
public class task03 {
 public static void main(String[] args) 
        {
 Scanner sc= new Scanner(System.in);
System.out.println("Enter first number");
 float num1 = sc.nextFloat();

 System.out.println("Enter second number");
        float num2 = sc.nextFloat();
System.out.println("Enter last number");
 float num3 = sc.nextFloat();
        
        float max;float min;
        
if (num1 > num2) {
    if (num1 > num3) {
        max = num1;
    } else {
        max = num3;
    }
} else {
    if (num2 > num3) {
        max = num2;
    } else {
        max = num3;
    }
}

if (num1 < num2) {
    if (num1 < num3) {
        min = num1;
    } else {
        min = num3;
    }
} else {
    if (num2 < num3) {
        min = num2;
    } else {
        min = num3;
    }
}

        
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
