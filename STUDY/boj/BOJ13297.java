package boj;
import java.util.*;

public class BOJ13297 { // Quick Estimates

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            System.out.println(str.length());
        }

        sc.close();
    }
}