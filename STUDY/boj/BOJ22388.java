package boj;
import java.util.*;

public class BOJ22388 { // 改元

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String g = sc.next(); // the era

            if (g.equals("#")) {
                break;
            }
            
            int y = sc.nextInt(); // year
            int m = sc.nextInt(); // month
            int d = sc.nextInt(); // day

            if ((y >= 31 && m >= 5) || y >= 32) {
                if (g.equals("Heisei")) {
                    g = g.replace("Heisei", "HEISEI");
                } else { 
                    g = g.replace("HEISEI", "?");
                }
                y -= 30;
            }

            System.out.println(g + " " + y + " " + m + " " + d);
        }

        sc.close();
    }   
}