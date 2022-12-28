package boj;
import java.util.*;

public class BOJ26906 { // Vikingahackare

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[][] arr = new String[T][2];

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.next();
            }
        }

        String str = sc.next();

        for (int i = 0; i < str.length(); i += arr[0][1].length()) {
            boolean bl = false;

            for (int j = 0; j < T; j++) {
                if (arr[j][1].equals(str.substring(i, i + arr[j][1].length()))) {
                    System.out.print(arr[j][0]);
                    bl = true;
                    break;
                }
            }

            if (!bl) {
                System.out.print("?");
            }
        }

        sc.close();
    }
}
