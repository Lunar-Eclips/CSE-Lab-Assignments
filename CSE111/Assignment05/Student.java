public class Student{
  public String name;
  public int id;
  public double cgpa;
  
  public Student(String name, int id, double cgpa){
    this.name = name;
    this.id = id;
    this.cgpa = cgpa;
  }
  
  public void updateId(int id){
    this.id = id;
  }
}
