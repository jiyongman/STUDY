package boj;
import java.util.*;

public class BOJ21300 { // Bottle Return

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 6; i++) { // the number of empty containers of beer, malt, wine products, carbonated soft drinks, seltzer and water
            int n = sc.nextInt();
            sum += n;
        }

        System.out.println(sum * 5);
        sc.close();
    }
}