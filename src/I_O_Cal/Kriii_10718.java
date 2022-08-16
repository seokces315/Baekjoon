package I_O_Cal;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Kriii_10718 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 필요한 결과 출력
        for(int i=0 ; i<2 ; i++) {
            bw.write("강한친구 대한육군\n");
        }

        bw.flush();
        bw.close();

    }

}
