package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Const_2908 {

    public static void main(String[] args) throws IOException {

        // 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int flag = 0;
        char[] res;

        // 두 수 A, B 입력받기
        // A != B, 0을 포함하지 않는 수
        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();

        // for문
        // 상수의 수체계로 조건 분기
        for(int i=1 ; i<=A.length ; i++) {
            if(A[A.length - i] < B[B.length - i]) flag = 1;
            else if(A[A.length - i] > B[B.length - i]) flag = -1;

            // flag가 변하면 break
            if(flag != 0) break;
        }

        // 결과 출력
        res = flag == -1 ? A : B;
        for(int i=1 ; i<=res.length ; i++) {
            sb.append(res[res.length - i]);
        }

        System.out.println(sb);

    }

}
