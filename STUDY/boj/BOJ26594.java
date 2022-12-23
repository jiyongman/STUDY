package boj;
import java.util.*;

public class BOJ26594 { // ZOAC 5

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                break;
            }

            N++;
        }

        System.out.println(N);
        sc.close();
    }
}