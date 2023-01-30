package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ascii_11654 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자 입력받기
        // read(): 문자 -> 아스키 코드 값, 자동 변환
        int c = br.read(); 

        // 원하는 결과 출력
        bw.write(String.valueOf(c));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
