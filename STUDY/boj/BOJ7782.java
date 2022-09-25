package boj;
import java.util.*;

public class BOJ7782 { // Alien

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of alien’s ships
        int b1 = sc.nextInt(); // Bakhytzhan’s coordinates
        int b2 = sc.nextInt(); // Bakhytzhan’s coordinates
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int lx = sc.nextInt(); // bottom left corner of the ship
            int ly = sc.nextInt(); // bottom left corner of the ship
            int hx = sc.nextInt(); // top right corner of the ship
            int hy = sc.nextInt(); // top right corner of the ship

            if ((lx <= b1 && hx >= b1) && (ly <= b2 && hy >= b2)) {
                cnt++;
            }
        }

        if (cnt > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}