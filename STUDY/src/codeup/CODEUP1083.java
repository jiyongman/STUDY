package codeup;
import java.util.*;

public class CODEUP1083 { // 3 6 9 게임의 왕이 되자!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}