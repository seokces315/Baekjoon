package For_While_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sum_8393 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        // 마지막으로 더할 수인 n 입력받기
        // 1 <= n <= 10000
        int n = Integer.parseInt(br.readLine());

        // for-loop문 작성
        for(int i=1 ; i<=n ; i++) {
            // 1부터 n까지 더하는 명령
            sum += i;
        }

        // 원하는 결과 출력
        bw.write(String.valueOf(sum));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
