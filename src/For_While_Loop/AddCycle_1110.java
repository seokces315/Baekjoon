package For_While_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 보강코딩  
// N의 크기가 10과 비교하는 조건분기가 필요없음
// N이 10보다 클때의 조건분기가 모두 포괄함
public class AddCycle_1110 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;

        // 정수 N 입력받기
        // 0 <= N <= 99
        int originN = Integer.parseInt(br.readLine());
        int N = originN;
        
        // do-while-loop 작성
        do {
            // N이 10보다 작을때의 조건분기
            if(N < 10) {
                N = N * 11;
            }
            // N이 10보다 클때의 조건분기
            else {
                N = (N%10)*10 + ((N/10)+(N%10))%10;
            }
            // loop의 명령
            count++;
        } while(N != originN);

        // 원하는 결과 출력
        bw.write(String.valueOf(count));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
