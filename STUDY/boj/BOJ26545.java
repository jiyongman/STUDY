package boj;
import java.util.*;

public class BOJ26545 { // Mathematics

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum);
        sc.close();
    }
}