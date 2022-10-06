package boj;
import java.util.*;

public class BOJ10829 { // 이진수 변환

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String str = Long.toBinaryString(N);

        System.out.println(str);
        sc.close();
    }
}