package I_O_Cal;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Sprout_25083 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 원하는 결과 출력
        bw.write("         ,r'\"7\n");
        bw.write("r`-_   ,'  ,/\n");
        bw.write(" \\. \". L_r'\n");
        bw.write("   `~\\/\n");
        bw.write("      |\n");
        bw.write("      |\n");
        bw.flush();
        bw.close();

    }

}
