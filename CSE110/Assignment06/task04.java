import java.util.Scanner;

public class task04
{
    public static void main(String[] args) 
    {
        System.out.print("Enter password:");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int up_count = 0;
        int low_count = 0;
        int dig = 0;
        int s_char = 0;
        boolean strongpass=true;

        for (int i = 0; i < str1.length(); i++)
        {
         if (str1.length()>=8)
          {
           if (str1.charAt(i)>='A' && str1.charAt(i)<= 'Z')
            {
             up_count++;
            }
           else if (str1.charAt(i)>'a' && str1.charAt(i)<= 'z')
            {
             low_count++;
            }
           else if (str1.charAt(i)>'0' && str1.charAt(i)<= '9')
             {
             dig++;
            }
           else
            {
             s_char++;
            }
          }
         else
          {
           strongpass=false;
           System.out.print(strongpass);
           break;
          }
        }
      if (up_count>=1 && low_count>1 && dig>=1 && s_char>=1)
       {
        System.out.print(strongpass);
       }
      else if (strongpass)
          {
           strongpass=false;
           System.out.print(strongpass);
          }
    }
}
