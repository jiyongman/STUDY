package boj;
import java.util.*;

public class BOJ11258 { // Thai Lottery Checking
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 6;
        int m = 2;
        String[][] arr = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next();
            }
        }
        
        while (true) {
            String str = sc.next();

            if (str.equals("-1")) {
                break;
            }

            int prize = 0;

            if (str.equals(arr[0][0])) {
                prize += Integer.parseInt(arr[0][1]);
            }
            if (str.substring(0, 3).equals(arr[1][0])) {
                prize += Integer.parseInt((arr[1][1]));
            }
            if (str.substring(0, 3).equals(arr[2][0])) {
                prize += Integer.parseInt((arr[2][1]));
            }
            if (str.substring(3).equals(arr[3][0])) {
                prize += Integer.parseInt((arr[3][1]));
            }
            if (str.substring(3).equals(arr[4][0])) {
                prize += Integer.parseInt((arr[4][1]));
            }
            if (str.substring(4).equals(arr[5][0])) {
                prize += Integer.parseInt((arr[5][1]));
            }
            
            if (prize > 0) {
                System.out.println(prize);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}