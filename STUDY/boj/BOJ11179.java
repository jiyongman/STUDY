package boj;
import java.util.*;

public class BOJ11179 { // 2진수 뒤집기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = Integer.toBinaryString(N);
        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }

        int result = Integer.valueOf(str2, 2);

        System.out.println(result);
        sc.close();
    }
}