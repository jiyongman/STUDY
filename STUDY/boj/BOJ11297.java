package boj;
import java.util.*;

public class BOJ11297 { // Cypher

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int d = Integer.parseInt(st.nextToken()); // the day
            int m = Integer.parseInt(st.nextToken()); // the month
            int y = Integer.parseInt(st.nextToken()); // the year

            if (d == 0 && m == 0 && y == 0) {
                break;
            }

            char[] arr = sc.nextLine().toCharArray();
            int S = (d + m + y) % 25 + 1; // the shift in his Caesar cypher

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'a' && arr[i] <= 'z') {
                    arr[i] -= S;

                    if (arr[i] < 'a') {
                        arr[i] += 26;
                    }
                }

                System.out.print(arr[i]);
            }

            System.out.println();
        }

        sc.close();
    }
}