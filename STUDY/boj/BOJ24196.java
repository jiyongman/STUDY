package boj;
import java.util.*;

public class BOJ24196 { // Gömda ord

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0;

        while (i < str.length()) {
            System.out.print(str.charAt(i));

            i += (str.charAt(i) - 'A' + 1);
        }

        sc.close();
    }
}