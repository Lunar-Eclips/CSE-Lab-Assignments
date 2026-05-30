public class Organizer{
 private String name;
 private Event [] events = new Event[4];
 private int ecount;
 
 public Organizer(){
 System.out.println("Please provide the organizer's name");
 }
 
 public Organizer(String name){
 this.name = name;
 }
 
 public void organizeEvent(Event e){
 if(ecount<4){
 events[ecount++] = e;
 System.out.println(name+" successfully organized "+e.getName());
 }
 }
 
 public void searchEventByDate(String date){
 boolean found = false;
 for(int i=0;i<ecount;i++){
 if(events[i].getDate().equals(date)){
 System.out.println(events[i].getName());
 found = true;
 }
 }
 if(found==false) System.out.println("No event is scheduled for "+date);
 }
}
