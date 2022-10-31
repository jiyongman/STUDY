package boj;
import java.util.*;

public class BOJ11605 { // Magic Trick

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of test cases
        String[] arr = new String[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next(); // the operation
            arr2[i] = sc.nextInt(); // the operand
        }
        
        int result = 0;

        for (int i = 1; i <= 100; i++) {
            double k = i;
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j].equals("ADD")) {
                    k += arr2[j];
                } else if (arr[j].equals("SUBTRACT")) {
                    k -= arr2[j];
                } else if (arr[j].equals("MULTIPLY")) {
                    k *= arr2[j];
                } else {
                    k /= arr2[j];
                }

                if (k < 0 || k % 1 != 0) {
                    cnt++;
                }
            }

            if (cnt > 0) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}