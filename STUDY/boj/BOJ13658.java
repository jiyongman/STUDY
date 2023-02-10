package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ13658 { // Revisão de Contrato

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String D = sc.next();
            String N = sc.next();

            if (D.equals("0") && N.equals("0")) {
                break;
            }

            N = N.replaceAll(D, "");

            if (N.equals("")) {
                N = "0";
            }

            BigInteger result = new BigInteger(N);

            System.out.println(result);
        }

        sc.close();
    }
}