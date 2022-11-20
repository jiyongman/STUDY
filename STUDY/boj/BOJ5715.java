package boj;
import java.util.*;

public class BOJ5715 { // Jingle Composing

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = {'W', 'H', 'Q', 'E', 'S', 'T', 'X'};
        int[] arr2 = {64, 32, 16, 8, 4, 2, 1};

        while (true) {
            String[] arr3 = sc.nextLine().split("/");

            if (arr3[0].equals("*")) {
                break;
            }

            int cnt = 0;

            for (int i = 0; i < arr3.length; i++) {
                int sum = 0;

                for (int j = 0; j < arr3[i].length(); j++) {
                    for (int k = 0; k < 7; k++) {
                        if (arr3[i].charAt(j) == arr[k]) {
                            sum += arr2[k];
                        }
                    }
                }

                if (sum == 64) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}