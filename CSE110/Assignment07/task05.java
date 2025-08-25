ppackage CSE110.Assignment07;

import java.util.Scanner;
public class task05
{
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students ");
        int N = sc.nextInt();
        int[] marks = new int[N];
        String[] names = new String[N];
        for(int i=0;i<N;i++)
        {
            System.out.print("Enter mark ");
            marks[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name ");
            names[i] = sc.nextLine();
        }
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-i-1;j++)
            {
                if(marks[j]>marks[j+1])
                {
                    int tempMark = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = tempMark;

                    String tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;
                }
            }
        }

        System.out.println("Sorted list:");
        for(int i=0;i<N;i++)
        {
            System.out.println(names[i]+" "+marks[i]);
        }
    }
}

