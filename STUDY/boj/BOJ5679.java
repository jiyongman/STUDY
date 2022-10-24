package boj;
import java.util.*;

public class BOJ5679 { // Hailstone Sequences

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int H = sc.nextInt(); // the starting value to build the sequence

            if (H == 0) {
                break;
            }

            int max = H;

            while (H > 1) {
                if (H % 2 == 0) {
                    H /= 2;
                } else {
                    H = 3 * H + 1;
                }

                if (max < H) {
                    max = H;
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}