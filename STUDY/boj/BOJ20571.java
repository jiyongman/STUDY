package boj;
import java.util.*;

public class BOJ20571 { // Elevators

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();
        int result = 0;

        if (N != 1) {
            if (str.equals("residential")) {
                result = (N - 1) / 5 + 1;
            } else if (str.equals("commercial")) {
                result = (N - 1) / 7 + 1;
            } else {
                result = (N - 1) / 4 + 1;
            }
        }

        System.out.println(result);
        sc.close();
    }
}