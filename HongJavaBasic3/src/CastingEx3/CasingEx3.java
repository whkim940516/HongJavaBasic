package CastingEx3;

public class CasingEx3 {

	public static void main(String[] args) {

		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f = %20.18f\n", f);  // 전체 20자리중 소수점이하 18자리를 찍으라는 의미
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);	
	}
}


// % + 20.18f 의 의미도 알아보기