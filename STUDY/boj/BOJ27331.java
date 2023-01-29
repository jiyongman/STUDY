package boj;
import java.util.*;

public class BOJ27331 { // 2 桁の整数 (Two-digit Integer)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A * 10 + B);
        sc.close();
    }
}