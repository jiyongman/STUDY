package boj;
import java.util.*;

public class BOJ6993 { // Shift Letters

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            String w = sc.next();
            int n = sc.nextInt();
            String str = "";
            str += w.substring(w.length() - n);
            str += w.substring(0, w.length() - n);

            System.out.printf("Shifting %s by %d positions gives us: %s\n", w, n, str);
        }

        sc.close();
    }
}