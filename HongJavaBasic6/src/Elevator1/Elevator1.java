package Elevator1;

// 클래스는 앞서 언급한데로, c의 구조체의 확대, 즉 변수와 함수로 구성된다.
// 어느 클래스의 속한 변수와 함수를 가져다 쓰는데 중점을 둔다.
// 클래스를 가져다 사용,클래스(붕어빵틀)을 그대로 대입한 것을 객체(Object)라 하고 클래스를 실행시켜 사용 가능한 클래스 변수를 인스턴스라 한다.
// 앞에 설명했던 엘리베이터 클래스를 java 문법에 맞게 작성했다.

// String.format()은 리턴되는 문자열의 형태를 지정하는 메소드이다.
// 서식문자열의 앞에 %를 붙여 문자열에 사용하면 그 위치에 변수의 값을 형식화하여 대입이 가능하다.

public class Elevator1 {
	
	int k07_limit_up_floor = 10;	// 정수형태로 하여 최상위 층을 10으로 하였다.
	int k07_limit_down_floor = 0;	// 정수형태로 하여 최하위 층을 0으로 하였다.
	int k07_floor = 1;				// 정수형태로 하여 현재 층을 1로 하였다.
	public String k07_help;			 	// 출력될 안내문을 String형태로 선언해주었다.

	
	public void up() {		// up 메서드 : 엘리베이터가 올라간다.
		if(k07_floor == k07_limit_up_floor) {	// 현재 층이 최상위 층이면
			k07_help = "마지막 층입니다.";		// 해당 안내문이 나오도록 한다.
		} else {
			k07_floor++;		// 최상층이 아닐 때 한 층씩 올라간다.
			k07_help = String.format("%d층입니다", k07_floor);		// 현재 층수를 안내한다.
		}
	}
	
	public void down() {	// down 메서드 : 엘리베이터가 내려간다.
		if(k07_floor == k07_limit_down_floor) {	// 현재층이 최하위 층이면
			k07_help = "처음 층입니다.";		// 해당 안내문이 나오도록 한다.
		} else {
			k07_floor--;		// 최하층이 아닐때 한 층씩 내려간다.
			k07_help = String.format("%d층입니다.",k07_floor);		// 현재 층수를 안내한다.
		}
	}
	public static void main(String[] args) {

	}

}
