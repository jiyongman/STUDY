package boj;
import java.util.*;

public class BOJ18238 { // ZOAC 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        int tmp = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += Math.min(Math.abs((str.charAt(i) - 'A') - tmp), 26 - Math.abs((str.charAt(i) - 'A') - tmp));
            tmp = str.charAt(i) - 'A';
        }

        System.out.println(sum);
        sc.close();
    }
}