package boj;
import java.util.*;

public class BOJ25278 { // Terraforming

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of environmental changes on Mars
        int tem = -30;
        int oce = 0;
        int oxy = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int m = sc.nextInt();

            if (str.equals("temperature")) {
                tem += m;
            } else if (str.equals("ocean")) {
                oce += m;
            } else {
                oxy += m;
            }
        }

        if (tem >= 8 && oce >= 9 && oxy >= 14) {
            System.out.println("liveable");
        } else {
            System.out.println("not liveable");
        }
        
        sc.close();
    }   
}