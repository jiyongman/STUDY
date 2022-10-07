package boj;
import java.util.*;

public class BOJ2998 { // 8진수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "";

        while ((str.length() + str2.length()) % 3 > 0) {
            str2 += "0";
        }

        str2 += str;
        String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};

        for (int i = 0; i < str2.length(); i += 3) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(str2.substring(i, i + 3))) {
                    System.out.print(j);
                }
            }
        }

        sc.close();
    }
}