package boj;
import java.util.*;

public class BOJ25915 { // 연세여 사랑한다

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "ILOVEYONSEI";
        String str2 = sc.next();
        int sum = Math.abs(str.charAt(0) - str2.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            sum += Math.abs(str.charAt(i) - str.charAt(i - 1));
        }

        System.out.println(sum);
        sc.close();
    }
}