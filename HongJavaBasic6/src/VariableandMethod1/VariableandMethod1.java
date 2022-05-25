package VariableandMethod1;

// 함수를 메서드(method)라고 지칭한다.
// 자기 클래스 안에 함수를 정의하면 함수 이름으로만 불러올 수 있다.

public class VariableandMethod1 {
	
	public static void k07_iamMethod() {				// iamMethod()라는 함수, 메서드를 생성하였다.
		System.out.printf("메소드라 불러줘요~~\n");
	}
	public static void main(String[] args) {		// 메인 함수이다.

		VariableandMethod1.k07_iamMethod();				// 해당 클래스에서 .을 통해 iamMethod()를 호출하였다.
		k07_iamMethod();								// 해당 클래스 내에 있기 때문에 그냥 iamMethod()를 호출해도 호출이 된다.
	}

}
