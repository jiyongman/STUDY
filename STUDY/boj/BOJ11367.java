package boj;
import java.util.*;

public class BOJ11367 { // Report Card Time

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of hobbits in the class

        for (int i = 0; i < n; i++) {
            String a = sc.next(); // the hobbit’s name
            int b = sc.nextInt(); // the hobbit’s grade
            String str = "";

            if (b >= 97) {
                str = "A+";
            } else if (b >= 90) {
                str = "A";
            } else if (b >= 87) {
                str = "B+";
            } else if (b >= 80) {
                str = "B";
            } else if (b >= 77) {
                str = "C+";
            } else if (b >= 70) {
                str = "C";
            } else if (b >= 67) {
                str = "D+";
            } else if (b >= 60) {
                str = "D";
            } else {
                str = "F";
            }

            System.out.println(a + " " + str);
        }

        sc.close();
    }
}