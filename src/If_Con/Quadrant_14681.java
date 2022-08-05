package If_Con;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quadrant_14681 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 선언 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;

        // 좌표 입력받기
        // -1000 <= x, y != 0 <= 1000
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        // 조건 분기후 변수에 저장
        if((x > 0) && (y >0)) {
            result = 1;
        }
        else if((x < 0) && (y > 0)) {
            result = 2;
        }
        else if((x < 0) && (y < 0)) {
            result = 3;
        }
        else if((x > 0) && (y < 0)) {
            result = 4;
        }

        // 원하는 결과 출력
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
