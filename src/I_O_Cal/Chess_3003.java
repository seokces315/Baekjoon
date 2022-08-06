package I_O_Cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess_3003 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();  // 문자열 출력하는 하나의 방법
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 피스 개수 입력받기
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());
        int fourth = Integer.parseInt(st.nextToken());
        int fifth = Integer.parseInt(st.nextToken());
        int sixth = Integer.parseInt(st.nextToken());

        // 원하는 결과 출력
        // sb.append() 메서드 활용
        sb.append(1 - first);
        sb.append(" ");
        sb.append(1 - second);
        sb.append(" ");
        sb.append(2 - third);
        sb.append(" ");
        sb.append(2 - fourth);
        sb.append(" ");
        sb.append(2 - fifth);
        sb.append(" ");
        sb.append(8 - sixth);
        
        // sb 변수에 StringBuilder 객체가 저장된 상태
        // toString() 메서드로 문자열로 형변환 후 출력
        System.out.println(sb.toString());

    }

}
