package Elevator2;

import Elevator1.Elevator1;

public class Elevator2 {
	
	
	public static int k07_inVal;	// k07_inval�̶�� ������ ������ �������־���.
	
	public static void k07_up() {	// k07_up�̶�� public �޼��带 �������־���.
		k07_inVal++;			// k07_inval�� 1�� �����Ѵ�.
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k07_inVal);	// k07_inval�� ������ش�.		
	}
	public static void main(String[] args) {	// ���� �޼���
		
		k07_inVal = 0;			// �ڱ� ���� ������ ����Ѵ�.(k07_inval�� 0���� �ʱ�ȭ ���־���.)
		Elevator1 k07_elev;		// Elevator1Ŭ������ �޾� k07_elev ��ü�� ������־���.
		
		k07_elev = new Elevator1();		// ��ü k07_elev�� Elevator1 �ν��Ͻ��� �����Ͽ� ��ü�� �������־���.
		
		k07_up();				// ���� �ҽ� �� �޼ҵ��̴�.
		
		for(int i = 0; i < 10; i++) {	// k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_elev.up();		// Elevator1 Ŭ������ �� k07_elev ��ü��(�̳��� �ν��Ͻ��� ����������) k07_up �޼ҵ带 ȣ���Ѵ�.
			System.out.printf("MSG[%s]\n", k07_elev.k07_help);	// k07_elev�� k07_help�� ����Ѵ�.
		}
		
		for(int i = 0; i < 10; i++) {	// k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_elev.down();			// Elevator1Ŭ������ �� k07_elev ��ü��(�̳��� �ν��Ͻ�) k07_down �޼ҵ带 ȣ���Ѵ�.
			System.out.printf("MSG[%s]\n", k07_elev.k07_help);		// k07_elev�� k07_help�� ����Ѵ�.
		}

		
	}

}
