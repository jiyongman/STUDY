package boj;
import java.util.*;

public class BOJ27918 { // 탁구 경기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dalgoo = 0;
        int phonix = 0;

        for (int i = 0; i < N; i++) {
            char ch = sc.next().charAt(0);

            if (ch == 'D') {
                dalgoo++;
            } else {
                phonix++;
            }

            if (Math.abs(dalgoo - phonix) > 1) {
                break;
            }
        }

        System.out.printf("%d:%d", dalgoo, phonix);
        sc.close();
    }
}