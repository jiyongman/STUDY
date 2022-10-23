package boj;
import java.util.*;

public class BOJ23885 { // 비숍 투어

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 체스판의 크기(row)
        int M = sc.nextInt(); // 체스판의 크기(column)
        int sx = sc.nextInt(); // 출발점의 좌표(x)
        int sy = sc.nextInt(); // 출발점의 좌표(y)
        int ex = sc.nextInt(); // 도착점의 좌표(x)
        int ey = sc.nextInt(); // 도착점의 좌표(y)
        int start = (sx + sy) % 2;
        int end = (ex + ey) % 2;

        if (sx == ex && sy == ey) {
            System.out.println("YES");
        } else if (N == 1 || M == 1) {
            System.out.println("NO");
        } else {
            if (start == end) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}