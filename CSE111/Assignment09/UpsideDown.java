class UpsideDown extends Hawkins {
 public static int totalBridges = 0;

 private Hawkins bridge1;
 private Hawkins bridge2;

 public UpsideDown(String name) {
  super(name);
 }

 public void open() {
  super.open();
 }

 public void connect(Hawkins h) {
  if (bridge1 == null) {
   bridge1 = h;
   h.status = true;
   totalBridges++;
  }
  else if (bridge2 == null) {
   bridge2 = h;
   h.status = true;
   totalBridges++;
  }
  else {
   System.out.println("No further bridges with " + this.name);
  }
 }

 public void disconnect(int num) {
  if (num == 1) {
   if (bridge1 != null) {
    bridge1.status = false;
    bridge1 = null;
   }
   else {
    System.out.println("Invalid bridge number!");
   }
  }
  else if (num == 2) {
   if (bridge2 != null) {
    bridge2.status = false;
    bridge2 = null;
   }
   else {
    System.out.println("Invalid bridge number!");
   }
  }
  else {
   System.out.println("Invalid bridge number!");
  }
 }

 public void details() {
  System.out.println(this.name + " Details:");
  if (bridge1 != null) {
   System.out.println("Bridge 1: " + bridge1.name);
  }
  if (bridge2 != null) {
   System.out.println("Bridge 2: " + bridge2.name);
  }
 }

 public Hawkins getBridge1() {
  return bridge1;
 }

 public Hawkins getBridge2() {
  return bridge2;
 }

 public void activate(Hawkins h) {
  System.out.println("Activating the door of " + h.name);
 }
}
