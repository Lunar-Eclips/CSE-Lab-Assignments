public class Toy{
 public String name;
 public int price;
 
 public Toy( String name, int price){
  this.name = name;
  this.price = price;
 }

 public void updatePrice( int input ){
  this.price = input;
}

 public void updateName( String input ){
  this.name = input;
 }
 
 public void showPrice(){
  System.out.println("price: " + this.price);
 }
 
}