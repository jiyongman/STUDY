package boj;
import java.util.*;

public class BOJ27541 { // 末尾の文字 (Last Letter)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        if (S.charAt(S.length() - 1) == 'G') {
            System.out.print(S.substring(0, S.length() - 1));
        } else {
            System.out.print(S + "G");
        }

        sc.close();
    }
}