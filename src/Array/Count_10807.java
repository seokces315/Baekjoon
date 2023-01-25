package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Count_10807 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = 0;

        // 정수의 개수 N(1 ~ 100) 입력받기
        int N = Integer.parseInt(br.readLine());

        // N개의 정수 입력받기
        st = new StringTokenizer(br.readLine());
        int[] intArr = new int[N];
        for(int i=0 ; i<intArr.length ; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        // 찾고자하는 정수 v(-100 ~ 100) 입력받기
        int v = Integer.parseInt(br.readLine());

        // 배열에 존재하는 v의 개수 찾기
        for(int ele : intArr) {
            if(ele == v) cnt++;
        }

        // 원하는 결과 출력
        bw.write(Integer.toString(cnt));
        bw.newLine();
        bw.flush();
        bw.close();
        
    }

}
