package boj;
import java.util.*;

public class BOJ24638 { // Anno Domini 2022

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] before = sc.nextLine().split(" ");
        String[] after = sc.nextLine().split(" ");
        String str = "";
        String str2 = "";
        int num = 0;
        int num2 = 0;

        if (before[0].equals("BC") || before[0].equals("AD")) {
            str = before[0];
            num = Integer.parseInt(before[1]);
        } else {
            str = before[1];
            num = Integer.parseInt(before[0]);
        }

        if (after[0].equals("BC") || after[0].equals("AD")) {
            str2 = after[0];
            num2 = Integer.parseInt(after[1]);
        } else {
            str2 = after[1];
            num2 = Integer.parseInt(after[0]);
        }

        int year = 0;

        if (str.equals(str2)) {
            year = Math.abs(num - num2);
        } else {
            year = num + num2 - 1;
        }

        System.out.println(year);
        sc.close();
    }
}