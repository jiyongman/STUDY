package boj;
import java.util.*;

public class BOJ9306 { // Practice: Roll Call

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= t; x++) {
            String str = sc.next(); // the first name
            String str2 = sc.next(); // the last name

            System.out.printf("Case %d: %s, %s\n", x, str2, str);
        }

        sc.close();
    }
}