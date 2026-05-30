public class TravelPrep{
 public String t_name;
 public int budget = 1250;
 public String d_name;
 public String d_type;
 public int cost;
 public TravelPrep[] list = new TravelPrep[3];
 public int count = 0;

 public TravelPrep(){
  t_name = "Unknown";
  System.out.println(t_name + " package would cost at most " + budget + " yen");
 }

 public TravelPrep(String t_name, int budget){
  this.t_name = t_name;
  this.budget = budget;
  System.out.println(t_name + " would cost at most " + budget + " yen");
 }

 public TravelPrep(String d_name, String d_type){
  this.d_name = d_name;
  this.d_type = d_type;
  this.cost = 300;
  System.out.println(d_name + " " + d_type + " costs " + cost + " yen");
 }

 public TravelPrep(String d_type, String d_name, int cost){
  this.d_name = d_name;
  this.d_type = d_type;
  this.cost = cost;
  System.out.println(d_name + " " + d_type + " costs " + cost + " yen");
 }

 public void add_to_itinerary(TravelPrep d){
  if(count >= 3) return;
  if(d.cost + total() > budget){
   System.out.println("Budget going overboard");
   return;
  }
  list[count++] = d;
 }

 public void add_to_itinerary(TravelPrep d1, TravelPrep d2){
  add_to_itinerary(d1);
  add_to_itinerary(d2);
 }

 public int total(){
  int sum = 0;
  for(int i = 0; i < count; i++){
   sum += list[i].cost;
  }
  return sum;
 }

 public void show_itinerary(){
  System.out.println("Itinerary for " + t_name);
  for(int i = 0; i < count; i++){
   System.out.println((i+1) + ". " + list[i].d_name + " " + list[i].d_type + " - " + list[i].cost + " yen");
  }
  System.out.println("Total cost of " + count + " destinations: " + total() + " yen");
 }

 public String updateCost(int x){
  this.cost += x;
  return "Cost of " + d_name + " " + d_type + " updated to " + cost;
 }
}
