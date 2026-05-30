public class Restaurant{
  public String brand;
  public String location;
  
  public UberEatsUser[] user = new UberEatsUser[3];
  
  public Restaurant(String brand, String location){
    this.brand = brand;
    this.location = location;
  }
  
  public void takeOrder(UberEatsUser User){
    if(User.address == null){
      System.out.println("Location : Unknown. Please update your location information!");
      return;
    }
    for(int i=0; i<user.length; i++){
      if(user[i] == User){
        System.out.println("You already have a pending order!");
        return;
      }
    }
    for(int i=0; i<user.length; i++){
      if(user[i] == null){
        user[i] = User;
        System.out.println("Your order has been added!");
        return;
      }
    }
    System.out.println("We are really busy right now. Please order after some time. Thank you!");
  }
  
  public void completeOrders(){
    boolean found = false;
    for(int i=0; i<user.length; i++){
      if(user[i] != null){
        if(!found) System.out.println("Showing " + brand + "'s orders:");
        System.out.println("Order by " + user[i].name + " at " + user[i].address + " completed");
        user[i] = null;
        found = true;
      }
    }
    if(!found) System.out.println("No pending orders at the moment.");
  }
}
