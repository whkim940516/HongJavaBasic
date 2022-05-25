// #4. 원하는 자릿 수 반올림, 버림처리 ★
// 그놈의 돈, 왜 우리나라 돈은 현실적으로 10원 단위라 10원 기준 버림 반올림 해보자
// 100원 1000원 반올림을 스스로 구현해라

package Sachick4;

public class Sachick4 {

	public static void main(String[] args) {

		
		
		int k07_ii = 12345;   // 12345원은 10원 이하 버려서 처리하기 
		int k07_j = (k07_ii/10)*10; // k07_ii/10 을 하면 int 형태이기 때문에 1234만 남게되며 이후 10을 곱하면 12340만 남게되어 버림처리가 된다.
									// 계산한 값을 k07_j에 대입한다.
		System.out.printf("#4-1 : %d\n", k07_j);   // k07_j를 정수 형태로 출력하고 \n를 이용하여 줄바꿈 한다.
		
		k07_ii = 12345;	  // 12345원은 10원이하 반올림 처리하기
		k07_j = ((k07_ii+5)/10)*10; // 10원에서 반올림되니까 k07_ii에 5를 더해준 후 위의 과정과 마찬가지로 10을 곱해준다. 그러면 12350이 결과로 나오게 된다.
		
		System.out.printf("#4-2 : %d\n", k07_j);   // k07_j를 정수 형태로 출력하고 \n를 이용하여 줄바꿈 한다.
		
		k07_ii = 12344;   // 12344원은 10원 이하 반올림 처리하기
		k07_j = ((k07_ii+5)/10)*10;	// 반올림하면 12340이 나오게 된다.
		
		System.out.printf("#4-3 : %d\n", k07_j);   // k07_j를 정수 형태로 출력하고 \n를 이용하여 줄바꿈 한다.
	}

}


