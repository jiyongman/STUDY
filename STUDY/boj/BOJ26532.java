package boj;
import java.util.*;

public class BOJ26532 { // Acres

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;

        if (x * y % 24200 == 0) {
            result = x * y / 24200;
        } else {
            result = x * y / 24200 + 1;
        }

        System.out.println(result);
        sc.close();
    }
}