// 백준 제출시 패키지 라인 삭제
package I_O_Cal;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 백준 제출시 클래스명 -> 'Main'
public class Hello {

    // BufferedWriter 클래스 사용시 예외처리 필요
    public static void main(String[] args) throws IOException {

        // 결과 출력시 System.out.print계열이 아닌
        // BufferedWriter 클래스로 성능 향상
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 필요한 결과 출력
        bw.write("Hello World!\n"); // 문자열형만 출력가능
        bw.flush(); // 버퍼 내 존재하는 모든 데이터 출력
        bw.close(); // BufferedWriter 스트림 닫기(flush + @)

    }

}
