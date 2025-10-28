import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;

            int count = 0;
            for (int k = 0; k < N; k++) {
                if (arr[k] == arr[i]) count++;
            }

            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}
