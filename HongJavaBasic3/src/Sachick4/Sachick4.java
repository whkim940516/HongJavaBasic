// #4. ���ϴ� �ڸ� �� �ݿø�, ����ó�� ��
// �׳��� ��, �� �츮���� ���� ���������� 10�� ������ 10�� ���� ���� �ݿø� �غ���
// 100�� 1000�� �ݿø��� ������ �����ض�

package Sachick4;

public class Sachick4 {

	public static void main(String[] args) {

		
		
		int k07_ii = 12345;   // 12345���� 10�� ���� ������ ó���ϱ� 
		int k07_j = (k07_ii/10)*10; // k07_ii/10 �� �ϸ� int �����̱� ������ 1234�� ���ԵǸ� ���� 10�� ���ϸ� 12340�� ���ԵǾ� ����ó���� �ȴ�.
									// ����� ���� k07_j�� �����Ѵ�.
		System.out.printf("#4-1 : %d\n", k07_j);   // k07_j�� ���� ���·� ����ϰ� \n�� �̿��Ͽ� �ٹٲ� �Ѵ�.
		
		k07_ii = 12345;	  // 12345���� 10������ �ݿø� ó���ϱ�
		k07_j = ((k07_ii+5)/10)*10; // 10������ �ݿø��Ǵϱ� k07_ii�� 5�� ������ �� ���� ������ ���������� 10�� �����ش�. �׷��� 12350�� ����� ������ �ȴ�.
		
		System.out.printf("#4-2 : %d\n", k07_j);   // k07_j�� ���� ���·� ����ϰ� \n�� �̿��Ͽ� �ٹٲ� �Ѵ�.
		
		k07_ii = 12344;   // 12344���� 10�� ���� �ݿø� ó���ϱ�
		k07_j = ((k07_ii+5)/10)*10;	// �ݿø��ϸ� 12340�� ������ �ȴ�.
		
		System.out.printf("#4-3 : %d\n", k07_j);   // k07_j�� ���� ���·� ����ϰ� \n�� �̿��Ͽ� �ٹٲ� �Ѵ�.
	}

}

