package Method;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SelfNumber_4673 {
    
    // 보강 코딩
    // 셀프 넘버 메서드의 다른 알고리즘
    static int d_alpha(int n) {
        // 함수의 연산 결과를 저장할 변수 선언
        int result = n;

        // 셀프 넘버 연산
        // 몫이 0이 될때까지 반복함
        while(n != 0) {
            // 현재 n의 일의 자리수를 더하고
            // 10으로 나누어서 다음 반복을 시작
            result += n % 10;
            n /= 10;
        }

        // 계산 결과 반환
        return result;
    }

    // 셀프 넘버 메서드 선언
    static int d(int n) {
        // 전달된 인자의 각 자리수를 배열에 저장
        char[] nArr = Integer.toString(n).toCharArray();

        int result = n;
        // 셀프 넘버 연산
        for(int i=0 ; i<nArr.length ; i++) {
            // char '0'에 해당하는 크기만큼 빼서 int로 변환
            result += nArr[i] - '0';
        }
        
        // 계산 결과 반환
        return result;
    }
    
    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] boolList = new boolean[10001]; // false로 초기화

        // 생성자를 가지는 수의 논리값을 변경
        boolList[0] = true;
        for(int i=1 ; i<=10000 ; i++) {
            if(d_alpha(i) <= 10000) {
                boolList[d_alpha(i)] = true;
            }
        }

        // for-loop문 작성
        // 배열의 논리값으로 셀프 넘버를 구분해서 출력
        for(int i=0 ; i<boolList.length ; i++) {
            if(!boolList[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();

    }

}
