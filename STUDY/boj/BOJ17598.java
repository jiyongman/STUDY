package boj;
import java.util.*;

public class BOJ17598 { // Animal King Election

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        for (int i = 0; i < 9; i++) {
            String str = sc.next();

            if (str.equals("Tiger")) {
                cnt++;
            }
        }

        if (cnt >= 5) {
            System.out.println("Tiger");
        } else {
            System.out.println("Lion");
        }

        sc.close();
    }
}