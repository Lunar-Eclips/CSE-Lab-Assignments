public class CSEStudent extends Student{
 public static int count = 0;
 public static String labCourses = "CSE110 CSE111 CSE220 CSE221 ";

 public CSEStudent(String n, int i){
  super(n, i);
  count++;
 }

 public static void details(){
  System.out.println("Total CSE Students: " + count);
  System.out.println("Available Lab Based Courses: ");
  System.out.println(labCourses);
 }

 public void addLabBasedCourse(String course){
  if (labCourses.indexOf(course) != -1){
   courses += course + " ";
  }
  else{
   System.out.println("It is not a lab based course!");
  }
 }
}
