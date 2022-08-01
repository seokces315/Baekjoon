package I_O_Cal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Buddha_18108 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int AD;

        // 불기 연도를 입력받기
        // 1000 <= y <= 3000
        int BE = Integer.parseInt(br.readLine());
        // 불기연도 - 543 = 서기연도
        AD = BE - 543;

        // 원하는 결과 출력
        bw.write(String.valueOf(AD));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
