public class Character{
 public String name;
 public String group;
 public int health;
 public int id;
 public static int [] ageArr = new int [3];
 public static int count;
 public static int netHealth;
 public static double avgHealth;
 public static int Shealth = 0;
 public static String Schar ="None";
 
 public Character(String name,int health){
 this(name,"Teen",health);
 }
 
 public Character (String name,String group,int health){
 this.name = name;
 this.health = health;
 netHealth += health;
 count++;
 this.id = count;
 if (health > Shealth) {
 Shealth =health;
 Schar = name;
 }
 if (count!=0) avgHealth = netHealth/count;
 this.group = group;
 if (group == "Kid") ageArr[0]++;
 if (group == "Teen") ageArr[1]++;
 if (group == "Adult") ageArr[2]++;
 }
 public static void printStats(){
 System.out.println("Total Characters: "+count);
 System.out.println("Kids: "+ageArr[0]);
 System.out.println("Teens: "+ageArr[1]);
 System.out.println("Adults: "+ageArr[2]);
 System.out.println("Average Health: "+avgHealth);
 System.out.println("Strongest Character: "+Schar);
 }
 public void printDetails(){
 System.out.println("ID: "+id+", Name: "+name);
 System.out.println("Group: "+group);
 System.out.println("Health: "+health);
 }
}