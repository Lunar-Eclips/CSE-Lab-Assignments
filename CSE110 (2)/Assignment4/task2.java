import java.util.Scanner;

public class task2{
  public static void main (String [] args ){
  Scanner sc = new Scanner (System.in);
  
  System.out.println("Enter number of students to check: ");
  int stu_num = sc.nextInt();
  
  for (int i = 0 ; i < stu_num; i++){
    System.out.println("Enter student ID: ");
    int id = sc.nextInt();
    
    if (id <= 0) {
      System.out.println("Not Lucky");
      continue;
    }
    
    int temp = id;
    while (temp % 2 == 0) {
      temp = temp / 2;
    }
    
    if (temp == 1) {
      System.out.println("Lucky ID");
    } else {
      System.out.println("Not Lucky");
    }
  }
  } 
}