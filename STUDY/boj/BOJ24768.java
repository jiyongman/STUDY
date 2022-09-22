package boj;
import java.util.*;

public class BOJ24768 { // Left Beehind

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt(); // the number of sweet jars Bill has
            int y = sc.nextInt(); // the number of sour jars Bill has

            if (x == 0 && y == 0) {
                break;
            }

            if (x + y == 13) {
                System.out.println("Never speak again.");
            } else if (x > y) {
                System.out.println("To the convention.");
            } else if (x < y) {
                System.out.println("Left beehind.");
            } else {
                System.out.println("Undecided.");
            }
        }
        
        sc.close();
    }   
}