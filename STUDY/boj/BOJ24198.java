package boj;
import java.util.*;

public class BOJ24198 { // Muffinspelet

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Alf = 0;
        int Beata = 0;
        int muffins = 0;

        while (N > 0) {
            if (N % 2 > 0) {
                muffins = N / 2 + 1;
            } else {
                muffins = N / 2;
            }

            Beata += muffins;
            N -= muffins;

            if (N % 2 > 0) {
                muffins = N / 2 + 1;
            } else {
                muffins = N / 2;
            }

            Alf += muffins;
            N -= muffins;
        }

        System.out.printf("%d %d", Alf, Beata);
        sc.close();
    }
}