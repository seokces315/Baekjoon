package If_Con;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class OvenClock_2525 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 현재 시각 및 요리하는 데 필요한 시간 입력받기
        // 현재 시각 -> 0 <= A <= 23, 0 <= B <= 59
        // 요리하는 데 필요한 시간 -> 0 <= C <= 1000
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        // 조건 분기 및 연산(종료되는 시각)
        int divC = C / 60;
        int remC = C % 60;

        if((B+remC) >= 60) {
            A += divC + 1;
            B += remC - 60;
        }
        else {
            A += divC;
            B += remC;
        }

        // 원하는 결과 출력
        bw.write("" + ((A>=24) ? A-24 : A) + " " + B);
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
