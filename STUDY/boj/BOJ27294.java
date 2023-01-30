package boj;
import java.util.*;

public class BOJ27294 { // 몇개고?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int S = sc.nextInt();

        if (T >= 12 && T <= 16 && S == 0) {
            System.out.println(320);
        } else {
            System.out.println(280);
        }

        sc.close();
    }
}