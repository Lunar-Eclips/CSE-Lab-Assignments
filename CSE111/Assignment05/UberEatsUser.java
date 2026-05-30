public class UberEatsUser{
  public String name;
  public String address;
  
  public UberEatsUser(String name){
    this.name = name;
  }
  
  public UberEatsUser(String name, String address){
    this(name);
    this.address = address;
  }
  
  public void updateLocation(String location){
    if(this.address == null){
      this.address = location;
      System.out.println("Update Successful!");
    }else{
      System.out.println("We already have your location. Please place an order!");
    }
  }
}
