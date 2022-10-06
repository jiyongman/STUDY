package boj;
import java.util.*;

public class BOJ11816 { // 8진수, 10진수, 16진수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = Integer.decode(str);

        System.out.println(n);
        sc.close();
    }
}