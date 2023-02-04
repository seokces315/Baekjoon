package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchAlpha_10809 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int idx;

        // 단어 S 입력받기
        String S = br.readLine();

        // for-loop문 작성
        // 단어 S에 대해 a-z 범위에서 검색하기
        for(int i=0 ; i<26 ; i++) {
            idx = S.indexOf(i + 97); // 찾지 못하면 -1 리턴
            sb.append(idx).append(" ");
        }
        
        // 결과 출력
        System.out.println(sb);
        
    }

}
