package boj;
import java.util.*;

public class BOJ5585 { // 거스름돈

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 타로가 지불할 돈
        N = 1000 - N;
        int result = 0;

        result += N / 500;
        N %= 500;
        result += N / 100;
        N %= 100;
        result += N / 50;
        N %= 50;
        result += N / 10;
        N %= 10;
        result += N / 5;
        N %= 5;
        result += N;

        System.out.println(result);
        sc.close();
    }
}