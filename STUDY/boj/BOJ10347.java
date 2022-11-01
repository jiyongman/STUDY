package boj;
import java.util.*;

public class BOJ10347 { // Reverse Rot

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

        while (true) {
            int N = sc.nextInt();

            if (N == 0) {
                break;
            }

            String str2 = sc.next();
            str2 = new StringBuffer(str2).reverse().toString();

            for (int i = 0; i < str2.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (str2.charAt(i) == str.charAt(j)) {
                        System.out.print((char) (str.charAt((j + N) % str.length())));
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}