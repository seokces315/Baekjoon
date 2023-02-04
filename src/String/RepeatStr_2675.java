package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatStr_2675 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int R;
        String S;

        // 테스트 케이스의 개수 T(1 ~ 1000) 입력받기
        int T = Integer.parseInt(br.readLine());

        // for-loop문 작성
        for(int i=0 ; i<T ; i++) {
            // 케이스 입력받기
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken()); // 반복 횟수
            S = st.nextToken();                    // 문자열

            // 이중 반복문을 활용해서 문자 반복
            for(int j=0 ; j<S.length() ; j++) {
                for(int k=0 ; k<R ; k++) {
                    sb.append(S.charAt(j));
                }
            }
            
            sb.append("\n"); // 줄바꿈
        }

        // 결과 출력
        System.out.print(sb);

    }

}
