// #1. 연산 후 대입, 당연히 사칙연산의 순서

package Sachick;

public class Sachick {

	public static void main(String[] args) {

		int k07_ii; // k07_ii 변수를 정수 형태로 선언한다.
		k07_ii = 1+2;   // 1과 2를 더하여 k07_ii에 대입한다.
		System.out.printf("#1-1 : %d\n", k07_ii);  // java의 printf 출력 서식인 %d를 사용하여 k07_ii에 해당하는 값이 정수 형태로 나올 수 있도록 하고 
												   // printf를 사용했기 때문에 다음 줄을 바꿔줄 경우 println과 달리 \n 줄바꿈 기호를 추가해줘야 한다.
		
		k07_ii = 1+2*3;  // 사칙연산의 우선순위에 의해서 2*3을 진행하고 1을 더해서 k07_ii에 대입한다.(즉, 해당 코드에서는 위의 값이 바뀔 것이다.)
		System.out.printf("#1-2 : %d\n", k07_ii);  // java의 printf 출력 서식인 %d를 사용하여 k07_ii에 해당하는 값이 정수 형태로 나올 수 있도록 하고 
		   										   // printf를 사용했기 때문에 줄바꿈 기호인 \n을 사용한다.
		
	}

}
