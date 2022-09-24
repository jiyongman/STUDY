package boj;
import java.util.*;

public class BOJ21983 { // Basalt Breakdown

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(); // the area of the hexagonal rock face in square centimetres
        double l = Math.sqrt(2 * a * Math.sqrt(3) / 9) * 6; // the perimeter of the rock face in centimetres

        System.out.println(l);
        sc.close();
    }
}