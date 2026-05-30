import java.util.Scanner;
public class task4{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Fan Message: ");
  String message = sc.nextLine();

  String msgLower = message.toLowerCase();

  int madridCount = 0;
  int cityCount = 0;
  int index = 0;
  while (true){
    index = msgLower.indexOf("madrid", index);
    if (index == -1){
      break;
    }
    madridCount++;
    index += 6;
  }
  index = 0;
  while (true){
    index = msgLower.indexOf("city", index);
    if (index == -1){
      break;
    }
    cityCount++;
    index += 4;
  }

  if (madridCount > cityCount){
    System.out.println("Madrid Supporter");
  }
  else if (cityCount > madridCount){
    System.out.println("City Supporter");
  }
  else{
    System.out.println("Neutral");
  }
  if (msgLower.indexOf("close") != -1){
    System.out.println("Fan expects a close match");
  }
  else if (msgLower.indexOf("destroy") != -1){
    System.out.println("Fan expects a dominating victory!");
  }
  else{
    System.out.println("Hard to read the fan sentiment");
  }
  }
}
