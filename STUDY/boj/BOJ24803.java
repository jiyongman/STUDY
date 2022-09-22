package boj;
import java.util.*;

public class BOJ24803 { // Provinces and Gold

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int G = sc.nextInt(); // the number of Golds Jake draws in his hand
        int S = sc.nextInt(); // the number of Silvers Jake draws in his hand
        int C = sc.nextInt(); // the number of Coppers Jake draws in his hand
        int bp = 3 * G + 2 * S + C;

        if (bp >= 8) {
            System.out.print("Province or ");
        } else if (bp >= 5) {
            System.out.print("Duchy or ");
        } else if (bp >= 2) {
            System.out.print("Estate or ");
        }

        if (bp >= 6) {
            System.out.println("Gold");
        } else if (bp >= 3) {
            System.out.println("Silver");
        } else {
            System.out.println("Copper");
        }

        sc.close();
    }   
}