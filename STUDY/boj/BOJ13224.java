package boj;
import java.util.*;

public class BOJ13224 { // Chop Cup

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[3];
        arr[0] = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                int tmp = arr[0];
                arr[0] = arr[1];
                arr[1] = tmp;
            } else if (str.charAt(i) == 'B') {
                int tmp = arr[1];
                arr[1] = arr[2];
                arr[2] = tmp;
            } else {
                int tmp = arr[0];
                arr[0] = arr[2];
                arr[2] = tmp;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] > 0) {
                System.out.println(i + 1);
            }
        }

        sc.close();
    }
}