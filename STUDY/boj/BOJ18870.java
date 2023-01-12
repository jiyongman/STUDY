package boj;
import java.io.*;
import java.util.*;

public class BOJ18870 { // 좌표 압축

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] coordinate = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            coordinate[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = coordinate.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;

        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, i);
                i++;
            }
        }

        for (int num : coordinate) {
            bw.write(String.format("%d ", map.get(num)));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}