package boj;
import java.util.*;

public class BOJ14530 { // The Lost Cow

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int farmer = x;
        int location = 0;
        int left = 0;
        int right = 0;
        int index = 1;
        int distance = 0;

        while (true) {
            location = x + index;
            left = Math.min(farmer, location);
            right = Math.max(farmer, location);

            if (y >= left && y <= right) {
                distance += Math.abs(y - farmer);
                break;
            }

            farmer = location;
            index *= -2;
            distance += right - left;
        }

        System.out.println(distance);
        sc.close();
    }
}