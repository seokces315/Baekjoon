package For_While_Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LessthanX_10871 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N과 X를 입력받기
        // 1 <= N, X <= 10,000
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        // N개의 정수로 이루어진 수열을 정수 X와 비교하는 연산
        // X보다 작은 수를 모두 출력
        // for-loop문 작성
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            // 대조군 선언
            int con = Integer.parseInt(st.nextToken());
            
            // 대조군과 X를 비교해서 작으면 StringBuilder에 append
            if(con < X) {
                sb.append(con).append(" ");
            }
        }

        // 원하는 결과 출력
        // 공백 제거 방법
        // 1. replaceAll(정규식, 대체식), 2. trim(), 3. strip() 관련 메서드
        System.out.println(sb.toString().stripTrailing());

    }

}
