package boj;
import java.util.*;

public class BOJ15079 { // Arggggggh!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of instructions
        double x = sc.nextDouble(); // the starting point
        double y = sc.nextDouble(); // the starting point

        for (int i = 0; i < n - 1; i++) {
            String dir = sc.next(); // the direction
            double d = sc.nextDouble(); // the distance to walk

            if (dir.equals("N")) {
                y += d;
            } else if (dir.equals("NE")) {
                x += d / Math.sqrt(2);
                y += d / Math.sqrt(2);
            } else if (dir.equals("E")) {
                x += d;
            } else if (dir.equals("SE")) {
                x += d / Math.sqrt(2);
                y -= d / Math.sqrt(2);
            } else if (dir.equals("S")) {
                y -= d;
            } else if (dir.equals("SW")) {
                x -= d / Math.sqrt(2);
                y -= d / Math.sqrt(2);
            } else if (dir.equals("W")) {
                x -= d;
            } else {
                x -= d / Math.sqrt(2);
                y += d / Math.sqrt(2);
            }
        }

        System.out.println(x + " " + y);
        sc.close();
    }
}