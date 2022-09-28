package boj;
import java.util.*;

public class BOJ25641 { // 균형 잡힌 소떡소떡

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 소떡소떡의 길이
        String str = sc.next();
        int s = 0;
        int t = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') {
                s++;
            } else {
                t++;
            }
        }

        int j = 0;

        while (true) {
            if (s == t) {
                break;
            } else {
                if (str.charAt(j) == 's') {
                    s--;
                } else {
                    t--;
                }
            }

            j++;
        }

        for (int i = j; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}