package boj;
import java.util.*;

public class BOJ8635 { // Zliczacz liter

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[52];

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
                    arr[str.charAt(j) - 'a']++;
                } else if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                    arr[str.charAt(j) - 'A' + 26]++;
                }
            }
        }

        for (int i = 0; i < 52; i++) {
            if (arr[i] > 0) {
                if (i < 26) {
                    System.out.printf("%c %d\n", (char) (i + 'a'), arr[i]);
                } else {
                    System.out.printf("%c %d\n", (char) (i + 'A' - 26), arr[i]);
                }
            }
        }

        sc.close();
    }
}