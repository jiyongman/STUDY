package boj;
import java.util.*;

public class BOJ6778 { // Which Alien?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // the number of antenna seen on the alien
        int b = sc.nextInt(); // the number of eyes seen on the alien

        if (a >= 3 && b <= 4) {
            System.out.println("TroyMartian");
        }
        if (a <= 6 && b >= 2) {
            System.out.println("VladSaturnian");
        }
        if (a <= 2 && b <= 3) {
            System.out.println("GraemeMercurian");
        }

        sc.close();
    }
}