package boj;
import java.util.*;

public class BOJ27481 { // Hotelier

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of events in Amugae’s memory
        String str = sc.next();
        int[] rooms = new int[10];

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'L') {
                int j = 0;

                while (true) {
                    if (rooms[j] == 0) {
                        rooms[j] = 1;
                        break;
                    } else {
                        j++;
                    }
                }
            } else if (str.charAt(i) == 'R') {
                int j = 9;

                while (true) {
                    if (rooms[j] == 0) {
                        rooms[j] = 1;
                        break;
                    } else {
                        j--;
                    }
                }
            } else {
                rooms[str.charAt(i) - '0'] = 0;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(rooms[i]);
        }

        sc.close();
    }
}