package ScopingComparison;

// 범위를 줘서 찾기
// 범위 내 값을 찾을 시 예제와 같이 비교한다.
// && || => 두 개를 쓰는데 유의하자 , 한 개는 bit 연산자이다.

public class ScopingComparison {

	public static void main(String[] args) {
		
		int k07_iVal;  // k07_iVal 변수를 int 형태로 선언해주었다.
		
		for(int k07_i = 0; k07_i < 300; k07_i++) {	// int 형태인 k07_i는 0부터 시작하여 299까지 1씩 증가한다.
			k07_iVal = 5 * k07_i;				// 5의 배수들을 체크하도록 k07_i에 5를 곱해주었다.
			if(k07_iVal >= 0 && k07_iVal < 10) System.out.printf("일 %d\n", k07_iVal);		// k07_iVal에서 0부터 시작하여 9까지 0을 포함해서 5의 배수들이 출력되며 가장 왼쪽에 자릿 수에 맞게 '일'이 나오도록 하였다.
			else if (k07_iVal >= 10 && k07_iVal < 100) System.out.printf("십 %d\n", k07_iVal);	// k07_iVal은 10이상 99미만 까지에서 5의 배수들이 들이 출력되며 여기서는 십의 자리이므로 '십'이 나오도록 하였다.
			else if (k07_iVal >= 100 && k07_iVal < 1000) System.out.printf("백 %d\n", k07_iVal); // k07_iVal은 100이상 999미만 까지에서 5의 배수들이 출력되며 여기서는 백의 자리이므로 '백'이 나오도록 하였다. 
			else System.out.printf("천 %d\n", k07_iVal);									// 위의 조건을 만족하는 것이 없다면 천의 자리로 출력하도록 한다.
		}																			// 모든 출력물은 정수형태이기 때문에 %d 서식을 사용하였다.
		
	}

}
