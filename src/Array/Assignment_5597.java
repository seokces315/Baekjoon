package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Assignment_5597 {

    // 상수 선언
    public static final int N = 30;

    public static void main(String[] args) throws IOException {

        // 사용할 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] adArr = new boolean[N + 1];

        // 제출자의 출석번호 입력받기
        int idx;
        while(true) {
            // 더이상 입력이 없으면 반복문 탈출
            try {
                idx = Integer.parseInt(br.readLine());
            }
            catch (NumberFormatException e) {
                break;
            }

            // 제출 확인
            adArr[idx] = true;
        }

        // 미제출자의 출석번호 버퍼에 내보내기
        adArr[0] = true;
        for(int i=0 ; i<adArr.length ; i++) {
            if(!adArr[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        // 원하는 결과 출력 및 스트림 닫기
        bw.flush();
        bw.close();

    }

}
