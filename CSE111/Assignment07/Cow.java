public class Cow extends Animal{
  public String name;
  
  public String getName(){
   return this.name;
  }
  
  public Cow(){
   System.out.println("The cow says hello!");
  }
  
  public void updateSound(String sound){
  super.sound = sound;
  }
}