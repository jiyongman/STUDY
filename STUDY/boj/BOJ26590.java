package boj;
import java.util.*;

public class BOJ26590 { // Word Mix

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        int len = Math.min(first.length(), second.length());
        int i = 0;

        while (i < len) {
            if (i % 2 == 0) {
                System.out.print(first.charAt(i));
            } else {
                System.out.print(second.charAt(i));
            }

            i++;
        }

        sc.close();
    }
}