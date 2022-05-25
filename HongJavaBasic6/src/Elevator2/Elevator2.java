package Elevator2;

import Elevator1.Elevator1;

public class Elevator2 {
	
	
	public static int k07_inVal;	// k07_inval이라는 정수형 변수를 선언해주었다.
	
	public static void k07_up() {	// k07_up이라는 public 메서드를 생성해주었다.
		k07_inVal++;			// k07_inval은 1씩 증가한다.
		System.out.printf("난 그냥 메소드[%d]\n", k07_inVal);	// k07_inval을 출력해준다.		
	}
	public static void main(String[] args) {	// 메인 메서드
		
		k07_inVal = 0;			// 자기 내부 변수를 사용한다.(k07_inval을 0으로 초기화 해주었다.)
		Elevator1 k07_elev;		// Elevator1클래스를 받아 k07_elev 객체를 만들어주었다.
		
		k07_elev = new Elevator1();		// 객체 k07_elev에 Elevator1 인스턴스를 생성하여 객체에 연결해주었다.
		
		k07_up();				// 현재 소스 내 메소드이다.
		
		for(int i = 0; i < 10; i++) {	// k07_i는 0부터 9까지 1씩 증가한다.
			k07_elev.up();		// Elevator1 클래스를 찍어낸 k07_elev 객체의(이념은 인스턴스를 가지고있음) k07_up 메소드를 호출한다.
			System.out.printf("MSG[%s]\n", k07_elev.k07_help);	// k07_elev의 k07_help를 출력한다.
		}
		
		for(int i = 0; i < 10; i++) {	// k07_i는 0부터 9까지 1씩 증가한다.
			k07_elev.down();			// Elevator1클래스를 찍어낸 k07_elev 객체의(이념은 인스턴스) k07_down 메소드를 호출한다.
			System.out.printf("MSG[%s]\n", k07_elev.k07_help);		// k07_elev의 k07_help를 출력한다.
		}

		
	}

}
