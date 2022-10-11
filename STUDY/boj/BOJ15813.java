package boj;
import java.util.*;

public class BOJ15813 { // 너의 이름은 몇 점이니?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 이름의 길이
        String str = sc.next(); // 이름
        int sum = 0; // 이름점수

        for (int i = 0; i < N; i++) {
            sum += str.charAt(i) - 'A' + 1;
        }

        System.out.println(sum);
        sc.close();
    }
}