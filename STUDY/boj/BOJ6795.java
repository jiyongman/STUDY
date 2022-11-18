package boj;
import java.util.*;

public class BOJ6795 { // Up and Down

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int s = sc.nextInt();
        int nikky = 0;
        int byron = 0;

        for (int i = 0; i < s; i++) {
            if (i % (a + b) < a) {
                nikky++;
            } else {
                nikky--;
            }

            if (i % (c + d) < c) {
                byron++;
            } else {
                byron--;
            }
        }

        if (nikky > byron) {
            System.out.println("Nikky");
        } else if (nikky < byron) {
            System.out.println("Byron");
        } else {
            System.out.println("Tied");
        }

        sc.close();
    }
}