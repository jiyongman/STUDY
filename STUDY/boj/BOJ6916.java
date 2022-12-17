package boj;
import java.util.*;

public class BOJ6916 { // 0123456789

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1 || n == 4) {
            System.out.println();
        } else {
            System.out.println(" * * *");
        }

        if (n == 5 || n == 6) {
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
        } else if (n == 1 || n == 2 || n == 3 || n == 7) {
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
        } else {
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
        }

        if (n == 0 || n == 1 || n == 7) {
            System.out.println();
        } else {
            System.out.println(" * * *");
        }

        if (n == 2) {
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
        } else if (n == 0 || n == 6 || n == 8) {
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
        } else {
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
        }

        if (n == 1 || n == 4 || n == 7) {
            System.out.println();
        } else {
            System.out.println(" * * *");
        }

        sc.close();
    }
}