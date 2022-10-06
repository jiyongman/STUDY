package boj;
import java.util.*;

public class BOJ7572 { // 간지(干支)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 연도
        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};

        System.out.printf("%s%d", arr[(N + 8) % 12], (N + 6) % 10);
        sc.close();
    }
}