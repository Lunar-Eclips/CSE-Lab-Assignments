import java.util.Scanner;

public class task03 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter string number 1 :");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = "";
        int count = 0;

        for (int i = 0; i < str1.length(); i++)
        {
            char ch = str1.charAt(i);
            if (ch != ' ')
            {
                if (count % 2 == 0) 
                {
                    str2 += Character.toLowerCase(ch);
                }
                else 
                {
                    str2 += Character.toUpperCase(ch);
                }
                count++;
            }
            else 
            {
                str2 += ch;
            }
        }
        System.out.println(str2);
    }
}
