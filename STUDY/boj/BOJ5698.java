package boj;
import java.util.*;

public class BOJ5698 { // Tautogram

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine().toLowerCase(); // 선영이 편지의 한 문장

            if (str.equals("*")) {
                break;
            }

            String[] arr = str.split(" ");
            char ch = arr[0].charAt(0);
            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {
                if (ch != arr[i].charAt(0)) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }

        sc.close();
    }
}