package VarEx1;

public class VarEx1 {  // 클래스 선언
	public static void main(String[] args) {	// 메인으로부터 프로그램 시작
		
		int k07_year = 0;  // year라는 숫자형 변수를 정의하고 0으로 초기화
		int k07_age = 14;  // age라는 숫자형 변수를 정의하고 14로 초기화
		
		System.out.println("결과1 :" + k07_year); // year 변수를 화면에 출력
		System.out.println("결과2 :" + k07_age);  // age 변수를 화면에 출력
		
		k07_year = k07_age + 2000;  // 변수 age의 값에 2000을 더해서 변수 year에 저장
		k07_age = k07_age + 1;      // 변수 age에 저장된 값을 1 증가시킨다.
		
		System.out.println("결과3 :" + k07_year);
		System.out.println("결과4 :" + k07_age);
	}
}
