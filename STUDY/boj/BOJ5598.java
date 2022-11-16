package boj;
import java.util.*;

public class BOJ5598 { // 카이사르 암호

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 3;

            if (arr[i] < 'A') {
                arr[i] += 26;
            }

            System.out.print(arr[i]);
        }

        sc.close();
    }
}