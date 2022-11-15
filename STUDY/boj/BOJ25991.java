package boj;
import java.io.*;
import java.util.*;

public class BOJ25991 { // Lots of Liquid

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // the number of cube-shaped containers that you have in store
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double c = Double.parseDouble(st.nextToken()); // the length of one of the sides for each of these containers
            sum += c * c * c;
        }

        double result = Math.pow(sum, 1.0 / 3.0);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}