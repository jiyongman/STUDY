package boj;
import java.util.*;

public class BOJ26068 { // 치킨댄스를 추는 곰곰이를 본 임스 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();

            if (Integer.parseInt(str.substring(2)) <= 90) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}