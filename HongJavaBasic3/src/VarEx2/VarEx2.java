// 값 교환

package VarEx2;

public class VarEx2 {  // 클래스 선언
	public static void main(String[] args) {  // 메인으로부터 프로그램 시작

		int x = 10;  // x라는 숫자형 변수를 정의하고 10으로 초기화
		int y = 20;	 // y라는 숫자형 변수를 정의하고 20으로 초기화
		int tmp = 0;  // tmp라는 숫자형 변수를 정의하고 0으로 초기화
		
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;  // 10이라는 값이 tmp변수에 정의됨
		x = y;    // y라는 값이 x변수에 정의됨
		y = tmp;  // tmp값이 y변수에 정의됨
		
		System.out.println("x:" + x + " y:" + y);
	}

}
