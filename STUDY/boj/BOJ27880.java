package boj;
import java.util.*;

public class BOJ27880 { // Gahui and Soongsil University station

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int escalator = 0;
        int stair = 0;

        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(" ");

            if (arr[0].equals("Es")) {
                escalator += 21 * Integer.parseInt(arr[1]);
            } else {
                stair += 17 * Integer.parseInt(arr[1]);
            }
        }

        System.out.println(escalator + stair);
        sc.close();
    }
}