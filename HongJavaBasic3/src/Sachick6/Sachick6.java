package Sachick6;

// # 5. 소수점 이하에서는 어떻게 할까?

public class Sachick6 {

	public static void main(String[] args) {

		int k07_MyVal = 14/5;  //  버리면 2, 반올림하면 3인 값
		System.out.printf("#5-1 : %d\n", k07_MyVal);   // k07_MyVal 변수를 그냥 연산하고 넣으면 int 형태이기 때문에 소수점이 자동으로 버려진다.
													   // 실수형 계산을 한 후 0.5를 더하고 정수형 형변환을 하면 반올림 처리가 된다.
		
		double k07_MyValF;  // k07_MyValF변수를 double형태로 선언하면 소수점을 사용할 수 있게 된다.
			
		k07_MyValF = 14/5;   // 실수 형태의 표시를 해주지 않으면 나머지는 자동으로 버림되게 몫만 남게 된다.
		System.out.printf("#5-2 : %f\n", k07_MyValF);  // printf 서식인 %f를 통해 실수 형태로 k07_MyValF 변수를 출력한다.
		
		k07_MyValF = 14.0/5;   // 그냥 14가아니라 14. 이나 5. 과 같은 실수 형태의 표시를 해야 실수 형태의 결과가 나온다.
		System.out.printf("#5-3 : %f\n", k07_MyValF);  // printf 서식인 %f를 통해 실수 형태로 k07_MyValF 변수를 출력한다.
		
		k07_MyValF = (14.0)/ 5 + 0.5;  // 실수형 계산에서 0.5 더하기
		System.out.printf("#5-4 : %f\n", k07_MyValF);  // 14.0/5 를 먼저 계산하고(2.8) 그 이후 0.5를 더하기 때문에 3.3을 결과값으로 출력하게 된다.
		
		k07_MyVal = (int)((14.0)/5 + 0.5);   // 실수형 계산을 하고 난 후 (int)를 통해 정수형 형 변환을 한다.
		System.out.printf("#5-5 : %d\n", k07_MyVal);  // 정수형이기 때문에 %d 서식을 통해 해당 값을 출력한다.
		
	}

}
