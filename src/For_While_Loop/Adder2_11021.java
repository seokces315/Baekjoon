package For_While_Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Adder2_11021 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 테스트케이스의 개수, T 입력받기
        int T = Integer.parseInt(br.readLine());

        // for-loop문 작성
        for(int i=0 ; i<T ; i++) {
            // 두 정수 A, B 입력받기
            // 0 < A, B < 10
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // StringBuilder에 덧셈 연산 append
            sb.append("Case #").append(i+1);
            sb.append(": ");
            sb.append(A+B);
            // 마지막 문장 제외 개행처리
            if(i != T-1) {
                sb.append("\n");
            }
        }

        // 원하는 결과 출력
        System.out.println(sb);

    }

}
