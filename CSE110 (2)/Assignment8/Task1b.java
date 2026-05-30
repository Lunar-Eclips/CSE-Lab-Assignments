public class Task1b{
  public static boolean isPerfect(int input){
  int sum = 0;
  for (int i = 1; i < input; i++){
    if (input % i == 0){
      sum += i;
    }
  }
  if (sum == input) return true;
  else return false;
}

}