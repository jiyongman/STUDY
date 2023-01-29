package boj;
import java.util.*;

public class BOJ27332 { // 11 月 (November)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A + B * 7 >= 1 && A + B * 7 <= 30) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}