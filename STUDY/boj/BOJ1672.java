package boj;
import java.io.*;

public class BOJ1672 { // DNA 해독

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        char[][] arr2 = new char[26][26];
        arr2[0][0] = arr2[0][2] = arr2[2][0] = arr2[6][19] = arr2[19][6] = 'A';
        arr2[0][19] = arr2[2][19] = arr2[6][6] = arr2[19][0] = arr2[19][2] = 'G';
        arr2[0][6] = arr2[2][2] = arr2[6][0] = 'C';
        arr2[2][6] = arr2[6][2] = arr2[19][19] = 'T';

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i - 1] = arr2[arr[i - 1] - 'A'][arr[i] - 'A'];
        }

        bw.write(String.valueOf(arr[0]));
        bw.flush();
        bw.close();
        br.close();
    }
}