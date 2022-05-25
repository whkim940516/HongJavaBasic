package Elevator4;

import Elevator3.Elevator3;

public class Elevator4 {
		
		// 각각 고정적인 공간을 만들기 위해서 static을 사용하였다.(오브젝트가 pc나 서버내에서 메모리 공간을 차지해도 간섭을 받지 않음)
		// Elevator3 변수로 오브젝트 3개를 만들어주었다.
		static Elevator3 k07_elev1;	   // Elevator3 클래스를 가져가다 오브젝트 elev1를 만들었다.
		static Elevator3 k07_elev2;	   // Elevator3 클래스를 가져가다 오브젝트 elev2를 만들었다.
		static Elevator3 k07_elev3;	   // Elevator3 클래스를 가져가다 오브젝트 elev3을 만들었다.
		

	public static void main(String[] args) {
		
		// 각각 new 생성자로 값을 만들어 주었다.
		k07_elev1 = new Elevator3();			// 인자를 받지 않았으므로 기본 엘리베이터이다. (최상층 10 최하층 1 현재층 1인 엘리베이터)
		k07_elev2 = new Elevator3(20, 1, 8);	// 맞춤 엘리베이터 1이다.	(최상층 20 최하층 1 현재층이 8인 엘리베이터)
		k07_elev3 = new Elevator3(50, -3, 5);	// 맞춤 엘리베이터 2이다.(최상층 50 최하층 지하3층 현재층 5인 엘리베이터)
		
		for(int k07_i = 0; k07_i < 20; k07_i++) {						// k07_i는 0부터 19까지 1씩 증가한다.
			k07_elev1.k07_up(); k07_elev1.k07_msg("1번엘레 한층 오르기");	// Elevator3 클래스를 통해 생성된 elev1 객체에서 up 메서드와 msg 메서드를 호출한다.
//			elev2.up(); elev2.msg("2번엘레 한층 오르기");
//			elev3.up(); elev3.msg("3번엘레 한층 오르기");
		}
		
		for(int k07_i = 0; k07_i < 20; k07_i++) {							// k07_i는 0부터 19까지 1씩 증가한다.
			k07_elev1.k07_up(2); k07_elev1.k07_msg("1번엘레 2층씩 오르기");	 	// Elevator3 클래스를 통해 생성된 elev1 객체에서 up 메서드와 msg 메서드를 호출한다.
//			elev2.up(2); elev2.msg("2번엘레 2층씩 오르기");		// 그리고 2층으로 지정해주었다.
//			elev3.up(2); elev3.msg("3번엘레 2층씩 오르기");
		}
		
		for(int k07_i = 0; k07_i < 20; k07_i++) {							// k07_i는 0부터 19까지 1씩 증가한다.
			k07_elev1.k07_down(3); k07_elev1.k07_msg("1번엘레 3층씩 내리기");	// Elevator3 클래스를 통해 생성된 elev1 객체에서 up 메서드와 msg 메서드를 호출한다.
//			elev2.down(3); elev2.msg("2번엘레 3층씩 내리기");	// 그리고 3층으로 지정해주었다.
//			elev3.down(3); elev3.msg("3번엘레 3층씩 내리기"); 
		}

	}

}
