package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_8958 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스의 개수 입력받기
        int T = Integer.parseInt(br.readLine());
        char[] result;

        // for-loop문 작성
        int total = 0;
        int count = 0;
        for(int i=0 ; i<T ; i++) {
            // OX 퀴즈의 결과 문자열을 입력받아서 배열에 저장
            result = br.readLine().toCharArray();
            
            // 이중 for-each문
            // 배열에 저장된 퀴즈결과에 대해 연산을 진행
            for(char ox : result) {
                if(ox == 'X') {
                    count = 0;
                }
                else {
                    total += ++count;
                }
            }
            
            // 버퍼에 결과 내보내기 및 초기화
            bw.write(Integer.toString(total));
            bw.newLine();
            total = 0;
            count = 0;
        }
        
        // 원하는 결과 출력
        bw.flush();
        bw.close();

    }

}
