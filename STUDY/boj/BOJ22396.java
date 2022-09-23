package boj;
import java.util.*;

public class BOJ22396 { // カレー作り

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int R0 = sc.nextInt(); // the mass of the roux already dissolved in the half-cooked curry [g]
            int W0 = sc.nextInt(); // the volume of water contained in the curry [L]
            int C = sc.nextInt(); // the concentration of the curry you want to make [g / L]
            int R = sc.nextInt(); // the mass [g] of one roux
            int result = 0;

            if (R0 == 0 && W0 == 0 && C == 0 && R == 0) {
                break;
            }
            
            while (true) {
                if ((R0 + result * R) / W0 >= C) {
                    System.out.println(result);
                    break;
                }
                result++;
            }
        }

        sc.close();
    }
}