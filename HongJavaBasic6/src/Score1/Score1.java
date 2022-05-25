package Score1;

// 메소드 오버로딩을 이용하여 클래스를 만들고 사용
// 매개변수 3,4,5개로 호출되는 sum, ave함수를 만들어서 사용

public class Score1 {
	
		public int k07_sum(int k07_a, int k07_b, int k07_c) {		// 정수 형태로하여 정수형 인자를 3개 받고 합을 출력하도록 하는 메서드를 생성하였다.
			return k07_a + k07_b + k07_c;
		}
		
		public int k07_sum(int k07_a, int k07_b, int k07_c, int k07_d) {	// 정수 형태로하여 정수형 인자를 4개 받고 합을 출력하도록 하는 메서드를 생성하였다.
			return k07_a + k07_b + k07_c + k07_d;
		}
		
		public int k07_sum(int k07_a, int k07_b, int k07_c, int k07_d, int k07_e) {	// 정수 형태로하여 정수형 인자를 6개 받고 합을 출력하도록 하는 메서드를 생성하였다.
			return k07_a + k07_b + k07_c + k07_d + k07_e;
		}
		
		public double k07_ave(int k07_a, int k07_b, int k07_c) {		// 실수 형태로하여 정수형 인자를 3개 받고 평균을 출력하도록 하는 메서드를 생성하였다.
			return (k07_a + k07_b + k07_c) / 3;							
		}
		
		public double k07_ave(int k07_a, int k07_b, int k07_c, int k07_d) {	// 실수 형태로하여 정수형 인자를 4개 받고 평균을 출력하도록 하는 메서드를 생성하였다.
			return (k07_a + k07_b + k07_c + k07_d) / 4;
		}
		
		public double k07_ave(int k07_a, int k07_b, int k07_c, int k07_d, int k07_e) {	// 실수 형태로하여 정수형 인자를 5개 받고 평균을 출력하도록 하는 메서드를 생성하였다.
			return (k07_a + k07_b + k07_c + k07_d + k07_e) / 5;
		}
	
}
