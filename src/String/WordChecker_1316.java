package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordChecker_1316 {

    public static void main(String[] args) throws IOException {

        // 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word;
        Set<String> alpha;
        int cnt = 0;

        // 단어의 개수 N(1 ~ 100) 입력받기
        int N = Integer.parseInt(br.readLine());

        // for문
        // 반복을 통해 그룹 단어의 개수 파악
        for(int i=0 ; i<N ; i++) {
            // 단어 입력받아서 Set에 저장
            word = br.readLine();
            alpha = new HashSet<>(Arrays.asList(word.split(""))); // 중복 X
            boolean flag = true;

            // Checker Loop
            Checker :
            for(String c : alpha) {
                int idx = -1;
                int tmp = word.indexOf(c); // 직전 인덱스를 담을 변수

                // while문
                // 알파벳을 더 이상 찾지 못해 -1이 리턴되면 종료
                while((idx = word.indexOf(c, idx + 1)) != -1) {
                    // 직전 - 현재 인덱스 비교해서 1보다 크면 flag 변화
                    if((idx - tmp) > 1) {
                        flag = false;
                        break Checker;
                    }

                    tmp = idx;
                }
            }
            
            // flag가 true면 카운트 증가
            if (flag) cnt++;
        }

        // 결과 출력
        bw.write(String.valueOf(cnt));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
