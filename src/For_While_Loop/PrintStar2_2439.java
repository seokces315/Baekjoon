package For_While_Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar2_2439 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 몇 개의 줄을 출력할 것인지 N값 입력받기
        int N = Integer.parseInt(br.readLine());

        // for-loop문 작성
        for(int i=0 ; i<N ; i++) {
            // Java는 문자열 곱셈이 불가능하므로
            // 2중 for-loop문 작성
            for(int j=0 ; j<N ; j++) {
                if(j<(N-i-1)) {
                    sb.append(" ");
                }
                else {
                    sb.append("*");
                }
            }

            // 마지막 문장 제외 개행처리
            if(i!=N-1) {
                sb.append("\n");
            }
        }

        // 원하는 결과 출력
        System.out.println(sb);

    }

}
