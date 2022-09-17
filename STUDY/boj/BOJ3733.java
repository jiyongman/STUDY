package boj;
import java.util.*;

public class BOJ3733 { // Shares

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) { // End Of File 처리
            int N = sc.nextInt();
            int S = sc.nextInt();

            System.out.println(S / (N + 1));
        }

        sc.close();
    }
}