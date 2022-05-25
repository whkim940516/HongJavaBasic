package MethodOverLoading1;

// 클래스 메소드는 argument(매개변수) 형식이나 갯수가 다르면 이름은 동일하게 사용하여 편리하게 사용할 수 있는데 
// 이러한 것을 메소드 오버로딩이라한다.

public class MethodOverLoading1 {	// 호출하기 위한 클래스를 만들어 주었다.
	
	public int k07_sum(int a, int b) {	// 정수형 인자 a와 b를 받아서 a+b가 리턴될 수 있는 int형 메서드를 만들어주었다.
		return a + b;
	}
	
	public int k07_sum(int a, int b, int c) {	// 정수형 인자 a,b,c를 받아서 a+b+c가 리턴될 수 있는 int형 메서드를 만들어주었다.
		return a + b + c;
	}
	
	public int k07_sum(int a, int b, int c, int d) {	// 정수형 인자 a,b,c,d를 받아서 a+b+c가 리턴될 수 있는 int형 메서드를 만들어주었다.
		return a + b + c + d;
	}
	
	public double k07_sum(double a, double b) {	// 실수형 인자 a,b를 받아서 a+b가 리턴될 수 있는 double형 메서드를 만들어주었다.
		return a + b;
	}
}
