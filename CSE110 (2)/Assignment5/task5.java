import java.util.Scanner;
public class task5{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  int i;
  for (i = str.length() - 1; i >= 0; i--){
    if (str.charAt(i) != ' '){
      break;
    }
  }
  int length = 0;
  for (; i >= 0; i--){
    if (str.charAt(i) == ' '){
      break;
    }
    length++;
  }
  System.out.println(length);
  }
}
