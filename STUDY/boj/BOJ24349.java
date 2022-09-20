package boj;
import java.util.*;

public class BOJ24349 { // МЕД

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of times that Winnie the Pooh needs to eat honey a day
        int a = sc.nextInt(); // the length of path between the houses of the Rabbit and the Owl
        int b = sc.nextInt(); // the length of path between the houses of the Rabbit and the Yori
        int c = sc.nextInt(); // the length of path between the houses of the Owl and the Yori
        int d = 0; // the minimum distance that Winnie the Pooh must travel in centimeters

        if (n == 1) {
            d = 0;
        } else if (a <= b && a <= c) {
            d = (n - 1) * a;
        } else if (b <= a && b <= c) {
            d = (n - 1) * b;
        } else {
            if (a <= b) {
                d = a + (n - 2) * c;
            } else {
                d = b + (n - 2) * c;
            }
        }

        System.out.println(d / 100 + " " + d % 100);
        sc.close();
    }   
}