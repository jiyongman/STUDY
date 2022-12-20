package boj;
import java.util.*;

public class BOJ26495 { // Big Number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[][] arr = {
                {"0000", "   1", "2222", "3333", "4  4", "5555", "6666", "7777", "8888", "9999"},
                {"0  0", "   1", "   2", "   3", "4  4", "5",    "6",    "   7", "8  8", "9  9"},
                {"0  0", "   1", "2222", "3333", "4444", "5555", "6666", "   7", "8888", "9999"},
                {"0  0", "   1", "2",    "   3", "   4", "   5", "6  6", "   7", "8  8", "   9"},
                {"0000", "   1", "2222", "3333", "   4", "5555", "6666", "   7", "8888", "   9"}
        };

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(arr[j][str.charAt(i) - '0']);
            }

            System.out.println();
        }

        sc.close();
    }
}