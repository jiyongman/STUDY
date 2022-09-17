package boj;
import java.util.*;

public class BOJ20492 { // 세금

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 상금의 금액

        System.out.print((int) (N * 0.78) + " " + (int) (N * 0.8 + (N * 0.2 * 0.78)));
        sc.close();
    }
}