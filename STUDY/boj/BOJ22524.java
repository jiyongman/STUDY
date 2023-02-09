package boj;
import java.util.*;

public class BOJ22524 { // koukyoukoukokukikou

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] left = {'q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v', 'b'};
        char[] right = {'y', 'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'n', 'm'};

        while (true) {
            String str = sc.next();

            if (str.equals("#")) {
                break;
            }

            boolean left_hand = false;
            boolean right_hand = false;

            for (int i = 0; i < left.length; i++) {
                if (str.charAt(0) == left[i]) {
                    left_hand = true;
                    break;
                }
            }

            if (!left_hand) {
                right_hand = true;
            }

            int cnt = 0;

            for (int i = 1; i < str.length(); i++) {
                for (int j = 0; j < left.length; j++) {
                    if (str.charAt(i) == left[j]) {
                        if (!left_hand) {
                            left_hand = true;
                            cnt++;
                        }
                        right_hand = false;
                    }
                }

                for (int j = 0; j < right.length; j++) {
                    if (str.charAt(i) == right[j]) {
                        if (!right_hand) {
                            right_hand = true;
                            cnt++;
                        }
                        left_hand = false;
                    }
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}