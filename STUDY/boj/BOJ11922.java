package boj;
import java.util.*;

public class BOJ11922 { // BELA

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of hands
        String B = sc.next(); // the value of suit
        char[] arr = {'A', 'K', 'Q', 'J', 'T', '9', '8', '7'}; // card symbol
        int[] arr2 = {11, 4, 3, 20, 10, 14, 0, 0}; // card scoring value if dominant suit
        int[] arr3 = {11, 4, 3, 2, 10, 0, 0, 0}; // card scoring value if not dominant suit
        int sum = 0;

        for (int i = 0; i < 4 * N; i++) {
            String K = sc.next();

            for (int j = 0; j < 8; j++) {
                if (K.charAt(0) == arr[j]) {
                    if (K.charAt(1) == B.charAt(0)) {
                        sum += arr2[j];
                    } else {
                        sum += arr3[j];
                    }
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}