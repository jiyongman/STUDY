package boj;
import java.util.*;

public class BOJ25084 { // Infinity Area

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int R = sc.nextInt(); // the radius of the first circle
            int A = sc.nextInt(); // the parameters used to calculate the radii of the subsequent circles
            int B = sc.nextInt(); // the parameters used to calculate the radii of the subsequent circles
            double y = 0; // the sum of areas of all the circles drawn until radius of the circle to be drawn becomes zero

            while (R > 0) {
                y += Math.PI * R * R;
                R *= A;
                y += Math.PI * R * R;
                R /= B;
            }

            System.out.println("Case #" + x + ": " + y);
        }

        sc.close();
    }   
}