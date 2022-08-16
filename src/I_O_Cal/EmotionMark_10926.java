package I_O_Cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmotionMark_10926 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String overlap;

        // 중복되는 아이디 입력받기
        overlap = br.readLine();

        // 원하는 결과 출력
        sb.append(overlap).append("??!");

        System.out.println(sb);


    }

}
