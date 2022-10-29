package boj;
import java.io.*;

public class BOJ3417 { // Vigenère Cipher Encryption

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            char[] arr = br.readLine().toCharArray(); //  the encryption key

            if (arr[0] == '0') {
                break;
            }

            char[] arr2 = br.readLine().toCharArray(); // the plaintext

            for (int i = 0; i < arr2.length; i++) {
                char ch = (char) ((arr[i % arr.length] - 'A' + 1) + arr2[i]);

                if (ch > 'Z') {
                    ch -= 26;
                }

                bw.write(String.valueOf(ch));
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}