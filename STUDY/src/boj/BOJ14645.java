package boj;
import java.util.*;

public class BOJ14645 { // 와이버스 부릉부릉

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 출발역과 종착역을 제외한 정거장의 수
        int K = sc.nextInt(); // 출발역에서 탑승하는 사람의 수

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt(); // 탑승하는 인원
            int B = sc.nextInt(); // 하차하는 인원
        }

        System.out.println("비와이");
        sc.close();
    }
}