package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dial_5622 {

    public static void main(String[] args) throws IOException {

        // 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = 0;

        // 단어 입력받기
        String dial = br.readLine();

        // switch문
        // 반복을 통해 다이얼을 위한 시간 연산
        for(int i=0 ; i<dial.length() ; i++) {
            // 조건 분기
            switch(dial.charAt(i)) {
                case 'A' : case 'B' : case 'C' :
                    total += 3;
                    break;
                case 'D' : case 'E' : case 'F' :
                    total += 4;
                    break;
                case 'G' : case 'H' : case 'I' :
                    total += 5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    total += 6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    total += 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    total += 8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    total += 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    total += 10;
                    break;
                default :
                    break;
            }
        }

        // 결과 출력
        bw.write(String.valueOf(total));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
