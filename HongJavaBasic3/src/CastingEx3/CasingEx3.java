package CastingEx3;

public class CasingEx3 {

	public static void main(String[] args) {

		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f = %20.18f\n", f);  // ��ü 20�ڸ��� �Ҽ������� 18�ڸ��� ������� �ǹ�
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);	
	}
}


// % + 20.18f �� �ǹ̵� �˾ƺ���