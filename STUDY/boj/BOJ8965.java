package boj;
import java.util.*;

public class BOJ8965 { // Circular Sequence

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            String[] arr = new String[str.length()];

            for (int j = 0; j < str.length(); j++) {
                arr[j] = str.substring(j);
                arr[j] += str.substring(0, j);
            }

            Arrays.sort(arr);

            System.out.println(arr[0]);
        }

        sc.close();
    }
}