package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Remain_3052 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));;
        int N = 10; // 백준 입력파일에 10개의 정수가 존재

        // 특정 수를 42로 나누었을 때 나타날 수 있는 나머지의 배열
        // Default -> false
        boolean[] boolList = new boolean[42];
    
        // for-loop문
        // 중복 검사, 나타난 나머지를 인덱스 번호로 배열의 논리값을 변경
        for(int i=0 ; i<N ; i++) {
            boolList[Integer.parseInt(br.readLine()) % 42] = true;
        }

        // 배열에서 변경된 요소의 개수 -> 서로 다른 나머지의 개수
        // 반복문과 배열을 이용해 개수를 반환
        int count = 0;
        for(boolean bool : boolList) {
            if(bool) {
                count++;
            }
        }

        // 원하는 결과 출력
        bw.write(Integer.toString(count));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
