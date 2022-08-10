package For_While_Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication_2739 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 출력하고자하는 단의 N값을 입력받기
        // 1 <= N <= 9
        int N = Integer.parseInt(br.readLine());

        // for-loop문 작성
        for(int i=1 ; i<=9 ; i++) {
            // StringBuilder에 구구단 연산 append
            sb.append(N).append(" * ").append(i);
            sb.append(" = ");
            sb.append(N*i);
            // 마지막 문장 제외 개행처리
            if(i!=9) {
                sb.append("\n");
            }
        }

        // 원하는 결과 출력
        System.out.println(sb);
        
    }

}
