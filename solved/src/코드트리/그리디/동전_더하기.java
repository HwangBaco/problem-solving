package 코드트리.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전_더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int ans = 0;
        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            cnt = k / arr[i];
            ans += cnt;
            k -= arr[i] * cnt;
        }
        System.out.println(ans);
    }
}
