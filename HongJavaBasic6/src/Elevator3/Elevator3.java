package Elevator3;

// 생성자(constructor),(소멸자),(이벤트)
// 클래스가 호출되면 (new)생성자가 실행된다. 생성자는 클래스 명과 동일한 public 메소드로 실행된다. 
// 또한 메소드 오버로딩도 가능하다. 보통 초기값 부여 등을 수행한다.

public class Elevator3 {
		
		public int k07_limit_up_floor;				// 최상위 층
		public int k07_limit_down_floor;			// 최하위 층
		public int k07_floor;						// 현재 층
		public String k07_help;					// 안내말
			
		// 클래스와 이름이 똑같은 메서드를 생성자라 한다.
		// 매개변수에 따라 다른 엘리베이터를 호출할 수 있다.
		
		public Elevator3() {			 // 매개변수를 받지 않을 경우
			k07_limit_up_floor = 10;		 // 최상위 층을 10층으로 설정하였다.
			k07_limit_down_floor = 1;		 // 최하위 층을 1층으로 설정하였다.
			k07_floor = 1;					 // 현재 층을 1층으로 설정하였다.
			k07_help = "엘리베이터 기본 준공완료";	 // 기본 엘리베이터 안내말이다.
			}
		
		public Elevator3(int k07_up_floor, int k07_d_floor, int k07_in_floor) {	// 매개변수를 지정 받았을 경우
			k07_limit_up_floor = k07_up_floor;		// 최상위 층의 값이 인자 up_floor의 값이 된다.
			k07_limit_down_floor = k07_d_floor;		// 최하위 층의 값이 인자 d_floor의 값이 된다.
			k07_floor = k07_in_floor;				// 현재 층의 값이 인자 in_floor의 값이 된다.
			k07_help = "엘리베이터 맞춤 준공완료";		// 맞춤 엘리베이터 안내말이다.
		}
		
		public void k07_up() {							// up 메소드를 생성해주었다.
			if(k07_floor==k07_limit_up_floor) {		// 현재층이 최상위 층이면
				k07_help = "마지막 층입니다";		// 마지막 층이라는 안내말이 나오도록 한다.
			} else {						// 현재층이 최상위 층이 아니면
				k07_floor++;					// 현재 층을 한 층씩 증가시킨다.
				k07_help = String.format("[%d] 층입니다", k07_floor);		// 현재 층수를 출력해준다.
			}
		}
		
		public void k07_down() {						// down 메소드를 생성해주었다.
			if(k07_floor==k07_limit_down_floor) {	// 현재층이 최하위 층이면
				k07_help = "처음 층입니다.";		// 처음 층이라는 안내말이 나오도록한다.
			} else {						// 현재층이 최하위 층이 아니면
				k07_floor--;					// 현재 층을 한 층씩 감소시킨다.
				k07_help = String.format("[%d] 층입니다", k07_floor);		// 현재 층수를 출력해준다.
			}
		}
		
		// 처음 몇층인지 지정한다면 그만큼 올라가도록 해봤다.
		public void k07_up(int k07_u) {						// 정수형 인자 u를 받는 up 메서드를 만들어주었다.
			for(int k07_i = 0; k07_i < k07_u; k07_i++) this.k07_up();	// this를 쓰면 명확해진다.(파이썬에서는 명확할 필요가 있다.)
		}
		
		// 처음 몇층인지 지정한다면 그만큼 내려가도록 해봤다.
		public void k07_down(int k07_u) {					// 정수형 인자 u를 받는 down 메서드를 만들어주었다.
			for(int i =0; i < k07_u; i++) k07_down();		// this를 쓰지 않아도 호출은 된다.
		}
		
		public void k07_msg(String id) {				// 문자형 인자 id를 받는 msg 메서드를 만들어주었다.
			System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",	 // 받은 문자열 id와 안내문 최상층 최하층 현재층이 출력되도록 하였다. 
					id, k07_help, k07_limit_up_floor, k07_limit_down_floor, k07_floor);
		}


}

