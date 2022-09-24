package boj;
import java.util.*;

public class BOJ21280 { // Förvirrad föreläsare

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of scheduled lectures in each of the weeks
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int X = 0;
        int Y = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i] - arr[i - 1] < 0) {
                X += arr[i - 1] - arr[i];
            } else if (arr[i] - arr[i - 1] > 0){
                Y += arr[i] - arr[i - 1];
            }
        }

        System.out.println(X + " " + Y);
        sc.close();
    }
}