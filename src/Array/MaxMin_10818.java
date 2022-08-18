package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxMin_10818 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 정수의 개수, N 입력받기
        // 1 <= N <= 1,000,000
        int N = Integer.parseInt(br.readLine());
        // 배열 선언
        int[] intList = new int[N];
        
        // 배열에 저장할 데이터 입력받기
        st = new StringTokenizer(br.readLine());
        // while-loop문 작성
        // 데이터가 더이상 존재하지 않을때까지
        int i = 0;
        while(st.hasMoreTokens()) {
            intList[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        // 1. 반복문으로 각 데이터를 비교하는 방법 -> 배열을 굳이 사용할 필요 X
        // 2. 정렬후 인덱스 번호를 이용해 최대/최소를 출력 -> O
        Arrays.sort(intList); // 변수에 저장할 필요없이 원본에 적용됨
        
        // 원하는 결과 출력
        // Arrays.sort() 메서드는 오름차순으로 배열을 정렬함
        // 최대값 -> 마지막 인덱스, 최소값 -> 첫 인덱스
        sb.append(intList[0]).append(" ").append(intList[N-1]);

        System.out.println(sb);
        
    }

}
