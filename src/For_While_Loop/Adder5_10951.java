package For_While_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Adder5_10951 {

    public static void main(String[] args) throws IOException {
        
        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // while-loop문 작성
        // 입력이 존재하는데 break 분기가 없는 특수한 상황
        // 입력의 끝이 존재(NullPointerException)한다고 가정해서 예외처리 필요
        while(true) {
            // 두 정수 A, B 입력받기
            // 0 < A, B < 10
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch(NullPointerException e) {
                break; // 예외상황 -> while-loop 벗어나기
            }
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            // 원하는 결과 출력
            bw.write(String.valueOf(A+B));
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }

}
