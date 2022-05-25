package For_gugu1;

public class For_gugu1 {

	public static void main(String[] args) {

		int k07_sum = 0;					// 누적 합은 반드시 변수 초기화 !!
		for(int k07_i = 0; k07_i < 10; k07_i++) {	// int 형태인 k07_i는 0부터 9까지 1씩 증가한다.
			k07_sum = k07_sum + k07_i;				// k07_sum에 k07_i를 더한 것을 k07_sum에 대입해준다.(누적합)
		}
		System.out.printf("sum %d\n", k07_sum);		// 누적합의 결과는 %d 서식을 사용했으므로 정수 형태로 출력된다.
		
	}

}
