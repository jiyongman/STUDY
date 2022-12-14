package boj;
import java.util.*;

public class BOJ26314 { // Vowel Count

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of names to check

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int c = 0; // the number of consonants
            int v = 0; // the number of vowels

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    c++;
                } else {
                    v++;
                }
            }

            System.out.println(str);

            if (c < v) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}