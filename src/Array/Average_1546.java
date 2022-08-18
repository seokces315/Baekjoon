package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average_1546 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 과목의 개수 N의 크기를 갖는
        // 성적을 저장할 배열 생성
        int[] scoreList = new int[Integer.parseInt(br.readLine())];
        
        // for-loop문 작성
        // 현재 성적 입력받아서 배열에 저장하기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<scoreList.length ; i++) {
            scoreList[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬후 최대값 찾기
        Arrays.sort(scoreList);
        int max = scoreList[scoreList.length-1];

        // for-loop문 작성
        // 각 배열에 요소에 대해 주어진 연산을 실행
        // 배열 요소의 총합을 요소의 개수로 나누어 평균을 구하기
        double total = 0;
        for(double score : scoreList) {
            total += score / max * 100;
        }

        bw.write(Double.toString(total / scoreList.length));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
