public class ConnectFriends{
  public String name;
  public int max;
  public String[] sent = new String[10];
  public int count = 0;
  
  public ConnectFriends(String name){
    this.name = name;
    this.max = 2;
    System.out.println("Welcome to ConnectFriends, " + name);
  }
  
  public ConnectFriends(String name, int max){
    this.name = name;
    this.max = max;
    System.out.println("Welcome to ConnectFriends, " + name);
  }
  
  public void sendFriendRequest(ConnectFriends... arr){
    for(int i=0; i<arr.length; i++){
      send(arr[i]);
    }
  }
  
  private void send(ConnectFriends c){
    if(count < max){
      sent[count] = c.name;
      count++;
      System.out.println(this.name + " sent a friend request to " + c.name + ".");
    }else{
      System.out.println(this.name + " has reached the friend request limit!");
    }
  }
  
  public void removeRequest(String n){
    for(int i=0; i<count; i++){
      if(sent[i].equals(n)){
        System.out.println("Reuqest to add " + n + " is removed for " + this.name + ".");
        for(int j=i; j<count-1; j++){
          sent[j] = sent[j+1];
        }
        sent[count-1] = null;
        count--;
        return;
      }
    }
    System.out.println(n + " is not in " + this.name + "'s sent request list.");
  }
  
  public void showDetails(){
    System.out.println("User Name: " + name);
    System.out.println("Maximum number of Sent Friend Request: " + max);
    System.out.println("Total Friends Request: " + count);
    System.out.print("Sent Friends Request: ");
    for(int i=0; i<count; i++){
      System.out.print(sent[i] + " ");
    }
    System.out.println();
  }
}
