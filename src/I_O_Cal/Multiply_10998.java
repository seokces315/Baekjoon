package I_O_Cal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Multiply_10998 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 버퍼의 한 줄을 분리
        String result;

        // 입력 -> 0 < A, B < 10
        // 공백을 기준으로 분리해 각각 정수형으로 저장
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        // 정수형 데이터를 곱함
        result = String.valueOf(first * second); // 결과를 write하기 위해 형변환(String)

        // 원하는 결과 출력
        bw.write(result);
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
