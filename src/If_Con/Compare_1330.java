package If_Con;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Compare_1330 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String result;
        
        // 두 정수를 입력받기
        // -10,000 <= A, B <= 10,000
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        // 조건에 따른 분기
        if(A < B) {
            result = "<";
        }
        else if(A > B) {
            result = ">";
        }
        else {
            result = "==";
        }

        // 원하는 결과 출력
        bw.write(result);
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
