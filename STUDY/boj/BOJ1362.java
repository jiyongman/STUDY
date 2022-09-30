package boj;
import java.util.*;

public class BOJ1362 { // 펫

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = 1;

        while (true) {
            int o = sc.nextInt(); // 적정 체중
            int w = sc.nextInt(); // 실제 체중

            if (o == 0 && w == 0) {
                break;
            }

            int cnt = 0;

            while (true) {
                String str = sc.next(); // 펫에 가할 작용
                int n = sc.nextInt();

                if (str.equals("#") && n == 0) {
                    break;
                }

                if (str.equals("E")) {
                    w -= n;
                } else if (str.equals("F")) {
                    w += n;
                }

                if (w <= 0) {
                    cnt++;
                }
            }

            System.out.print(s + " ");

            if (cnt == 1) {
                System.out.println("RIP");
            } else if (2 * w > o && w < 2 * o) {
                System.out.println(":-)");
            } else {
                System.out.println(":-(");
            }

            s++;
        }

        sc.close();
    }
}