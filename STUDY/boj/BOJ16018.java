package boj;
import java.util.*;

public class BOJ16018 { // Occupy parking

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next(); // the information about yesterday’s parking spaces
        String str2 = sc.next(); // the information about today’s parking spaces
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == 'C' && str2.charAt(i) == 'C') {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}