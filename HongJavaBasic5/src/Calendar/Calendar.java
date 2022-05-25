package Calendar;

public class Calendar {

	public static void main(String[] args) {

		int k07_iWeekday = 5;				// int ���·� �������� iWeekday�� �Ͽ� ù��° ���� �����Ͽ���.
		int [] k07_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// �� ���� ������ ���� iEnd�� ���������� �Ͽ� �迭�� ����� �־���.
		
		// �⺻ ��� �κ�, �� ���
		for(int k07_iMonth = 0; k07_iMonth < 12; k07_iMonth++) {		// iMonth�� 0���� 11���� 1�� �����Ѵ�.
			System.out.printf("\n\n  %16d��\n", k07_iMonth+1);			// index�̱� ������ +1�� �ؼ� 0~11 => 1~12 ���� ��µ� �� �ְ� �Ͽ���.
			System.out.printf("======================================\n");
			System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n", "��", "��", "ȭ", "��", "��", "��", "��");  // ���ڿ��̱� ������ %s�� ����Ͽ��� ������ �ֱ����� ���Ļ��̿� ���� 4�� �־ 
																									   // %4s�� �����־���.
		// �� ���� ���� �κ�	
		for(int k07_blankindex = 0; k07_blankindex < k07_iWeekday; k07_blankindex++) {   // �� ó�� ������ �ݿ����̱� ������ �ݿ��� ������ �κ��� ������ ��µǵ��� �Ͽ���.
			System.out.printf("%5s", "");	  							 // ������ 5�������� ��µǵ��� �Ͽ���.(���鵵 ���ڿ��̱� ������ %s�� ����Ͽ���.)
		}
		
		// ���� ���
		for(int k07_iDay = 1; k07_iDay <= k07_iEnd[k07_iMonth]; k07_iDay++, k07_iWeekday++) {	// 1�� ���� �� ���� ������ �ϱ��� iDay�� iWeekday�� 1�� �����Ѵ�.
			if(k07_iWeekday % 7  == 6) {									// iWeekday�� 7�� �������� �� 6�� ���´ٴ� ���� ù��° ���� ��������� �ǹ��ϰ�
				System.out.printf("%5d\n", k07_iDay);						// ����ϸ��� �� �ٲ��� ���ֱ� ���ؼ� \n�� ����Ͽ���.���� ������ 5�� �־���.
				k07_iWeekday = k07_iWeekday - 7;							// ���� ������ ��Ȱ�� ��µǵ��� �ϱ� ���� �ʱ�ȭ�� ���ش�. �� �ڵ尡 ���� ��� 1�� ������ ������ ��Ȱ�� ��µ��� �ʴ´�.
			} else {														// ù��° ���� ������� �ƴ� ���
				System.out.printf("%5s", k07_iDay);							// ������ 5�� �Ͽ� '������ ��'���� ��µǵ��� �Ѵ�.
			}		
		}		
	}																							  
  }										
}												
