package Elevator5;

import Elevator3.Elevator3;

// 클래스를 상속받아 재정의가 가능하다. 즉, 클래스를 통으로 가지고 온다.(public으로 선언되 것을 다 사용 가능하다.)
// 아래 Elevator5 클래스는 Elevator3를 상속받아 만들었다. : Elevator3에서 사용가능한(public 등) 함수 변수를 그대로 가져다 사용 가능하다.
// Elevator3을 사용한 예제를 보면 up(),down(),, 메소드를 사용하고 또한 Repair()라는 메소드도 사용하고 있다.
// 자바에서는 다중 상속이 금지되어있다.(즉, Elevator3을 상속하여 Elevator5를 만들었는데 Elevator5는 더 이상 상속이 되지 않는다.)

public class Elevator5 extends Elevator3{	// 클래스 Elevator5는 클래스 Elevator3을 상속받는다. 
	
	public void k07_Repair() {					// Elevator3에는 없던 함수인 Repair() 함수를 추가해주었다.
		k07_help = String.format("수리중입니다.");		// 수리중입니다 라는 안내문이 나오도록 하였다.
	}
}
