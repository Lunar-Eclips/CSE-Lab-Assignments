public class Employee{
  public String name;
  public int id;
  public String type;
  
  public Employee(){
    name = "Default";
    id = 0;
    type = "Fulltime";
    System.out.println("A default employee has been created");
  }
  
  public Employee(String name, int id, String type){
    this.name = name;
    this.id = id;
    this.type = type;
  }
}
