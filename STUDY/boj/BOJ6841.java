package boj;
import java.util.*;

public class BOJ6841 { // I Speak TXTMSG

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = {"CU", ":-)", ":-(", ";-)", ":-P", "(~.~)", "TA", "CCC", "CUZ", "TY", "YW", "TTYL"};
        String[] arr2 = {"see you", "I’m happy", "I’m unhappy", "wink", "stick out my tongue", "sleepy", "totally awesome", "Canadian Computing Competition", "because", "thank-you", "you’re welcome", "talk to you later"};

        while (true) {
            String str = sc.nextLine();

            if (str.equals("TTYL")) {
                System.out.println("talk to you later");
                break;
            }

            boolean bl = false;

            for (int i = 0; i < arr.length; i++) {
                if (str.equals(arr[i])) {
                    System.out.println(arr2[i]);
                    bl = true;
                    break;
                }
            }

            if (!bl) {
                System.out.println(str);
            }
        }

        sc.close();
    }
}