package boj;
import java.util.*;

public class BOJ4471 { // The Navi-Computer is Down!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // the number of entries to process

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] arr = sc.nextLine().split(" ");
            double x1 = Double.parseDouble(arr[0]);
            double y1 = Double.parseDouble(arr[1]);
            double z1 = Double.parseDouble(arr[2]);
            String str2 = sc.nextLine();
            String[] arr2 = sc.nextLine().split(" ");
            double x2 = Double.parseDouble(arr2[0]);
            double y2 = Double.parseDouble(arr2[1]);
            double z2 = Double.parseDouble(arr2[2]);
            double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));

            System.out.printf("%s to %s: %.2f\n", str, str2, d);
        }

        sc.close();
    }
}