package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max_2562 {

    // 상수 선언
    public static final int N = 9;

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] intList = new int[N];
        
        // 입력받은 자연수를 순서대로 배열에 저장
        // for-loop문 작성
        for(int i=0 ; i<intList.length ; i++) {
            intList[i] = Integer.parseInt(br.readLine());
        }

        // 배열에 저장하지 않고 문제를 해결할 수 있지만
        // 반복문과 배열을 이용해서 최대값 갱신
        int max = 0;
        int index = -1;
        for(int i=0 ; i<intList.length ; i++) {
            if(max < intList[i]) {
                max = intList[i];
                index = i;
            }
        }

        // 갱신된 배열의 최대값과 해당하는 인덱스를 출력
        sb.append(max).append("\n").append(index + 1);

        System.out.println(sb);

    }

}
