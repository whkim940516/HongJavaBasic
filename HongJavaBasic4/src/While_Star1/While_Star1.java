package While_Star1;

// �ܼ���
// for���� �Ⱦ��� while�� �ẻ ���
// �������� �ʱ�ȭ -> Looping -> ����

public class While_Star1 {

	public static void main(String[] args) {

		int k07_iA, k07_iB;   // int ���·� �Ͽ� k07_iA, k07_iB ������ �����Ѵ�
		
		k07_iA = 0;		// �⺻������ k07_iA ������ �ʱ�ȭ �����ش�.(���� ���� �ʱ�ȭ)
		while(true) {
			
			k07_iB = 0;	// �⺻������ k07_iB ������ �ʱ�ȭ �����ش�.(���� ���� �ʱ�ȭ)
			while(true) {
				System.out.printf("*");   // ���� ����ش�.
				
				if(k07_iA == k07_iB) break;   // 0  0 �̴ϱ� ó������ �� �ϳ��� ��� ������ �ȴ�.  -> �״��� 2�� 3��...30��
				k07_iB++;				  // k07_iB�� 1�� �����Ѵ�.
			}
			System.out.printf("\n");  // ���� �ٲ��ش�.
			k07_iA++;					  // k07_iA�� 1�� �����Ѵ�.
			if(k07_iA == 30) break;		  // k07_iA�� ���� 30�� �Ǹ� �ش� �ݺ����� �������´�.
		}
	}

}

