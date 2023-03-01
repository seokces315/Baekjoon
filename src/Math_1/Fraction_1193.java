package Math_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fraction_1193 {

    // 시그마 함수 정의
    static int sigma(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) throws IOException {
        
        // 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // X(1 ~ 10,000,000) 입력받기
        int X = Integer.parseInt(br.readLine());

        // while문
        // 몇 번째 지그재그인지 파악
        int i = 1;
        int sum;
        while(true) {
            // 현재 지그재그에 도달하면 탈출
            if(sigma(i) >= X) {
                sum = sigma(i - 1); // 직전 지그재그의 시그마 저장
                break;
            }

            i++;
        }

        // 조건 분기
        if(i % 2 == 1) {
            sb.append(++i - X + sum).append('/').append(X - sum);
        }
        else {
            sb.append(X - sum).append('/').append(++i - X + sum);
        }
        
        // 결과 출력
        System.out.println(sb);

    }

}
