package Elevator6;

import Elevator3.Elevator3;

// Overriding
// 클래스를 상속받아 재정의 할때, 아버지 클래스는 super(C++에서는 parent)라고 하고 자기 클래스는 this라고 지칭하여 구분한다.
// 즉, super 클래스의 method와 동일한 이름과 매개변수로 자식 클래스에서 메소드를 정의하면 super 클래스 메소드를 무시하고 자식 클래스의 메소드가 정의된다.
// 예제에서 Elevator6 클래스는 up 메소드는 다시 정의해서 두칸 올라가고 한칸 내려가는 방식으로 고쳤다.

public class Elevator6 extends Elevator3{
	
	public void k07_Repair() {					// Repair 메서드를 만들어주었다.
		k07_help = String.format("수리중입니다");		// 수리중이라는 안내문을 나오게 한다.
}
	public void k07_up() {				// 엘리베이터가 올라간다. (상속받아온 Elevator3의 k07_up메서드는 무시되고 현재 클래스에서 만들어준 k07_up 메서드가 실행된다.)
		if(k07_floor >= k07_limit_up_floor){	// 현재층이 최상층보다 크거나 같으면
			k07_help = "마지막 층입니다.";			// 마지막 층이다.
		} else {								// 현재층이 최상층보다 크거나 같지 않으면
			k07_floor = k07_floor + 2;			// 현재층에서 두 층씩 올라간다.
			k07_help = String.format("%d층입니다.", k07_floor);	// String.format을 활용하여 문자열로 바로 현재 층수를 출력한다.
		}
		
		this.k07_down();	// 현재 Elevator6의 down을 의미한다.  down도 현재 클래스인 Elevator6에서 재정의를 해줬는데 
	}						
	
	public void k07_down() {			// 엘리베이터가 내려간다.
		super.k07_down();				// 재정의를 하면서 super.down이면 상속받은 Elevator3에 있는 k07_down 메서드를 그냥 실행한다. 
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.k07_help);		// 재정의한 메서드에서 클래스 안에서 찍고있는 MSG 한줄을 추가해주었다.
																		// 즉, 상속받은 클래스에 있는 것을 실행하고 나서 밑에 한줄 추가한 것을 실행해달라는 의미이다.
//		this.k07_down();  재귀 호출시 뺑뺑이 돈다.(이런식으로는 쓰면 안된다. 계속 반복되기 때문에 시스템이 뻗는다. 여기서 여기있는 것을 계속 부르는 상황이니까..)
	}
}
