package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 보강 코딩
// br.readLine()의 문자열을 split("")해서 String []에 저장가능
public class NumSum_11720 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        // 숫자의 개수 N (1 ~ 100) 입력받기
        int N = Integer.parseInt(br.readLine());

        // N개의 숫자 입력받아 문자 배열로 저장
        char[] numArr = br.readLine().toCharArray();

        // 반복문을 통해 N개의 숫자 연산
        // '0' 또는 48을 빼는 연산을 포함
        for(int i=0 ; i<N ; i++) {
            sum += numArr[i] - '0'; // char -> int 형변환
        }

        // 원하는 결과 출력
        bw.write(Integer.toString(sum));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
