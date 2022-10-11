package boj;
import java.util.*;

public class BOJ8949 { // 대충 더해

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String tmp = "";

        if (A.length() > B.length()) {
            for (int i = 0; i < A.length() - B.length(); i++) {
                tmp += "0";
            }

            tmp += B;
            B = tmp;
        } else if (A.length() < B.length()) {
            for (int i = 0; i < B.length() - A.length(); i++) {
                tmp += "0";
            }

            tmp += A;
            A = tmp;
        }

        for (int i = 0; i < A.length(); i++) {
            int n = (A.charAt(i) - '0') + (B.charAt(i) - '0');

            System.out.print(n);
        }

        sc.close();
    }
}