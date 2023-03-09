package boj;
import java.util.*;

public class BOJ26552 { // Zero

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();

            while (true) {
                k++;

                if (!String.valueOf(k).contains("0")) {
                    System.out.println(k);
                    break;
                }
            }
        }

        sc.close();
    }
}