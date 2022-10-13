package boj;
import java.util.*;

public class BOJ2909 { // 캔디 구매

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); // 사탕의 가격
        int K = sc.nextInt(); // 상근이가 가지고 있는 지폐의 액면가에 적혀있는 0의 개수
        int result = (int) (Math.round(C / Math.pow(10, K)) * Math.pow(10, K));

        System.out.println(result);
        sc.close();
    }
}