package CSE110.Assignment09;

public class Task04 
{
    public static void main(String[] args) 
    {
        //Enter n here
        System.out.println(fibonacci(9));
    }

    public static int fibonacci(int n) 
    {
        if (n == 0)
         {
            return 0;
         }
        if (n == 1) 
        {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
