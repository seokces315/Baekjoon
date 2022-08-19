package Method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ArithSeq_1065 {

    // 한수를 찾는 메서드를 static으로 선언
    static boolean han(int n) {
        // 메서드에 필요한 변수 선언
        char[] intList;
        boolean bool;

        // 조건 분기
        if(n < 100) {
            // 수열이 1개이므로 차이가 항상 일정
            return true;
        }
        else {
            // 각 자리수를 배열에 저장
            intList = Integer.toString(n).toCharArray();
            
            // for-loop문 작성
            // 3개의 연속된 자리수를 묶음으로 반복
            for(int i=1 ; i<intList.length-1 ; i++) {
                // 등차수열 공식을 활용해서 한수 검사
                // 공식이 한번이라도 성립하지 않으면 한수가 아님
                bool = 2*intList[i] == intList[i+1] + intList[i-1];
                if(!bool) {
                    return false;
                }
            }
            // 모든 검사를 통과하면 '한수'
            return true;
        }
    }

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 자연수 N 입력받기
        int N = Integer.parseInt(br.readLine());

        // 주어진 표본범위에 대해 한수 검사를 실행
        // 한수의 개수를 변수에 저장
        int count = 0;
        for(int i=1 ; i<=N ; i++) {
            if(han(i)) {
                count++;
            }
        }

        // 원하는 결과를 출력
        bw.write(Integer.toString(count));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
