package Math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Breakeven_1712 {

    public static void main(String[] args) throws IOException {

        // 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 고정비용 A, 가변비용 B, 판매가격 C 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 손익분기점 개념 활용
        int BE = (C - B) <= 0 ? -1 : A / (C - B) + 1;

        // 결과 출력
        bw.write(String.valueOf(BE));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
