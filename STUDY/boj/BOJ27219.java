package boj;
import java.util.*;

public class BOJ27219 { // Робинзон Крузо

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quotient = n / 5;
        int remainder = n % 5;

        for (int i = 0; i < quotient; i++) {
            System.out.print("V");
        }

        for (int i = 0; i < remainder; i++) {
            System.out.print("I");
        }

        sc.close();
    }
}