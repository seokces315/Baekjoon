package If_Con;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlarmClock_2884 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 시간 입력받기
        // 0 <= H <= 23, 0 <= M <= 59
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 조건 분기 및 연산(45분 알람 일찍 설정하기)
        if(M >= 45) {
            M -= 45;
        }
        else {
            if(H == 0) {
                H = 23;
            }
            else {
                H--;
            }
            M += 15;
        }

        // 원하는 결과 출력
        sb.append(H).append(" ").append(M);

        System.out.println(sb);

    }

}
