package boj;
import java.util.*;

public class BOJ14323 { // Country Leader (Large)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int N = Integer.parseInt(sc.nextLine()); // the number of people in the country
            String[] arr = new String[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLine();
            }

            Arrays.sort(arr);

            int max = 0;
            String y = "";

            for (int i = 0; i < N; i++) {
                int[] arr2 = new int[26];

                for (int j = 0; j < arr[i].length(); j++) {
                    if (arr[i].charAt(j) >= 'A' && arr[i].charAt(j) <= 'Z') {
                        arr2[arr[i].charAt(j) - 'A']++;
                    }
                }

                int cnt = 0;

                for (int j = 0; j < 26; j++) {
                    if (arr2[j] > 0) {
                        cnt++;
                    }
                }

                if (max < cnt) {
                    max = cnt;
                    y = arr[i];
                }
            }

            System.out.printf("Case #%d: %s\n", x, y);
        }

        sc.close();
    }
}