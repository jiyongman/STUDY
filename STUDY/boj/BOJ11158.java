package boj;
import java.util.*;

public class BOJ11158 { // Angry Grammar Nazi

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // the number of test cases

        for (int i = 0; i < T; i++) {
            String[] arr = sc.nextLine().split(" ");
            int cnt = 0;

            if (arr[0].equals("u") || arr[0].equals("ur") || arr[0].contains("lol")) {
                cnt += 10;
            }

            for (int j = 1; j < arr.length; j++) {
                if (arr[j].equals("u") || arr[j].equals("ur") || arr[j].contains("lol")) {
                    cnt += 10;
                } else if ((arr[j - 1].equals("would") || arr[j - 1].equals("should")) && arr[j].equals("of")) {
                    cnt += 10;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}