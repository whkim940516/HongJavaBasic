package BasicContinue;

/* continue문
   자신이 포함된 반복문의 끝으로 이동한다.(다음 반복으로 넘어간다.)
   continue문 이후의 문장들은 수행되지 않는다.
 */

public class BasicContinue {

	public static void main(String[] args) {
		
		for(int k07_i = 0; k07_i <= 10; k07_i++) {  // k07_i는 int형태로 선언되고 0부터 시작해서 10까지 1씩 증가한다.
			if(k07_i % 3 == 0)						// k07_i가 3으로 나누어 떨어지면 즉, 3의 배수이면
				continue;							// 반복문의 끝으로 이동한다.(조건을 만족하면 continue문 이후의 문장들은 수행되지 않으므로
			System.out.println(k07_i);				// 출력된 k07_i를 보면 3의 배수를 제외하고 출력된 것을 확인할 수 있다.
		}
	}

}
