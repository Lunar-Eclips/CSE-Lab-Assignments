public class SmartSecurityCamera extends SmartDevice {
 public int storage;
 public int maxStorage;
 public boolean nightVision;

 SmartSecurityCamera(String name, double battery, int storage) {
  super(name, battery);
  this.storage = storage;
  this.maxStorage = storage;
  this.nightVision = false;
 }

 public void record(boolean nightVisionOn) {
  if (isActive == false) {
   return;
  }
  if (storage <= 0) {
   System.out.println("Error: " + deviceName + " storage full. Recording disabled.");
   return;
  }
  if (nightVisionOn == true) {
   nightVision = true;
   System.out.println("[IR SENSORS ACTIVE]");
  }
  System.out.println("Recording standard footage.       ");
 }

 public void record() {
  if (isActive == false) {
   System.out.println("Error: " + deviceName + " storage full. Recording disabled.");
   return;
  }
  if (storage <= 0) {
   System.out.println("Error: " + deviceName + " storage full. Recording disabled.");
   return;
  }
  System.out.println("Recording standard footage.       ");
 }

 public void formatCard(String pin) {
  System.out.println("REQUEST: Format SD Card initiated.");
  if (isActive == false) {
   System.out.println("ERROR: Device must be ON to format.");
   return;
  }
  if (pin.equals("ADMIN123") == false) {
   System.out.println("ACCESS DENIED: Incorrect PIN.     ");
   return;
  }
  System.out.println("Auth Success. Wiping data.");
  storage = maxStorage;
  System.out.println("SUCCESS: Storage restored to " + storage + "GB.");
 }

 public void powerOff() {
  if (nightVision == true) {
   System.out.println("Turning off Night Vision.");
   nightVision = false;
  }
  super.powerOff();
 }
}
