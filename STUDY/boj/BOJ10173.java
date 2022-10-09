package boj;
import java.util.*;

public class BOJ10173 { // 니모를 찾아서

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("EOI")) {
                break;
            }

            if (str.toUpperCase().contains("NEMO")) {
                System.out.println("Found");
            } else {
                System.out.println("Missing");
            }
        }

        sc.close();
    }
}