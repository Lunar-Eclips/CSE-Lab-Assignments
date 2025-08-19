import java.util.Scanner;

public class task01 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter string :");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int vowel=0;
        int consonant=0;
        for (int i=0; i<str1.length();i++)
        {
            if (str1.charAt(i)>='a' && str1.charAt(i)<='z')
            {
                if (str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
                {
                    vowel++;
                }
                else
                {
                    consonant++;
                }
            }
           else if (str1.charAt(i)>='A' && str1.charAt(i)<='Z')
            {
                if (str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U')
                {
                    vowel++;
                }
                else
                {
                    consonant++;
                } 
        }
    }
        if (vowel!= 0 && consonant!= 0)
         {
          if (vowel%3==0 && consonant%5==0)
         {
          System.out.println("Aaarr! Me Plunder!!");
         }
          else
          {
           System.out.println("Blimey! No Plunder!!");
          }
         }
        else
         {
          System.out.println("Blimey! No Plunder!!");
         }
  } 
}


          