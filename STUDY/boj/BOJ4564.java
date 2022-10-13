package boj;
import java.util.*;

public class BOJ4564 { // 숫자 카드놀이

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int S = sc.nextInt(); // 숫자 카드놀이의 시작값

            if (S == 0) {
                break;
            }

            System.out.printf("%d ", S);

            while (S >= 10) {
                int tmp = 1;

                while (S > 0) {
                    tmp *= S % 10;
                    S /= 10;
                }

                S = tmp;
                System.out.printf("%d ", S);
            }

            System.out.println();
        }

        sc.close();
    }
}