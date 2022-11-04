package boj;
import java.io.*;

public class BOJ19813 { // Dates

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.contains(".")) {
                String[] arr = str.split("\\.");
                bw.write(String.format("%02d.%02d.%04d ", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
                bw.write(String.format("%02d/%02d/%04d\n", Integer.parseInt(arr[1]), Integer.parseInt(arr[0]), Integer.parseInt(arr[2])));
            } else {
                String[] arr = str.split("/");
                bw.write(String.format("%02d.%02d.%04d ", Integer.parseInt(arr[1]), Integer.parseInt(arr[0]), Integer.parseInt(arr[2])));
                bw.write(String.format("%02d/%02d/%04d\n", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}