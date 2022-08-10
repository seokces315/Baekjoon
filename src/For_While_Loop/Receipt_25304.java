package For_While_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Receipt_25304 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int totalPrice = 0;

        // 영수증에 적힌 총 금액 X 입력받기
        // 1 <= X <= 1,000,000,000
        int X = Integer.parseInt(br.readLine());

        // for-loop문 작성
        int N = Integer.parseInt(br.readLine());
        for(int i=0 ; i<N ; i++) {
            // 물건의 가격 및 개수 입력받기
            st = new StringTokenizer(br.readLine());
            // 가격: 1 <= a <= 1,000,000
            // 개수: 1 <= b <= 10
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 입력받은 데이터를 바탕으로 금액 연산
            totalPrice += a * b;
        }

        // 영수증에 적힌 금액과 비교해서
        // 원하는 결과 출력
        if(X == totalPrice) {
            bw.write("Yes");
        }
        else {
            bw.write("No");
        }
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
