package boj;
import java.util.*;

public class BOJ4436 { // 엘프의 검

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long n = sc.nextInt();
            boolean[] check = new boolean[10];
            long k = 1;

            while (true) {
                String tmp = String.valueOf(k * n);

                for (int i = 0; i < tmp.length(); i++) {
                    check[tmp.charAt(i) - '0'] = true;
                }

                boolean found = true;

                for (int i = 0; i < 10; i++) {
                    if (!check[i]) {
                        found = false;
                    }
                }

                if (found) {
                    System.out.println(k);
                    break;
                }

                k++;
            }
        }

        sc.close();
    }
}