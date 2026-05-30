public class Artifact{
 private String name;
 private String addedBy;
 private int power;

 private static Artifact [] vault = new Artifact [4];
 private static int vaultCount;
 private static String defaultBy = "Okabe";

 public Artifact(String name, String addedBy){
 this.name = name;
 this.addedBy = addedBy;
 this.power = CalcPower();
 }

 public Artifact(String name){
 this(name, defaultBy);
 }

 public String GetName(){
 return name;
 }

 public int CalcPower(){
 int sum = 0;
 int length = name.length();
 if(length % 2 == 0){
 for(int i = 0; i < length; i += 2){
 sum += name.charAt(i);
 }
 }else{
 for(int i = 1; i < length; i += 2){
 sum += name.charAt(i);
 }
 }
 this.power = sum;
 return sum;
 }

 public static void AddtoVault(Artifact a){
 if(vaultCount < 4){
 vault[vaultCount] = a;
 vaultCount++;
 System.out.println(a.addedBy+" added "+a.name+" successfully to the vault.");
 }else{
 System.out.println("!!"+a.addedBy+" unsuccessful in adding artifact to the vault!!");
 }
 }

 public static void labReport(){
 System.out.println("=== Future Gadget Lab ===");
 for(int i = 0; i < vaultCount; i++){
 if(vault[i] != null){
 vault[i].revealArtifact();
 }
 }
 }

 public static String strongest(){
 int max = -1;
 String sName = "None";
 for(int i = 0; i < vaultCount; i++){
 if(vault[i] != null && vault[i].power > max){
 max = vault[i].power;
 sName = vault[i].name;
 }
 }
 return sName;
 }

 public void revealArtifact(){
 System.out.println(name+" added by "+addedBy+" has power of "+power+".");
 }

 public void changeName(String newName){
 this.name = newName;
 this.power = CalcPower();
 System.out.println("Name changed and power recalculated.");
 }
}