import java.util.Scanner;

public class Task01{
  public static void main (String [] args){
  Scanner sc = new Scanner (System.in);
  
  System.out.println("Input first number: ");
  int first_num = sc.nextInt();
  
  System.out.println("input last number: ");
  int last_num = sc.nextInt();
  
  for (int i = first_num; i <= last_num; i++ ){
  int temp = i;
  if (temp < 0) continue;
  int digits;
  if (temp == 0){
  digits = 1;
  } else {
  digits = 0;
  }
  int t = temp;
  while (t > 0){
  digits++;
  t /= 10;
  }
  int sum = 0;
  t = temp;
  while (t > 0){
  int d = t % 10;
  int power = 1;
  for (int k = 0; k < digits; k++){
  power *= d;
  }
  sum += power;
  t /= 10;
  }
  if (temp == 0) sum = 0;
  if (sum == i){
  System.out.println(i);
  }
  }
  sc.close();
  }
}