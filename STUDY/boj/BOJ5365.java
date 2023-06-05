package boj;
import java.util.*;

public class BOJ5365 { // Decoder

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");

        System.out.print(arr[0].charAt(0));

        for (int i = 1; i < n; i++) {
            if (arr[i - 1].length() > arr[i].length()) {
                System.out.print(" ");
            } else {
                System.out.print(arr[i].charAt(arr[i - 1].length() - 1));
            }
        }

        sc.close();
    }
}