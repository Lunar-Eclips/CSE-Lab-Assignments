import java.util.Scanner;

public class Task02{
  public static void main (String [] args){
  
    Scanner sc = new Scanner ( System.in );
    
    String input =  sc.nextLine();
    String output ="";
    
    for( int i = 0; i < input.length(); i++){
      if ( input.charAt(i) != 'a'){
    output += (char) ( (int) input.charAt(i) - 1 );
    } else {
    output += 'z';
    }
    }
    System.out.println(output);
  }
}