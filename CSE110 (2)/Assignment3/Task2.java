import java.util.Scanner;

public class Task2{
  public static void main (String [] main){
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Please Enter number of Herbs (H): ");
 int H = sc.nextInt();
 
 System.out.println("Please Enter number of Crystals (C)");
 int C = sc.nextInt();
 
 int i = 0;
 while (H >= 3 && C >= 2) {
  i++;
  H -= 3;
  C -= 2;
  System.out.println("Potion-" + i + " created");
  System.out.println("Remaining Herbs: " + H + ", Remaining Crystals: " + C);
  }

 System.out.println("Potions Created: " + i);

 if (i % 2 == 0) {
  System.out.println("Stable Elixir");
  } else {
     System.out.println("Volatile Brew");
   }
}
}