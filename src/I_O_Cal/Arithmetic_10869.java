package I_O_Cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Arithmetic_10869 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 입력 -> 1 <= A, B <= 10000
        // 공백을 기준으로 분리해 각각 정수형으로 저장
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        
        // 원하는 결과 출력
        sb.append(first + second).append("\n");
        sb.append(first - second).append("\n");
        sb.append(first * second).append("\n");
        sb.append(first / second).append("\n");
        sb.append(first % second);

        System.out.println(sb);

    }

}
