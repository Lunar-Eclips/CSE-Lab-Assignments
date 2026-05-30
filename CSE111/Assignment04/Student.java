public class Student{
 public String name;
 public int id;
 public String dept;
 public double cg;
 public boolean cgSet = false;
 public String[] courses = new String[4];
 public int courseCount = 0;
 public String email;
 public String password;
 public boolean loggedIn = false;
 public String[] advised = new String[3];
 public int advisedCount = 0;

 public Student(int id){
  this.id = id;
  System.out.println("A student with ID " + id + " has been created.");
 }

 public Student(String name, int id, String dept){
  this.name = name;
  this.id = id;
  this.dept = dept;
  System.out.println("Student object is created");
 }

 public Student(int id, double cg){
  this.id = id;
  this.cg = cg;
  this.cgSet = true;
  System.out.println("A student with ID " + id + " and cgpa " + cg + " has been created.");
 }

 public void storeCG(double cg){
  this.cg = cg;
  this.cgSet = true;
  System.out.println("Student ID: " + id + ", CGPA: " + cg);
 }

 public void storeID(int id){
  this.id = id;
 }

 public void addCourse(String c){
  if(!cgSet){
   System.out.println("Failed to add " + c);
   System.out.println("Set CG first");
   return;
  }
  if(cg < 3 && courseCount >= 3){
   System.out.println("Failed to add " + c);
   System.out.println("CG is low. Can't add more than 3 courses.");
   return;
  }
  if(courseCount >= 4){
   System.out.println("Failed to add " + c);
   System.out.println("Maximum 4 courses allowed.");
   return;
  }
  courses[courseCount++] = c;
 }

 public void addCourse(String[] arr){
  for(int i = 0; i < arr.length; i++){
   addCourse(arr[i]);
  }
 }

 public void removeAllCourse(){
  courseCount = 0;
  for(int i = 0; i < courses.length; i++){
   courses[i] = null;
  }
 }

 public void showAdvisee(){
  System.out.println("Student ID: " + id + ", CGPA: " + cg);
  if(courseCount == 0){
   System.out.println("No courses added.");
   return;
  }
  System.out.println("Added courses are:");
  for(int i = 0; i < courseCount; i++){
   System.out.print(courses[i] + " ");
  }
  System.out.println();
 }
}
