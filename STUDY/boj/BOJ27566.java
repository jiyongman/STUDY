package boj;
import java.util.*;

public class BOJ27566 { // Blueberry Waffle

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int f = sc.nextInt();

        if (((f / r) % 2 == 0 && f % r < r / 2) || ((f / r) % 2 != 0 && f % r > r / 2)) {
            System.out.println("up");
        } else {
            System.out.println("down");
        }

        sc.close();
    }
}