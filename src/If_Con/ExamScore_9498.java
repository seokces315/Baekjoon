package If_Con;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ExamScore_9498 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char result;

        // 시험 점수 입력받기
        // 0 <= ExamScore <= 100
        int ExamScore = Integer.parseInt(br.readLine());

        // 조건 분기후 변수에 저장
        if(ExamScore >= 90) {
            result = 'A';
        }
        else if(ExamScore >= 80) {
            result = 'B';
        }
        else if(ExamScore >= 70) {
            result = 'C';
        }
        else if(ExamScore >= 60) {
            result = 'D';
        }
        else {
            result = 'F';
        }

        // 원하는 결과 출력
        bw.write(result);
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
