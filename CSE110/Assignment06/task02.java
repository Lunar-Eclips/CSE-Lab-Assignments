import java.util.Scanner;

public class task02 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter string number 1 :");
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.print("Enter string number 1 :");
        String str2 = sc.nextLine();
        int count=0;
        String result1 = "";
        String result2 = "";
        for (int i=0; i<str1.length();i++)
        {
         char ch = str1.charAt(i);
         boolean found  = false;
         for(int j=0;j < str2.length(); j++)
          {
            if (ch == str2.charAt(j)) 
            {
            found = true;
            break; 
          }
        }
         if (!found) 
         {
        result1 += ch;
        
         }
       }
        for (int i = 0; i < str2.length(); i++) 
        {
         char ch = str2.charAt(i);
         boolean found = false;

         for (int j = 0; j < str1.length(); j++) 
         {
           if (ch == str1.charAt(j)) 
           {
             found = true;
             break;
           }
         }

         if (!found) 
          {
           result2 += ch;
          }
       }
         String finalResult = (result1 + result2).toUpperCase();
        System.out.println("Modified string: " + finalResult);
    }
}
 


          