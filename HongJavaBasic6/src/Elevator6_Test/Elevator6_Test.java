package Elevator6_Test;

import Elevator6.Elevator6;

public class Elevator6_Test {

	public static void main(String[] args) {

		Elevator6 k07_elev6;		// Elevator6 클래스를 받아서 객체 elev6를 생성하였다.
		
		k07_elev6 = new Elevator6();			// 인스턴스를 생성하여 객체에 연결해주었다.
		
		for(int k07_i = 0; k07_i < 10; k07_i++) {		// k07_i는 0부터 9까지 1씩 증가한다.
			k07_elev6.k07_up();							// k07_elev6 객체의 k07_up 메서드를 호출한다.
			System.out.printf("MSG elev6[%s]\n", k07_elev6.k07_help);	// k07_elev6 객체의 k07_help 메서드를 호출하여 안내문이 나오도록 한다.
		}
		
		for(int k07_i = 0; k07_i < 10; k07_i++) {		// k07_i는 0부터 9까지 1씩 증가한다.
			k07_elev6.k07_down();						// k07_elev6 객체의 k07_down 메서드를 호출한다.
			System.out.printf("MSG elev6[%s]\n", k07_elev6.k07_help);	// k07_elev6 객체의 k07_help 메서드를 호출하여 안내문이 나오도록한다. 
		}
		k07_elev6.k07_Repair();					// k07_elev6 객체의 k07_Repair 메서드를 호출한다.
		System.out.printf("MSG elev6[%s]\n", k07_elev6.k07_help);		// k07_elv6 객체의 k07_help 메서드를 호출하여 안내문이 나오도록 한다.
	}

}
