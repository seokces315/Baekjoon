package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 보강 코딩
// String 배열에 특정 단어 모두 저장
// String 메서드 contains, replace 활용
public class Croatia_2941 {

    public static void main(String[] args) throws IOException {

        // 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char cur;
        char pre;
        int count = 0;

        // 크로아티아 알파벳 입력받기
        String alpha = br.readLine();

        // for문
        // 알파벳의 개수 연산
        for(int i=0 ; i<alpha.length() ; i++) {
            cur = alpha.charAt(i);                      // 현재 알파벳
            pre = alpha.charAt(i - 1 < 0 ? 0 : i - 1);  // 직전의 알파벳
            count++;

            // 하나의 알파벳으로 변환되는 경우 찾기
            // 조건에 따른 분기
            if(cur == '=') {
                if(pre == 'c' || pre == 's')
                    count--;
                // 특수한 경우
                else if(pre == 'z') {
                    if(alpha.charAt(i - 2 < 0 ? 0 : i - 2) == 'd') // 인덱스 범위 예외처리
                        count -= 2;
                    else count--;
                }
            }
            else if(cur == '-') {
                if(pre == 'c' || pre == 'd')
                    count--;
            }
            else if(cur == 'j') {
                if(pre == 'l' || pre == 'n')
                    count--;
            }
        }

        // 결과 출력
        bw.write(Integer.toString(count));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
