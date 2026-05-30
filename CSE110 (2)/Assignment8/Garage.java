public class Garage {
 public Car[] cars;
 public Bike[] bikes;
 private int carCount = 0;
 private int bikeCount = 0;

 public Garage(int c, int b) {
  cars = new Car[c];
  bikes = new Bike[b];
  System.out.println("Welcome to the Garage!");
  System.out.println("Car Capacity: " + c);
  System.out.println("Bike Capacity: " + b);
 }

 public void addVehicle(Vehicle v) {
  if (v instanceof Car) {
   if (carCount < cars.length) {
    cars[carCount] = (Car) v;
    System.out.println("A " + v.getBrand() + " CAR has been added to the Garage");
    carCount++;
   } else {
    System.out.println("Can't add more Cars! Capacity: " + cars.length);
   }
  }
  else if (v instanceof Bike) {
   if (bikeCount < bikes.length) {
    bikes[bikeCount] = (Bike) v;
    System.out.println("A " + v.getBrand() + " BIKE has been added to the Garage");
    bikeCount++;
   } else {
    System.out.println("Can't add more bikes! Capacity: " + bikes.length);
   }
  }
 }
}
