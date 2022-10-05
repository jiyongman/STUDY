package boj;
import java.util.*;

public class BOJ2355 { // 시그마

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long sum = 0;

        if (A <= B) {
            sum = (B + A) * (B + 1 - A) / 2;
        } else {
            sum = (A + B) * (A + 1 - B) / 2;
        }

        System.out.println(sum);
        sc.close();
    }
}