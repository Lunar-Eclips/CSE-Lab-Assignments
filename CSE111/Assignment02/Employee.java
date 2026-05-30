public class Employee{
public String name;
public String designation = "Junior";
public int salary = 30000;

public void newEmployee(String name) {
this.name = name;
}

public void displayInfo() {
System.out.println("Employee Name: " + name);
System.out.println("Employee Salary: " + salary + " Tk");
System.out.println("Employee Designation: " + designation);
    }

public void calculateTax() {
  if (salary > 50000) {
        double tax = salary * 0.3;
        System.out.println(name + " Tax Amount: " + tax + " Tk");
  } else if (salary > 30000) {
        double tax = salary * 0.1;
        System.out.println(name + " Tax Amount: " + tax + " Tk");
  } else {
      System.out.println("No need to pay tax");
        }
    }

   public void promoteEmployee(String newDesignation) {
double increment = 0.0;
String lowerDesig = newDesignation.toLowerCase();

     if (lowerDesig.equals("senior")) {
            increment = 25000.0;
   } else if (lowerDesig.equals("lead")) {
     increment = 50000.0;
   } else if (lowerDesig.equals("manager")) {
     increment = 75000.0;
   } else {
     System.out.println("Invalid designation");
     return;
}

this.salary += increment;
this.designation = lowerDesig;
System.out.println(name + " has been promoted to " + newDesignation);
System.out.printf("New Salary: %.2f Tk%n", salary);
}

}