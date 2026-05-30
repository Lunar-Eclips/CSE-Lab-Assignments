import java.util.Scanner;
public class task02{
  public static void main ( String [] args ){
  Scanner sc = new Scanner (System.in);
  
  System.out.print("Age: ");
  int age = sc.nextInt();
  System.out.print("Electricity Consumed: ");
  int con_elec = sc.nextInt();
  double bill,finalBill;
  double surcharge = 0;
  
  if ( age < 18){
   bill = 15 * con_elec * 0.8;
  } else {
    if ( age > 60){
     bill = 15 * con_elec;
    } else {
    bill = 15 * con_elec * 0.9;
    }
  }
  if ( con_elec > 100){
  surcharge = bill * 0.05;
  }
  
  finalBill = bill + surcharge;
    
  System.out.println("Final Bill: " + finalBill);
  }
}