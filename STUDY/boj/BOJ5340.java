package boj;
import java.util.*;

public class BOJ5340 { // Secret Location

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] x = new int[7];

        for (int i = 1; i <= 6; i++) {
            String str = sc.nextLine();

            if (str.charAt(str.length() - 1) == ' ') {
                x[i] = str.length() - 1;
            } else {
                x[i] = str.length();
            }
        }

        System.out.printf("Latitude %d:%d:%d\nLongitude %d:%d:%d", x[1], x[2], x[3], x[4], x[5], x[6]);
        sc.close();
    }
}