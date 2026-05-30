import java.util.Scanner;

public class task4{
  public static void main (String [] args ){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Number of Members: ");
  int members = sc.nextInt();
  
  for (int i = 1; i <= members; i++){
    System.out.println("Exercises for Member-" + i + ": ");
    int exercises = sc.nextInt();
    
    double first = 0;
    double second = 0;
    double third = 0;
    
    for (int j = 0; j < exercises; j++){
      System.out.println("Exercise-" + (j+1) + ": ");
      double calorie = sc.nextDouble();
      
      if (calorie > first) {
        third = second;
        second = first;
        first = calorie;
      } else if (calorie > second) {
        third = second;
        second = calorie;
      } else if (calorie > third) {
        third = calorie;
      }
    }
    
    int count = 3;
    if (exercises < 3) {
      count = exercises;
    }
    
    double total1 = first;
    double total2 = second;
    double total3 = third;
    
    if (first > 350) {
      total1 = first + (first * 0.5);
    }
    if (second > 350) {
      total2 = second + (second * 0.5);
    }
    if (third > 350) {
      total3 = third + (third * 0.5);
    }
    
    double total = total1 + total2 + total3;
    
    boolean allLessThan200 = true;
    if (first >= 200 || second >= 200 || third >= 200) {
      allLessThan200 = false;
    }
    
    if (allLessThan200) {
      total = total - (total * 0.1);
    }
    
    double rawSum = first + second + third;
    double rawAvg = rawSum / count;
    
    if (rawAvg > 400) {
      total = total + (50 * count);
    }
    
    double average = total / count;
    System.out.println("Average calories earned per day for Member-" + i + ": " + String.format("%.3f", average));
  }
  } 
}