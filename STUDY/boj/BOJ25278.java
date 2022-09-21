package boj;
import java.util.*;

public class BOJ25278 { // Terraforming

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of environmental changes on Mars
        int temperature = -30;
        int ocean = 0;
        int oxygen = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int m = sc.nextInt();

            if (str.equals("temperature")) {
                temperature += m;
            } else if (str.equals("ocean")) {
                ocean += m;
            } else {
                oxygen += m;
            }
        }

        if (temperature >= 8 && ocean >= 9 && oxygen >= 14) {
            System.out.println("liveable");
        } else {
            System.out.println("not liveable");
        }

        sc.close();
    }   
}