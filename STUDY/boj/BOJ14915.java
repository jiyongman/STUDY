package boj;
import java.util.*;

public class BOJ14915 { // 진수 변환기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        String str = Integer.toString(m, n).toUpperCase();

        System.out.println(str);
        sc.close();
    }
}