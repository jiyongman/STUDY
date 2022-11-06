package boj;
import java.util.*;

public class BOJ15181 { // Beautiful Music

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            char[] arr = sc.next().toCharArray();

            if (arr[0] == '#') {
                break;
            }

            char[] arr2 = {'C', 'D', 'E', 'F', 'G', 'A', 'B'};
            int cnt = 0;

            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < 7; j++) {
                    if (arr[i - 1] == arr2[j] && (arr[i] == arr2[(j + 2) % 7] || arr[i] == arr2[(j + 4) % 7] || arr[i] == arr2[(j + 6) % 7])) {
                        cnt++;
                    }
                }
            }

            if (cnt == arr.length - 1) {
                System.out.println("That music is beautiful.");
            } else {
                System.out.println("Ouch! That hurts my ears.");
            }
        }

        sc.close();
    }
}