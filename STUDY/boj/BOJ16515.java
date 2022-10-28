package boj;
import java.util.*;

public class BOJ16515 { // Euler’s Number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double[] arr = new double[10001];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= 10000; i++) {
            arr[i] = arr[i - 1] * i;
        }

        for (int i = 0; i <= n; i++) {
            sum += 1 / arr[i];
        }

        System.out.println(sum);
        sc.close();
    }
}