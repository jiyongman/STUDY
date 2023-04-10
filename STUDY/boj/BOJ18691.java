package boj;
import java.util.*;

public class BOJ18691 { // Pokemon Buddy

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int G = sc.nextInt();
            int C = sc.nextInt();
            int E = sc.nextInt();
            int result = 0;

            if (E - C > 0) {
                if (G == 1) {
                    result = E - C;
                } else if (G == 2) {
                    result = (E - C) * 3;
                } else {
                    result = (E - C) * 5;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}