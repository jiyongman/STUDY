package boj;
import java.util.*;

public class BOJ15177 { // Kiwis vs Kangaroos

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        String kangaroo = "KANGAROO";
        String kiwi = "KIWIBIRD";
        int kangaroos = 0;
        int kiwis = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 8; j++) {
                if (kangaroo.charAt(j) == str.charAt(i)) {
                    kangaroos++;
                }
                if (kiwi.charAt(j) == str.charAt(i)) {
                    kiwis++;
                }
            }
        }

        if (kangaroos > kiwis) {
            System.out.println("Kangaroos");
        } else if (kangaroos < kiwis) {
            System.out.println("Kiwis");
        } else {
            System.out.println("Feud continues");
        }

        sc.close();
    }
}