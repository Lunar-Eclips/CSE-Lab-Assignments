public class Animalkeepers{
 private String name;
 private int id;
 private static int count;
 public static String [] Animals = {"Lion","Tiger","Seal","Gorilla","Deer"};
 private static String [] taskArr = new String[5];
 private static String [] keeperArr = new String[5];
 
 public Animalkeepers(String name){
 this.name = name;
 id = 100 + (++count);
 System.out.println(name+" with ID "+id+" got the job!");
 }
 
 public void doTask(String animal,String task){
 boolean found = false;
 for(int i=0;i<Animals.length;i++){
 if(Animals[i]==animal){
 found = true;
 taskArr[i] = task;
 keeperArr[i] = name;
 System.out.println("Task assigned to "+name);
 }
 }
 if(found==false) System.out.println("Animal not in the Safari");
 }
 
 public static void printTasks(){
 boolean any = false;
 for(int i=0;i<Animals.length;i++){
 if(taskArr[i]!=null){
 any = true;
 System.out.println(taskArr[i]+" (Keeper - "+keeperArr[i]+") === "+Animals[i]);
 }
 }
 if(any==false) System.out.println("No tasks assigned.");
 }
 
 public static void details(){
 if(count==0){
 System.out.println("No Animal Keepers working yet.");
 return;
 }
 int taskCount = 0;
 for(int i=0;i<taskArr.length;i++){
 if(taskArr[i]!=null) taskCount++;
 }
 System.out.println("Total Animal Keeper: "+count);
 System.out.println("Total Task assigned: "+taskCount);
 printTasks();
 }
}
