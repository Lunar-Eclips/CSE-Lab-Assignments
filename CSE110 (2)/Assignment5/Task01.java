import java.util.Scanner;
public class Task01{
  public static void main (String [] args){
  Scanner sc = new Scanner (System.in);
  String str1 = sc.nextLine();
  int max = -1;
  for (int i = 0;i < str1.length() - 1;i++){
    char c1 = str1.charAt(i);
    char c2 = str1.charAt(i + 1);
    if (c1 >= '0' && c1 <= '9' && c2 >= '0' && c2 <= '9'){
      int num = (c1 - '0') * 10 + (c2 - '0');
      if (num > max){
        max = num;
      }
    }
  }
  if (max == -1){
    System.out.println(0);
  }
  else{
    System.out.println(max);
  }
  }
}
