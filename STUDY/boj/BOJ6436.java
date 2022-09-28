package boj;
import java.util.*;

public class BOJ6436 { // Floppies

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int f = 1860000;

        while (true) {
            int s = sc.nextInt(); // the size of the SHAR file in bytes

            if (s == 0) {
                break;
            }
            s /= 2;
            s += s / 2;

            System.out.println("File #" + i);
            System.out.println("John needs " + ((s + f) / f) + " floppies.");
            System.out.println();
            i++;
        }

        sc.close();
    }
}