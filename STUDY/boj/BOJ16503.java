package boj;
import java.util.*;

public class BOJ16503 { // 괄호 없는 사칙연산

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K1 = sc.nextInt();
        String O1 = sc.next();
        int K2 = sc.nextInt();
        String O2 = sc.next();
        int K3 = sc.nextInt();
        int min = 0;
        int max = 0;

        if (O1.equals("+")) {
            if (O2.equals("+")) {
                max = Math.max((K1 + K2) + K3, K1 + (K2 + K3));
                min = Math.min((K1 + K2) + K3, K1 + (K2 + K3));
            } else if (O2.equals("-")) {
                max = Math.max((K1 + K2) - K3, K1 + (K2 - K3));
                min = Math.min((K1 + K2) - K3, K1 + (K2 - K3));
            } else if (O2.equals("*")) {
                max = Math.max((K1 + K2) * K3, K1 + (K2 * K3));
                min = Math.min((K1 + K2) * K3, K1 + (K2 * K3));
            } else {
                max = Math.max((K1 + K2) / K3, K1 + (K2 / K3));
                min = Math.min((K1 + K2) / K3, K1 + (K2 / K3));
            }
        } else if (O1.equals("-")) {
            if (O2.equals("+")) {
                max = Math.max((K1 - K2) + K3, K1 - (K2 + K3));
                min = Math.min((K1 - K2) + K3, K1 - (K2 + K3));
            } else if (O2.equals("-")) {
                max = Math.max((K1 - K2) - K3, K1 - (K2 - K3));
                min = Math.min((K1 - K2) - K3, K1 - (K2 - K3));
            } else if (O2.equals("*")) {
                max = Math.max((K1 - K2) * K3, K1 - (K2 * K3));
                min = Math.min((K1 - K2) * K3, K1 - (K2 * K3));
            } else {
                max = Math.max((K1 - K2) / K3, K1 - (K2 / K3));
                min = Math.min((K1 - K2) / K3, K1 - (K2 / K3));
            }
        } else if (O1.equals("*")) {
            if (O2.equals("+")) {
                max = Math.max((K1 * K2) + K3, K1 * (K2 + K3));
                min = Math.min((K1 * K2) + K3, K1 * (K2 + K3));
            } else if (O2.equals("-")) {
                max = Math.max((K1 * K2) - K3, K1 * (K2 - K3));
                min = Math.min((K1 * K2) - K3, K1 * (K2 - K3));
            } else if (O2.equals("*")) {
                max = Math.max((K1 * K2) * K3, K1 * (K2 * K3));
                min = Math.min((K1 * K2) * K3, K1 * (K2 * K3));
            } else {
                max = Math.max((K1 * K2) / K3, K1 * (K2 / K3));
                min = Math.min((K1 * K2) / K3, K1 * (K2 / K3));
            }
        } else {
            if (O2.equals("+")) {
                max = Math.max((K1 / K2) + K3, K1 / (K2 + K3));
                min = Math.min((K1 / K2) + K3, K1 / (K2 + K3));
            } else if (O2.equals("-")) {
                max = Math.max((K1 / K2) - K3, K1 / (K2 - K3));
                min = Math.min((K1 / K2) - K3, K1 / (K2 - K3));
            } else if (O2.equals("*")) {
                max = Math.max((K1 / K2) * K3, K1 / (K2 * K3));
                min = Math.min((K1 / K2) * K3, K1 / (K2 * K3));
            } else {
                max = Math.max((K1 / K2) / K3, K1 / (K2 / K3));
                min = Math.min((K1 / K2) / K3, K1 / (K2 / K3));
            }
        }

        System.out.println(min);
        System.out.println(max);
        sc.close();
    }
}