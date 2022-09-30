package boj;
import java.util.*;

public class BOJ1550 { // 16진수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 16진수 수
        int n = Integer.parseInt(str, 16);

        System.out.println(n);
        sc.close();
    }
}