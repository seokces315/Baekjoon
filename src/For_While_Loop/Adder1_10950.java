package For_While_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Adder1_10950 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 테스트 케이스의 개수, T를 입력받기
        int T = Integer.parseInt(br.readLine());
        
        // for-loop문 작성
        for(int i=0 ; i<T ; i++) {
            // 두 정수 A, B 입력받기
            // 0 < A, B < 10
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // 입력받은 값들을 더해서 출력
            bw.write(String.valueOf(A+B));
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }

}
