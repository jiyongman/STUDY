package boj;
import java.util.*;

public class BOJ21567 { // 숫자의 개수 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        String str = String.valueOf(A * B * C);
        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}