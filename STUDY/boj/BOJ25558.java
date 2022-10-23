package boj;
import java.util.*;

public class BOJ25558 { // 내비게이션

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 실험에 사용한 내비게이션의 개수
        long sx = sc.nextLong(); // 시작점(x)
        long sy = sc.nextLong(); // 시작점(y)
        long ex = sc.nextLong(); // 도착점(x)
        long ey = sc.nextLong(); // 도착점(y)
        long min = Long.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < N; i++) {
            int M = sc.nextInt(); // 순차적으로 방문해야 하는 중간 지점들의 위치의 개수
            long x = sx;
            long y = sy;
            long d = 0;

            for (int j = 0; j < M; j++) {
                long x1 = sc.nextLong(); // 방문해야 하는 중간 지점(x)
                long y1 = sc.nextLong(); // 방문해야 하는 중간 지점(y)
                d += Math.abs(x - x1) + Math.abs(y - y1);
                x = x1;
                y = y1;
            }

            d += Math.abs(x - ex) + Math.abs(y - ey);

            if (min > d) {
                min = d;
                result = i + 1;
            }
        }

        System.out.println(result);
        sc.close();
    }
}