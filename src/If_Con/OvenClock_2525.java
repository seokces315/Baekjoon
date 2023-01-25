package If_Con;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 보강 코딩
// 입력받은 현재 시각 및 요리시간을 연산하고 단위를 통일(분)
// 통일된 시간을 다시 시, 분 단위로 구분해서 출력
public class OvenClock_2525 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 현재 시각 및 요리하는 데 필요한 시간 입력받기
        // 현재 시각 -> 0 <= A <= 23, 0 <= B <= 59
        // 요리하는 데 필요한 시간 -> 0 <= C <= 1000
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        // 조건 분기 및 연산(종료되는 시각)
        // 요리 시간을 시, 분 단위로 구분
        int divC = C / 60;
        int remC = C % 60;

        // 올림 처리
        if((B + remC) >= 60) {
            A++;
            B -= 60;
        }

        // 각 변수에 구분된 데이터를 더하기
        A += divC;
        B += remC;
        
        // 원하는 결과 출력
        // A의 특수한 상황은 삼항연산자를 통해 해결
        sb.append((A >= 24) ? A - 24 : A).append(" ").append(B);

        System.out.println(sb);

    }

}
