package boj;
import java.util.*;

public class BOJ15612 { // Cube Bits

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the size of the data stream

        for (int i = 0; i < n; i++) {
            long v = sc.nextLong();
            String str = Long.toString(v, 3);

            System.out.println(str);
        }

        sc.close();
    }
}