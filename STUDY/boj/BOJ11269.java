package boj;
import java.util.*;

public class BOJ11269 { // Cryptographer’s Conundrum

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int cnt = 0;

        for (int i = 0; i < arr.length; i += 3) {
            if (arr[i] != 'P') {
                cnt++;
            }
            if (arr[i + 1] != 'E') {
                cnt++;
            }
            if (arr[i + 2] != 'R') {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}