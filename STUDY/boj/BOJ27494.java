package boj;
import java.util.*;

public class BOJ27494 { // 2023년은 검은 토끼의 해

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] win = {'2', '0', '2', '3'};
        int cnt = 0;

        for (int i = 0; i <= N; i++) {
            char[] lottery = String.valueOf(i).toCharArray();
            int k = 0;

            for (int j = 0; j < lottery.length; j++) {
                if (lottery[j] == win[k]) {
                    k++;
                }

                if (k == 4) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}