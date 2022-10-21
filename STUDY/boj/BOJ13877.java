package boj;
import java.util.*;

public class BOJ13877 { // 이건 무슨 진법이지?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스

        for (int i = 0; i < T; i++) {
            int K = sc.nextInt(); // 테스트 데이터의 번호
            String str = sc.next();

            int O = 0;

            if (str.contains("8") || str.contains("9")) {
                O = 0;
            } else {
                O = Integer.parseInt(str, 8);
            }

            int D = Integer.parseInt(str, 10);
            int H = Integer.parseInt(str, 16);

            System.out.printf("%d %d %d %d\n", K, O, D, H);
        }

        sc.close();
    }
}