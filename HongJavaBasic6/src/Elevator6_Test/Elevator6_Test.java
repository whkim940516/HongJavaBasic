package Elevator6_Test;

import Elevator6.Elevator6;

public class Elevator6_Test {

	public static void main(String[] args) {

		Elevator6 k07_elev6;		// Elevator6 Ŭ������ �޾Ƽ� ��ü elev6�� �����Ͽ���.
		
		k07_elev6 = new Elevator6();			// �ν��Ͻ��� �����Ͽ� ��ü�� �������־���.
		
		for(int k07_i = 0; k07_i < 10; k07_i++) {		// k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_elev6.k07_up();							// k07_elev6 ��ü�� k07_up �޼��带 ȣ���Ѵ�.
			System.out.printf("MSG elev6[%s]\n", k07_elev6.k07_help);	// k07_elev6 ��ü�� k07_help �޼��带 ȣ���Ͽ� �ȳ����� �������� �Ѵ�.
		}
		
		for(int k07_i = 0; k07_i < 10; k07_i++) {		// k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_elev6.k07_down();						// k07_elev6 ��ü�� k07_down �޼��带 ȣ���Ѵ�.
			System.out.printf("MSG elev6[%s]\n", k07_elev6.k07_help);	// k07_elev6 ��ü�� k07_help �޼��带 ȣ���Ͽ� �ȳ����� ���������Ѵ�. 
		}
		k07_elev6.k07_Repair();					// k07_elev6 ��ü�� k07_Repair �޼��带 ȣ���Ѵ�.
		System.out.printf("MSG elev6[%s]\n", k07_elev6.k07_help);		// k07_elv6 ��ü�� k07_help �޼��带 ȣ���Ͽ� �ȳ����� �������� �Ѵ�.
	}

}
