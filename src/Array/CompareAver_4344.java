package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CompareAver_4344 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String result;

        // 테스트 케이스의 개수, C 입력받기
        int C = Integer.parseInt(br.readLine());

        // for-loop문 작성
        int N, count;
        double total;
        int[] scoreList;
        for(int i=0 ; i<C ; i++) {
            // 학생의 수 및 점수 입력받기
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());

            // 입력받은 데이터를 배열에 저장
            // 평균 연산을 위해 데이터를 누적시키기
            total = 0.0;
            scoreList = new int[N];
            for(int j=0 ; j<N ; j++) {
                scoreList[j] = Integer.parseInt(st.nextToken());
                total += scoreList[j];
            }

            // 특정 배열에서 평균보다 큰 요소들의 비율을 측정
            count = 0;
            for(int score : scoreList) {
                if(score > (total / N)) {
                    count++;
                }
            }
            
            // 원하는 결과 버퍼에 내보내기
            result = String.format("%5.3f%%", (count * 100.0 / N));
            bw.write(result);
            bw.newLine();
        }
        
        // 버퍼 출력 및 스트림 종료
        bw.flush();
        bw.close();

    }

}
