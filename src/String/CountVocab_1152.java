package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 보강코딩
// 예외처리 -> 아무것도 입력되지 않았을 때
// 이상적인 결과 = 0, split 메서드 사용후 결과 = 1
public class CountVocab_1152 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int res;
        
        // 문자열 입력받기
        // 불필요한 공백제거후 split, 배열에 저장
        String[] vocabArr = br.readLine().strip().split(" ");

        // 조건 분기후 결과 출력
        res = vocabArr[0] == "" ? 0 : vocabArr.length; // 삼항연산자

        bw.write(Integer.toString(res));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
