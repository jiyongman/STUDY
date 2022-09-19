package boj;
import java.util.*;

public class BOJ11434 { // Ampelmännchen

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        for (int x = 1; x <= K; x++) {
            int n = sc.nextInt(); // the number of contentious items
            int W = sc.nextInt(); // the number of people living in the West
            int E = sc.nextInt(); // the number of people living in the East
            int max = 0;
            int result = 0;

            for (int y = 0; y < n; y++) {
                int WW = sc.nextInt(); // how much the West likes its own version
                int WE = sc.nextInt(); // how much the West likes the East's version
                int EW = sc.nextInt(); // how much the East likes the West's version
                int EE = sc.nextInt(); // how much the East likes its own version

                max = Math.max(W * WW + E * EW , W * WE + E * EE);
                result += max;
            }

            System.out.println("Data Set " + x + ":");
            System.out.println(result);
            System.out.println();
        }

        sc.close();
    }
}