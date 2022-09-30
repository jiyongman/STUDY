package boj;
import java.util.*;

public class BOJ1357 { // 뒤집힌 덧셈

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        String Y = sc.next();
        StringBuffer sb = new StringBuffer(X);
        StringBuffer sb2 = new StringBuffer(Y);
        String str = sb.reverse().toString();
        String str2 = sb2.reverse().toString();
        int n = Integer.parseInt(str) + Integer.parseInt(str2);
        String tmp = Integer.toString(n);
        StringBuffer sb3 = new StringBuffer(tmp);
        String str3 = sb3.reverse().toString();
        int result = Integer.parseInt(str3);

        System.out.println(result);
        sc.close();
    }
}