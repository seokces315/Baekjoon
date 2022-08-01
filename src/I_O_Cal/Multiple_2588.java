package I_O_Cal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Multiple_2588 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 세 자리 자연수들 입력받기
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        // 각 자리수의 곱셈 연산 진행
        int first = A * (B % 10);
        int second = A * (B / 10 % 10);
        int third = A * (B / 10 / 10);

        // 원하는 결과 출력
        bw.write(String.valueOf(first) + "\n");
        bw.write(String.valueOf(second) + "\n");
        bw.write(String.valueOf(third) + "\n");
        bw.write(Integer.toString(first + (second*10) + (third*10*10)));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
