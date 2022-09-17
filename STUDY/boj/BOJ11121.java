package boj;
import java.util.*;

public class BOJ11121 { // Communication Channels

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of transmissions
        String[][] arr = new String[T][2];

        for (int i = 0; i < T; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }

        for (int i = 0; i < T; i++) {
            if (arr[i][0].equals(arr[i][1])) {
                System.out.println("OK");
            } else {
                System.out.println("ERROR");
            }
        }

        sc.close();
    }
}