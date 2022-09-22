package boj;
import java.util.*;

public class BOJ24830 { // Broken Calculator

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong(); // the first operand
            String str = sc.next();  // the operation 
            char op = str.charAt(0); // the operation
            long b = sc.nextLong(); // the second operand

            if (op == '+') {
                result = a + b - result;
            } else if (op == '-') {
                result = (a - b) * result;;
            } else if (op == '*') {
                result = a * b * a * b;
            } else {
                if (a % 2 == 0) {
                    result = a / 2;
                } else {
                    result = (a + 1) / 2;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }   
}