package codeup;
import java.util.*;

public class CODEUP1081 { // 주사위를 2개 던지면?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }

        sc.close();
    }
}