package boj;
import java.util.*;

public class BOJ3486 { // Adding Reversed Numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of test cases

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            String str2 = sc.next();
            str = new StringBuffer(str).reverse().toString();
            str2 = new StringBuffer(str2).reverse().toString();
            int sum = Integer.parseInt(str) + Integer.parseInt(str2);
            String str3 = String.valueOf(sum);
            str3 = new StringBuffer(str3).reverse().toString();
            int result = Integer.parseInt(str3);

            System.out.println(result);
        }

        sc.close();
    }
}