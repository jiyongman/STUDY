package boj;
import java.util.*;

public class BOJ2745 { // 진법 변환

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        int result = Integer.parseInt(N, B);

        System.out.println(result);
        sc.close();
    }
}