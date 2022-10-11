package boj;
import java.util.*;

public class BOJ14910 { // 오르막

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tmp = -1000000;
        int cnt = 0;
        int i = 0;

        while (sc.hasNext()) {
            int N = sc.nextInt();

            if (N >= tmp) {
                cnt++;
            }

            tmp = N;
            i++;
        }

        if (cnt == i) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }

        sc.close();
    }
}