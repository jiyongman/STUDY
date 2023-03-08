package boj;
import java.util.*;

public class BOJ27866 { // 문자와 문자열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int i = sc.nextInt();

        System.out.println(S.charAt(i - 1));
        sc.close();
    }
}