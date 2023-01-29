package boj;
import java.util.*;

public class BOJ27324 { // ゾロ目 (Same Numbers)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N / 10 == N % 10) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}