public class MobilePhone {
public int contactCapacity;
public int totalContacts;
public String[] names;
public int[] numbers;

public void setContactCapacity(int c) {
 contactCapacity = c;
 names = new String[c];
 numbers = new int[c];
 totalContacts = 0;
}

public void addContact(String name, int number) {
 if (totalContacts < contactCapacity) {
  names[totalContacts] = name;
  numbers[totalContacts] = number;
  totalContacts++;
  System.out.println("The contact of " + name + " is added.");
 } else {
  System.out.println("Storage Full!!");
 }
}

public void makeCall(int number) {
boolean found = false;
 for (int i = 0; i < totalContacts; i++) {
  if (numbers[i] == number) {
   System.out.println("Calling " + names[i] + " . . .");
   found = true;
   break;
 }
}
if (!found) {
 System.out.println("Calling " + number + " . . .");
}
}

public void details() {
System.out.println("Total Contacts: " + totalContacts);
System.out.println("Contact List:");
 for (int i = 0; i < totalContacts; i++) {
  System.out.println(names[i] + ":" + numbers[i]);
}
}
}
