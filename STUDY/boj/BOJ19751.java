package boj;
import java.util.*;

public class BOJ19751 { // Fractification

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] arr = new double[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);

        if (arr[0] / arr[2] + arr[1] / arr[3] < arr[0] / arr[3] + arr[1] / arr[2]) {
            System.out.println((int) arr[0] + " " + (int) arr[2] + " " + (int) arr[1] + " " + (int) arr[3]);
        } else {
            System.out.println((int) arr[0] + " " + (int) arr[3] + " " + (int) arr[1] + " " + (int) arr[2]);
        }

        sc.close();
    }
}