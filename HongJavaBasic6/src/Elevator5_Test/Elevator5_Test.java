package Elevator5_Test;

import Elevator5.Elevator5;

public class Elevator5_Test {

	public static void main(String[] args) {

		Elevator5 k07_elev3;		// Elevator5 클래스를 가져다가 오브젝트 elev3를 만들어주었다.
		
		k07_elev3 = new Elevator5();	// new 생성자로 값을 만들어 주었다.
		
		for(int k07_i = 0; k07_i < 10; k07_i++) {	// k07_i는 0부터 9까지 1씩 증가한다.
			k07_elev3.k07_up();				// k07_elev3 객체의 k07_up 메소드를 호출해주었다.
			System.out.printf("MSG elev3[%s]\n", k07_elev3.k07_help);	// 엘리베이터 층수와 안내말이 나오도록 하였다.
		}
		
		for(int k07_i = 0; k07_i < 10; k07_i++) {	// k07_i는 0부터 9까지 1씩 증가한다.
			k07_elev3.k07_down();			// k07_elev3 객체의 k07_down 메소드를 호출해주었다.
			System.out.printf("MSG elev3[%s]\n", k07_elev3.k07_help);	// 엘리베이터 층수와 안내말이 나오도록 하였다.
		}
		
		k07_elev3.k07_Repair();		// k07_elev3 객체에서 상속받는 과정에 추가해준 k07_Repair 메서드를 호출해주었다. 
		System.out.printf("MSG elev3[%s]\n", k07_elev3.k07_help);		// 수리중 안내말이 나오도록 하였다.
	}

}
