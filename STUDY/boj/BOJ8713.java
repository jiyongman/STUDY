package boj;
import java.util.*;

public class BOJ8713 { // Znak działania

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[3];
        arr[0] = a + b;
        arr[1] = a - b;
        arr[2] = a * b;

        Arrays.sort(arr);
        char ch = 0;

        if (arr[2] == a + b) {
            ch = '+';
        } else if (arr[2] == a - b) {
            ch = '-';
        } else {
            ch = '*';
        }

        if (arr[1] == arr[2]) {
            System.out.print("NIE");
        } else {
            if (a < 0) {
                System.out.printf("(%d)", a);
            } else {
                System.out.print(a);
            }

            System.out.print(ch);

            if (b < 0) {
                System.out.printf("(%d)", b);
            } else {
                System.out.print(b);
            }

            System.out.print("=");

            if (arr[2] < 0) {
                System.out.printf("(%d)", arr[2]);
            } else {
                System.out.print(arr[2]);
            }
        }

        sc.close();
    }
}