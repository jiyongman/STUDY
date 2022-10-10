package boj;
import java.util.*;

public class BOJ25814 { // Heavy Numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int sum = 0;

        while (n > 0) {
            cnt++;
            sum += n % 10;
            n /= 10;
        }

        int a = cnt * sum;
        cnt = 0;
        sum = 0;

        while (m > 0) {
            cnt++;
            sum += m % 10;
            m /= 10;
        }

        int b = cnt * sum;

        if (a > b) {
            System.out.println(1);
        } else if (a < b) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}