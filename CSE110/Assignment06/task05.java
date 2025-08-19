import java.util.Scanner;

public class task05
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name:");
        String name = sc.nextLine();
        System.out.print("Enter password:");
        String pass = sc.nextLine();
        boolean invalid = false;

        for (int i = 0; i <= pass.length() - name.length(); i++)
        {
         boolean match = true;

         for (int j = 0; j < name.length(); j++)
          {
           if (pass.charAt(i+j) != name.charAt(j))
            {
             match = false;
             break;
            }
          }

         if (match == true)
          {
           invalid = true;
           break;
          }
        }

        if (invalid == true)
         {
          System.out.println("Invalid");
         }
        else
         {
          System.out.println("Valid");
         }
    }
}
