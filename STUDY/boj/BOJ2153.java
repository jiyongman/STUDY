package boj;
import java.util.*;

public class BOJ2153 { // 소수 단어

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                sum += str.charAt(i) - 'a' + 1;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                sum += str.charAt(i) - 'A' + 27;
            }
        }

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                System.out.println("It is not a prime word.");
                return;
            }
        }

        System.out.println("It is a prime word.");
        sc.close();
    }
}