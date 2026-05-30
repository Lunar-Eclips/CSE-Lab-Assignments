public class Car extends Vehicle {
 private String model;
 private int doors;
 private boolean autoPilot;

 public Car(String b, String m, int y, int d, int w, boolean a) {
  super(b, y);
  this.model = m;
  this.doors = d;
  this.autoPilot = a;
  setWheels(w);
 }

 public void startAutoPilot() {
  if (autoPilot) {
   System.out.println(getBrand() + ":" + model + " AutoPilot Started");
  } else {
   System.out.println(getBrand() + ":" + model + " has NO AutoPilot");
  }
 }

 public String toString() {
  return "Car Brand: " + getBrand() + ", Year: " + getYear() + ", Wheels: " + getWheels()
   + ", Model: " + model + ", Doors: " + doors + ", AI: " + autoPilot;
 }
}
