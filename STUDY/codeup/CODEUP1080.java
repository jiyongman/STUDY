package codeup;
import java.util.*;

public class CODEUP1080 { // 언제까지 더해야 할까?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum += i;

            if (sum >= n) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}