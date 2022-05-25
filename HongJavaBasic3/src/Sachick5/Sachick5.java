package Sachick5;

public class Sachick5 {

	public static void main(String[] args) {

		double k07_d = 2.8;   // k07_d 변수를 double 형태로 선언한다.
		System.out.printf("원래 값--> %f\n", k07_d);   // double 형태이기 때문에 printf 서식으로 %f를 사용해서 출력하도록 하였다.
		
		k07_d = k07_d + 0.5;  // k07_d 변수에 0.5를 더한 후 그 값을 k07_d에 대입해준다.
		System.out.printf("0.5더한 값--> %f\n", k07_d);  // double 형태이기 때문에 printf 서식으로 %f를 사용해서 출력하도록 하면 3.300000이 나오게 된다.
		
		System.out.printf("소수점 이하 반올림 값--> %d\n", (int)k07_d);   // 위의 k07_d의 변수를 int형태로 바꾸면 소수점 이하는 반올림 처리되어 3만 남게된다.
	}

}

//1. 연산자
// 1) 사칙연산
// 2) 연산 후 대입
// 3) 누적하기
// 4) 정수형 연산
// 5) 나머지(%)연산자의 응용
// 6) 반올림 버림 처리
// 7) 소수점 자리의 반올림 버림 처리

