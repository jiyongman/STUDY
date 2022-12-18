package boj;
import java.util.*;

public class BOJ26531 { // Simple Sum

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int a = arr[0] - '0';
        int b = arr[4] - '0';
        int c = arr[8] - '0';

        if (a + b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}