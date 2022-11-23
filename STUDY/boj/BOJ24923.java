package boj;
import java.util.*;

public class BOJ24923 { // Canadians, eh?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "";
        str2 = str.substring(str.length() - 3);

        if (str2.equals("eh?")) {
            System.out.println("Canadian!");
        } else {
            System.out.println("Imposter!");
        }

        sc.close();
    }
}