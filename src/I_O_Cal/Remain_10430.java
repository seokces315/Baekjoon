package I_O_Cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Remain_10430 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // A, B, C 입력받기
        // 2 <= A, B, C <= 10000
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 원하는 결과 출력
        sb.append((A+B) % C).append("\n");
        sb.append((A%C + B%C) % C).append("\n");
        sb.append((A*B) % C).append("\n");
        sb.append(((A%C) * (B%C)) % C);

        System.out.println(sb);

    }

}
