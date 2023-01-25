package I_O_Cal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Divide_1008 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 버퍼의 한 줄을 분리
        String result;

        // 입력 -> 0 < A, B < 10
        // 공백을 기준으로 분리해 각각 실수형으로 저장
        double first = Double.parseDouble(st.nextToken());
        double second = Double.parseDouble(st.nextToken());
        // 실수형 데이터를 나눔
        result = Double.toString(first / second); // 결과를 write하기 위해 형변환(String)

        // 원하는 결과 출력
        bw.write(result);
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
