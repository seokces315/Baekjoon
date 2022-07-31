package I_O_Cal;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Cat_10171 {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\\n");
        bw.write(" )  ( ')\n");
        bw.write("(  /  )\n");
        bw.write(" \\(__)|");
        bw.flush();
        bw.close();

    }

}
