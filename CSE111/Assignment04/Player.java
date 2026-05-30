public class Player{
 public String name;
 public int hp;
 public String[] defeatedVillains = new String[5];
 public int defeatedCount = 0;
 
 public Player(String name, int hp){
  this.name = name;
  this.hp = hp;
  System.out.println(name + " joined the game");
  System.out.println("HP: " + hp);
 }
 
 public Player(String name){
  this(name, 100);
 }
 
 public void viewInfo(){
  System.out.println("Player Name: " + this.name);
  System.out.println("Current HP: " + this.hp);
  if(defeatedCount > 0){
   System.out.println("Defeated:");
   for(int i = 0; i < defeatedCount; i++){
    System.out.print(defeatedVillains[i] + ", ");
   }
   System.out.println();
  }
 }
 
 public void defeatVillain(String name, int hp){
  if(this.hp < hp){
   System.out.println("failed to defeat " + name);
   return;
  }
  if(defeatedCount >= 5) return;
  System.out.println("defeated " + name);
  this.hp += hp;
  defeatedVillains[defeatedCount++] = name;
 }
 
 public void defeatVillain(char boost, String name, int hp){
  int m = boost - '0';
  int boosted = this.hp * m;
  System.out.println("HP with " + boost + "x boost: " + boosted);
  if(boosted < hp){
   System.out.println("failed to defeat " + name);
   return;
  }
  if(defeatedCount >= 5) return;
  System.out.println("defeated " + name);
  this.hp += hp * m;
  defeatedVillains[defeatedCount++] = name;
 }
 
 public void defeatVillain(Player p){
  if(this.hp < p.hp){
   System.out.println("failed to defeat " + p.name);
   return;
  }
  if(defeatedCount >= 5) return;
  System.out.println("defeated " + p.name);
  this.hp += p.hp;
  defeatedVillains[defeatedCount++] = p.name;
 }
}
