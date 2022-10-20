package boj;
import java.util.*;

public class BOJ17285 { // XORChic

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine(); // XOR 연산이 수행된 문자열
        int key = T.charAt(0) ^ 'C';

        for (int i = 0; i < T.length(); i++) {
            char ch = (char) (T.charAt(i) ^ key);

            System.out.print(ch);
        }

        sc.close();
    }
}