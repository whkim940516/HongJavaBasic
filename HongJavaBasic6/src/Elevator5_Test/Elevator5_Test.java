package Elevator5_Test;

import Elevator5.Elevator5;

public class Elevator5_Test {

	public static void main(String[] args) {

		Elevator5 k07_elev3;		// Elevator5 Ŭ������ �����ٰ� ������Ʈ elev3�� ������־���.
		
		k07_elev3 = new Elevator5();	// new �����ڷ� ���� ����� �־���.
		
		for(int k07_i = 0; k07_i < 10; k07_i++) {	// k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_elev3.k07_up();				// k07_elev3 ��ü�� k07_up �޼ҵ带 ȣ�����־���.
			System.out.printf("MSG elev3[%s]\n", k07_elev3.k07_help);	// ���������� ������ �ȳ����� �������� �Ͽ���.
		}
		
		for(int k07_i = 0; k07_i < 10; k07_i++) {	// k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_elev3.k07_down();			// k07_elev3 ��ü�� k07_down �޼ҵ带 ȣ�����־���.
			System.out.printf("MSG elev3[%s]\n", k07_elev3.k07_help);	// ���������� ������ �ȳ����� �������� �Ͽ���.
		}
		
		k07_elev3.k07_Repair();		// k07_elev3 ��ü���� ��ӹ޴� ������ �߰����� k07_Repair �޼��带 ȣ�����־���. 
		System.out.printf("MSG elev3[%s]\n", k07_elev3.k07_help);		// ������ �ȳ����� �������� �Ͽ���.
	}

}
