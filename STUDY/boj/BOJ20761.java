package boj;
import java.util.*;

public class BOJ20761 { // Alloys

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); // the amount of money in SEK
        c = Math.min(c, 1.0);
        double h = (c / 2) * (c / 2); // the maximum hardness of Pelle's alloy

        System.out.println(h);
        sc.close();
    }
}