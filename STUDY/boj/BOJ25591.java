package boj;
import java.util.*;

public class BOJ25591 { // 푸앙이와 종윤이

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 100 - x;
        int b = 100 - y;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;

        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.println((c + q) + " " + r);
        sc.close();
    }   
}