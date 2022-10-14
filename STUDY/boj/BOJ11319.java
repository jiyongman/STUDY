package boj;
import java.util.*;

public class BOJ11319 { // Count Me In

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int S = Integer.parseInt(sc.nextLine()); // the number of sentences

        for (int i = 0; i < S; i++) {
            String str = sc.nextLine().toLowerCase();
            int c = 0; // the number of consonants
            int v = 0; // the number of vowels

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == ' ') {
                    continue;
                } else if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    c++;
                } else {
                    v++;
                }
            }

            System.out.printf("%d %d\n", c, v);
        }

        sc.close();
    }
}