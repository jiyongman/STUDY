package boj;
import java.util.*;

public class BOJ6830 { // It’s Cold Here!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = 201;
        String str = "";

        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(" ");

            if (min > Integer.parseInt(arr[1])) {
                min = Integer.parseInt(arr[1]);
                str = arr[0];
            }
        }

        System.out.println(str);
        sc.close();
    }
}