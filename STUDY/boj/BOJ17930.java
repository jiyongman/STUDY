package boj;
import java.util.*;

public class BOJ17930 { // Hanging Out on the Terrace

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // the fire safety limit
        int x = sc.nextInt(); // the number of events
        int tmp = 0;
        int cnt = 0;

        for (int i = 0; i < x; i++) {
            String str = sc.next();
            int p = sc.nextInt();

            if (str.equals("enter")) {
                tmp += p;

                if (tmp > L) {
                    tmp -= p;
                    cnt++;
                }
            } else {
                tmp -= p;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}