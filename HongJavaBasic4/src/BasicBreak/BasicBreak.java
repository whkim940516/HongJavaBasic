package BasicBreak;

/* break��
   �ڽ��� ���Ե� �ϳ��� �ݺ��� �Ǵ� switch ���� ���� ���´�.
   �ַ� if���� �Բ� ����ؼ� Ư�� ������ �����ϸ� �ݺ����� ����� �ȴ�.
   */

public class BasicBreak {

	public static void main(String[] args) {

		int k07_sum = 0;   // k07_sum�� int���·� ���� 0���� �����Ѵ�. (������ �Ҷ��� �ʱ�ȭ !)
		int k07_i = 0;	   // k07_i�� int ���·� ���� 0���� �����Ѵ�. (���� �ʱ�ȭ)
		
		while(true) {		// while�� �ȿ� true �� ������ ���ѹݺ� �Ѵٰ� ���� �ȴ�.
			if(k07_sum > 100) {    // k07_sum�� 100���� �ʰ��̸�
				break;   		// break ���� ����Ǹ� 
				}
			k07_i++;			// �� �κ�
			k07_sum += k07_i;	// �� �κ��� ������� �ʰ� while���� ������ �����.
		}
		System.out.println("i = " + k07_i);		// k07_i�� break�Ǵ� ���� ���������� 14���� ��µȴ�.
		System.out.println("sum = " + k07_sum);	// k07_sum�� 100�� �Ѵ� ������ 105���� break�� �ɸ��� �Ǿ� while���� ����� �ȴ�.
	}

}
