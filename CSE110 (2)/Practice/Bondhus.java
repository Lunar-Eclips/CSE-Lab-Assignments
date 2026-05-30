public class Bondhus extends SocialMedia{
 public String [] sentTexts = new String [5];
 
 public Bondhus(String name, String mail) {
    super(name, mail);
}jew
 
 public void showSentbox(){
  System.out.println(super.userName +" SentBox:");
  boolean hasTexts = false;
  for (int i = 0; i < sentTexts.length; i++){
    if(this.sentTexts[i] != null){
    System.out.println(sentTexts[i]);
    hasTexts = true;
    }
  }
  if (hasTexts == false) System.out.println("No sent messages");
  }
 
 public void sendMessage(String msg){
 boolean messageWasSent = false;
 for (int i = 0; i < sentTexts.length; i++){
   if(this.sentTexts[i] == null){
   this.sentTexts[i] = msg;
   messageWasSent = true;
   break;
   }
 }
 if (messageWasSent == false) System.out.println("Sentbox is full");
 }
 
}