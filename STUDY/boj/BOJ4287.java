package boj;
import java.util.*;

public class BOJ4287 { // Word Ratios

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] arr = sc.nextLine().split(" ");

            if (arr[0].equals("#")) {
                break;
            }

            String str = "";

            for (int i = 0; i < arr[0].length(); i++) {
                int tmp = arr[2].charAt(i) + (arr[1].charAt(i) - arr[0].charAt(i));

                if (tmp < 'a') {
                    str += (char) (tmp + 26);
                } else if (tmp > 'z') {
                    str += (char) (tmp - 26);
                } else {
                    str += (char) tmp;
                }
            }

            System.out.printf("%s %s %s %s\n", arr[0], arr[1], arr[2], str);
        }

        sc.close();
    }
}