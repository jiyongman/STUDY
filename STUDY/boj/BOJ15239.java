package boj;
import java.util.*;

public class BOJ15239 { // Password check

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of passwords

        for (int i = 0; i < N; i++) {
            int S = sc.nextInt(); // the size of the password
            String str = sc.next(); // the password to check
            int[] arr = new int[5];

            if (S >= 12) {
                arr[0]++;
            }

            for (int j = 0; j < S; j++) {
                if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
                    arr[1]++;
                } else if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                    arr[2]++;
                } else if (str.charAt(j) >= '0' && str.charAt(j) <= '9') {
                    arr[3]++;
                } else {
                    arr[4]++;
                }
            }

            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > 0) {
                    cnt++;
                }
            }

            if (cnt == 5) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }

        sc.close();
    }
}