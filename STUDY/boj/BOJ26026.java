package boj;
import java.util.*;

public class BOJ26026 { // Coffee Cup Combo

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // the number of lectures Jonna attends
        char[] s = sc.nextLine().toCharArray();
        int coffee = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (s[i] == '1') {
                coffee = 2;
                cnt++;
            } else {
                if (coffee > 0) {
                    coffee--;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}