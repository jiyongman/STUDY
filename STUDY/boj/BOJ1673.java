package boj;
import java.util.*;

public class BOJ1673 { // 치킨 쿠폰

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt(); // 치킨 한 마리를 주문할 수 있는 치킨 쿠폰의 개수
            int k = sc.nextInt(); // 치킨 쿠폰 한 장으로 교환할 수 있는 도장의 개수
            int cnt = n + n / k;

            while (true) {
                if (n < k) {
                    break;
                }

                n = n / k + n % k;
                cnt += n / k;
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}