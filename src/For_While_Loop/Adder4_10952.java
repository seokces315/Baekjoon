package For_While_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Adder4_10952 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // while-loop문 작성
        while(true) {
            // 두 정수 A, B 입력받기
            // 0 < A, B < 10
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // while-loop를 탈출할 조건
            if((A==0) && (B==0)) {
                break;
            }
            
            // 원하는 결과 출력
            bw.write(Integer.toString(A+B));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

}
