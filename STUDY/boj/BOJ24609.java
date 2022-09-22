package boj;
import java.util.*;

public class BOJ24609 { // Overdraft

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of transactions
        int balance = 0;
        int min = 2147483647;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt(); // the transactions
            balance += t;
            min = Math.min(min, Math.min(balance, 0));
        }

        System.out.println(-min);
        sc.close();
    }   
}