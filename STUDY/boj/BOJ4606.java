package boj;
import java.util.*;

public class BOJ4606 { // The Seven Percent Solution

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("#")) {
                break;
            }

            str = str.replaceAll("%", "%25");
            str = str.replaceAll(" ", "%20");
            str = str.replaceAll("!", "%21");
            str = str.replaceAll("\\$", "%24");
            str = str.replaceAll("\\(", "%28");
            str = str.replaceAll("\\)", "%29");
            str = str.replaceAll("\\*", "%2a");

            System.out.println(str);

        }

        sc.close();
    }
}