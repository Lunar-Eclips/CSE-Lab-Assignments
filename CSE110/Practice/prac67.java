import java.util.Arrays;
public class prac67{
  public static void main (String [] args){
    int [] arr = {7,3,5,80,24,17,45,36,47,400,271,730,1000,53,5324,234,23,4523,2324532,5525,5,2,525,25,24547,4};
    for (int i = 0; i < arr.length; i++){
      for (int j = i + 1; j < arr.length; j++){
        if (arr[i] > arr[j]){
        int temp = 0;
        temp = arr[i];
        arr[i] = arr [j];
        arr[j] = temp;
        }
      }
    }
    System.out.print(Arrays.toString(arr));;
  }
}