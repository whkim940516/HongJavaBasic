package Basicif;

public class Basicif {

	public static void main(String[] args) {
		
		// �Է� �޴� ��찡 �ƴϱ� ������ �ϴ� ���� �ʱ�ȭ�� ���־���.
		int k07_score = 0;  // k07_score ������ int ���·� �����Ͽ���.
		int k07_num = 0;	// k07_num ������ int ���·� �����Ͽ���.
		
		if(k07_score > 60) {					 // k07_score�� 60 �ʰ� �ϰ�� 
			System.out.println("�հ��Դϴ�.");  	 // �հ��Դϴٸ� ����Ѵ�.
		}
		if(k07_score > 60) {
			System.out.println("�հ��Դϴ�.");  	 // �ڵ尡 ���� �����ϴ�
		}
		if(k07_score < 60) {       				 // k07_score�� 60 �̸� �ϰ��
			System.out.println("�հ��Դϴ�.");  	 // �հ��Դϴٸ� ����Ѵ�.
		} else {
			System.out.println("���հ��Դϴ�."); 	 // �׷��� ���� ��� ���հ��Դϴٸ� ����Ѵ�.
		}
		
		if(k07_num > 0) {						 // k07_num�� 0 �ʰ� �ϰ��
			System.out.println("����Դϴ�.");  	 // ����Դϴٸ� ����Ѵ�.
		} else if(k07_num < 0) {				 // k07_num�� 0 �̸��� ���
			System.out.println("�����Դϴ�.");  	 // �����Դϴٸ� ����Ѵ�.
		} else {							 	 // �׷��� ���� ���
			System.out.println("���Դϴ�.");	 	 // ���Դϴٸ� ����Ѵ�.
		}
		
		if(k07_score >= 90) {					 	  	// k07_score�� 90 �̻��� ���
			System.out.println("A���");		 	 		// A����� ����Ѵ�.
		} else if(k07_score >= 80 && k07_score < 90) {  // k07_score�� 80�̻� 90 �̸��� ���
			System.out.println("B���");					// B����� ����Ѵ�.
		} else if(k07_score >= 70 && k07_score < 80) { 	// k07_score�� 70�̻� 80 �̸��� ���
			System.out.println("C���");					// C����� ����Ѵ�.
		} else {										// �׷��� ���� ���
			System.out.println("F���");			 		// F����� ����Ѵ�.
		}
	}

}
