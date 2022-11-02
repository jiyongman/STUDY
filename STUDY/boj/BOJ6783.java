package boj;
import java.util.*;

public class BOJ6783 { // English or French?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int s = 0;
        int t = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 's' || str.charAt(j) == 'S') {
                    s++;
                } else if (str.charAt(j) == 't' || str.charAt(j) == 'T') {
                    t++;
                }
            }
        }

        if (s < t) {
            System.out.println("English");
        } else {
            System.out.println("French");
        }

        sc.close();
    }
}