package boj;
import java.util.*;

public class BOJ24608 { // Average Character

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }

        int avg = sum / s.length();

        System.out.println((char) avg);
        sc.close();
    }
}