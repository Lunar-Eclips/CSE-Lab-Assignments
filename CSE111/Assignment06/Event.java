public class Event{
 private String name;
 private String date;
 private static Event [] arr = new Event[5];
 private static int count;
 
 public Event(String name,String date){
 if(count<5){
 this.name = name;
 this.date = date;
 arr[count++] = this;
 }
 }
 
 public String getName(){
 return name;
 }
 
 public String getDate(){
 return date;
 }
 
 public String details(){
 return "Name: "+name+"\nDate: "+date;
 }
 
 public static void allEventInfo(){
 System.out.println("Total Events: "+count);
 System.out.println("Event Details: ");
 for(int i=0;i<count;i++){
 System.out.println("Event "+(i+1)+":");
 System.out.println("Name: "+arr[i].name);
 System.out.println("Date: "+arr[i].date);
 }
 }
}
