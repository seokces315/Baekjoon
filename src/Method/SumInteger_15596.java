package Method;

public class SumInteger_15596 {
    
    // static으로 메서드 선언
    static long sum(int[] a) {
        // 결과를 누적시킬 변수 선언
        long total = 0 ;

        // for-loop문 작성
        // 배열의 요소들을 반복해서 더하기
        for(int num : a) {
            total += num;
        }

        // 변수에 누적된 값을 함수의 리턴값으로 지정
        return total;
    }

}
