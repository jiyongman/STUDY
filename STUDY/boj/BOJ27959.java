package boj;
import java.util.*;

public class BOJ27959 { // 초코바

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (100 * N >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}