package boj;
import java.util.*;

public class BOJ28074 { // 모비스

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.contains("M") && str.contains("O") && str.contains("B") && str.contains("I") && str.contains("S")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}