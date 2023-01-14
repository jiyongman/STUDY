package boj;
import java.util.*;

public class BOJ27182 { // Rain Diary

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        if (n - 7 >= 1) {
            result = n - 7;
        } else {
            result = m + 7;
        }

        System.out.println(result);
        sc.close();
    }
}