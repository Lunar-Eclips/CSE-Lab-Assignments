public class Bike extends Vehicle {
 private String model;
 private boolean sideCar;

 public Bike(String b, String m, int y, int w, boolean s) {
  super(b, y);
  this.model = m;
  this.sideCar = s;
  setWheels(w);
 }

 public void doAWheelie() {
  if (sideCar) {
   System.out.println("Wheelie Failed. " + getBrand() + ":" + model + " has SideCar");
  } else {
   System.out.println(getBrand() + ":" + model + " is doing Wheelie!!");
  }
 }

 public String toString() {
  return "Bike Brand: " + getBrand() + ", Year: " + getYear() + ", Wheels: " + getWheels()
   + ", Model: " + model + ", SideCar: " + sideCar;
 }
}
