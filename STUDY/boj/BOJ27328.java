package boj;
import java.util.*;

public class BOJ27328 { // 三方比較 (Three-Way Comparison)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A < B) {
            System.out.println(-1);
        } else if (A > B) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}