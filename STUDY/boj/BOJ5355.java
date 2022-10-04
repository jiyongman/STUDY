package boj;
import java.util.*;

public class BOJ5355 { // 화성 수학

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            double d = sc.nextDouble();
            String str = sc.nextLine();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '@') {
                    d *= 3;
                } else if (str.charAt(j) == '%') {
                    d += 5;
                } else if (str.charAt(j) == '#') {
                    d -= 7;
                }
            }

            System.out.printf("%.2f\n", d);
        }

        sc.close();
    }
}