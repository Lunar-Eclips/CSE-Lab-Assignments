public class Department{
  public String name;
  private Student[] students = new Student[5];
  private int count = 0;
  
  public Department(String name){
    this.name = name;
  }
  
  public void addStudent(Student... sArr){
    for(Student s : sArr){
      addSingle(s);
    }
  }
  
  private void addSingle(Student s){
    if(count == 5){
      return;
    }
    for(int i = 0; i < count; i++){
      if(students[i].id == s.id){
        System.out.println("Student with the same ID already exists, Please try with another ID");
        return;
      }
    }
    students[count] = s;
    count++;
    System.out.println("Welcome to " + name + " department, " + s.name);
  }
  
  public void details(){
    System.out.println("Department Name: " + name);
    System.out.println("Number of student:" + count);
    System.out.println("Details of the students: ");
    for(int i = 0; i < count; i++){
      System.out.println("Student name: " + students[i].name + ", ID: " + students[i].id + ", cgpa: " + students[i].cgpa);
    }
  }
  
  public void findStudent(int id){
    for(int i = 0; i < count; i++){
      if(students[i].id == id){
        System.out.println("Student info:");
        System.out.println("Student Name: " + students[i].name);
        System.out.println("ID: " + students[i].id);
        System.out.println("CGPA:  " + students[i].cgpa);
        return;
      }
    }
    System.out.println("Student with this ID doesn't exist, Please give a valid ID");
  }
}
