package Math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Honeycomb_2292 {

    public static void main(String[] args) throws IOException {

        // 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 방 번호 N(1 ~ 1,000,000,000) 입력받기
        int N = Integer.parseInt(br.readLine());

        // 반복문을 통해 방의 구조 파악
        // N보다 방의 번호가 커지는 반복 포인트
        int start = 1;
        int loop = 0;
        while(start < N) {
            start += ++loop * 6; // 벌집 구조 = 육각형
        }

        // 결과 출력
        bw.write(String.valueOf(loop + 1));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
