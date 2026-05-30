public class Company{
  public String name = "ABC Company";
  
  private Employee[] employees = new Employee[3];
  private int count = 0;
  
  public void addEmployee(Employee e){
    if(count < employees.length){
      employees[count] = e;
      count++;
      System.out.println(e.name + " has joined the company");
    }else{
      System.out.println("No more vacancy");
    }
  }
  
  public void removeEmployee(Employee e){
    for(int i = 0; i < count; i++){
      if(employees[i] == e){
        System.out.println(e.name + " has left the company");
        for(int j = i; j < count - 1; j++){
          employees[j] = employees[j + 1];
        }
        employees[count - 1] = null;
        count--;
        return;
      }
    }
  }
  
  public void details(){
    System.out.println("Company Name: " + name);
    System.out.println("Total Employee: " + count);
    System.out.println("Fulltime Employees: ");
    for(int i = 0; i < count; i++){
      if(employees[i].type.equals("Fulltime")){
        System.out.println("Name: " + employees[i].name + ", ID: " + employees[i].id);
      }
    }
    System.out.println("Part-Time Employees: ");
    for(int i = 0; i < count; i++){
      if(employees[i].type.equals("Part-time")){
        System.out.println("Name: " + employees[i].name + ", ID: " + employees[i].id);
      }
    }
  }
}
