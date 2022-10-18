package boj;
import java.util.*;

public class BOJ18245 { // 이상한 나라의 암호

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 2;

        while (true) {
            String str = sc.nextLine(); // 해석해야 할 문장

            if (str.equals("Was it a cat I saw?")) {
                break;
            }

            for (int j = 0; j * i < str.length(); j++) {
                System.out.print(str.charAt(j * i));
            }

            System.out.println();
            i++;
        }

        sc.close();
    }
}