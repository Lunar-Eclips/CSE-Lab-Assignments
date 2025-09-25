package CSE110.Assignment08;

import java.util.Scanner;
public class Task03 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your age: ");
       double age=sc.nextDouble();
       System.out.println("Enter your salary");
       double salary=sc.nextDouble();
       double tax=calcTax(age,salary);
       System.out.println(tax);
       calcYearlyTax();
    }
    public static double calcTax(double age,double salary)
    {
        if (age<18)
        {
            return 0;
        }
        else
        {
            if (salary<10000)
            {
                return 0;
            }
            else if (salary>=10000 && salary<20000)
            {
                return salary*0.07;
            }
            else
            {
                return salary*0.14;
            }
        }
        
    }
    public static void calcYearlyTax()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        double age=sc.nextDouble();
        double tax=0;
        for (int i=1;i<=12;i++)
        {
        double monthly_tax=0;
        System.out.println("Enter your Monthly salary: ");
        double salary=sc.nextDouble();
        monthly_tax=calcTax(age,salary);
        System.out.println("Monthly "+ i +" tax is"+monthly_tax);
        tax+=monthly_tax;
        }
        System.out.println("Total yearly tax is: "+tax);
    }

        }
