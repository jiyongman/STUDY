package boj;
import java.io.*;

public class BOJ26772 { // Poziome serca

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] arr = {" @@@   @@@ ", "@   @ @   @", "@    @    @", "@         @", " @       @ ", "  @     @  ", "   @   @   ", "    @ @    ", "     @     "};

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < N; j++) {
                bw.write(String.format("%s ", arr[i]));
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}