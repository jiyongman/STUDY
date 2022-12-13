package boj;
import java.util.*;

public class BOJ17897 { // Pea Soup and Pancakes

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // the number of restaurants

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(sc.nextLine()); // the number of menu items for the day
            String str = sc.nextLine(); // the restaurant name
            boolean soup = false;
            boolean cake = false;

            for (int j = 0; j < k; j++) {
                String str2 = sc.nextLine(); // the menu items

                if (str2.equals("pea soup")) {
                    soup = true;
                } else if (str2.equals("pancakes")) {
                    cake = true;
                }
            }

            if (soup && cake) {
                System.out.println(str);
                return;
            }
        }

        System.out.println("Anywhere is fine I guess");
        sc.close();
    }
}