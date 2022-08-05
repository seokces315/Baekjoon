package If_Con;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ThreeDice_2480 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int reward;

        // 세 개의 주사위 눈을 입력받기
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());

        // 조건 분기후 변수에 저장
        if((first == second) && (second == third)) {
            reward = 10000 + second*1000;
        }
        else if((first == second) || (third == first)) { // 같은 패턴의 코드 간결히
            reward = 1000 + first*100;
        }
        else if(second == third) {
            reward = 1000 + third*100;
        }
        else {
            // Math.max() 메서드로 크기 비교를 쉽게할 수 있음
            reward = Math.max(Math.max(first, second), third) * 100;
        }

        // 원하는 결과 출력
        bw.write(Integer.toString(reward));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
