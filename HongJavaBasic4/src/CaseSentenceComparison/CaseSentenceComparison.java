package CaseSentenceComparison;

// Switch, case�� �������� ���� ����̴�.
// ���� break ������ ���������� ��ʸ� �� �� �ִ�.
// �� ������ ���� ������ ���� ���̸� �̷��� �̻��ϰ� ���α׷� ���� ������ �ǽ��� �غ��� �ϴ� �κ��̴�.

public class CaseSentenceComparison {

	public static void main(String[] args) {

		for(int k07_i = 1; k07_i < 13; k07_i++) {   // int ������ k07_i�� 1���� �����Ͽ� 12���� 1�� �����Ѵ�.
			System.out.printf(" %d�� =>", k07_i);			// �����ϴ� ��� k07_i�� %d �������·� ����ϵ��� �Ѵ�.
			LOOP:for(int k07_j = 1; k07_j < 32; k07_j++) {	// int ������ k07_j�� 1���� �����Ͽ� 31���� 1�� �����Ѵ�.
				
				System.out.printf("%d,", k07_j);		// �����ϴ� ��� k07_j�� %d �������·� ����ϵ��� �Ѵ�.
				
				switch(k07_i) {
					case 4: case 6: case 9: case 7: case 11:	// 4, 6, 9, 7, 11 �� �� 30�� �̴�.
						if(k07_j == 30) break LOOP;				// 30���� �Ǹ� break�� �ϰ� LOOP������ ���ư����� �Ͽ���.
						// ���� �̷� ǥ���� ���Ѵ�.
						// LOOP ��� ǥ���ڰ� ������ ������ ���
						break;									// �̷� ������ ǥ���ϴ� ���� ���� ǥ���� �ƴϴ�.
					case 2:
						if(k07_j == 28) break LOOP;		// 28���� �Ǹ� break�� �ϰ� LOOP������ ���ư����� �Ͽ���.
						break;
				}
			}
			System.out.printf("\n");   			// ���� ������ ���� �ٹٲ� ��ȣ \n�� �����.
		}
		
	}

}
