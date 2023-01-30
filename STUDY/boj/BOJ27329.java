package boj;
import java.util.*;

public class BOJ27329 { // 繰り返し文字列 (Repeating String)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        if (S.substring(0, N / 2).equals(S.substring(N / 2))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}