package BasicBreak;

/* break문
   자신이 포함된 하나의 반복문 또는 switch 문을 빠져 나온다.
   주로 if문과 함께 사용해서 특정 조건을 만족하면 반복문을 벗어나게 된다.
   */

public class BasicBreak {

	public static void main(String[] args) {

		int k07_sum = 0;   // k07_sum을 int형태로 값은 0으로 선언한다. (누적합 할때는 초기화 !)
		int k07_i = 0;	   // k07_i를 int 형태로 값은 0으로 선언한다. (변수 초기화)
		
		while(true) {		// while문 안에 true 가 있으면 무한반복 한다고 보면 된다.
			if(k07_sum > 100) {    // k07_sum이 100보다 초과이면
				break;   		// break 문이 수행되면 
				}
			k07_i++;			// 이 부분
			k07_sum += k07_i;	// 이 부분은 실행되지 않고 while문을 완전히 벗어난다.
		}
		System.out.println("i = " + k07_i);		// k07_i는 break되는 지점 이전까지인 14에서 출력된다.
		System.out.println("sum = " + k07_sum);	// k07_sum은 100을 넘는 지점인 105에서 break가 걸리게 되어 while문을 벗어나게 된다.
	}

}
