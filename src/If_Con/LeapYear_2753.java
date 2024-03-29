package If_Con;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 보강코딩
// 조건 분기를 삼항연산자로 표현할 수 있음
// { year%4==0 ? [ year%400==0 ? 1 : (year%100==0 ? 0 : 1) ] : 0 }
public class LeapYear_2753 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result;

        // 연도 입력받기
        // 1 <= year <= 4000
        int year = Integer.parseInt(br.readLine());

        // 조건 분기후 변수에 저장
        if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
            result = 1;
        }
        else {
            result = 0;
        }

        // 원하는 결과 출력
        bw.write(Integer.toString(result));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
