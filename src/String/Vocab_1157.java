package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Vocab_1157 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] cntArr = new int[26]; // 0으로 자동 초기화
        char res = '\0';

        // 단어 입력받기
        String str = br.readLine().toUpperCase(); // 대소문자 구분 X

        // 반복문을 통해 사용된 알파벳을 카운트
        for(int i=0 ; i<str.length() ; i++) {
            cntArr[str.charAt(i) - 65]++;
        }

        // 갱신 알고리즘
        // 카운트배열의 요소에 따라 조건분기
        int max = -1;
        for(int i=0 ; i<cntArr.length ; i++) {
            if(max < cntArr[i]) {
                max = cntArr[i];
                res = (char)(i + 65);
            }
            else if(max == cntArr[i]) {
                res = '?';
            }
        }

        // 결과 출력
        bw.write(res);
        bw.newLine();
        bw.flush();
        bw.close();
        
    }

}
