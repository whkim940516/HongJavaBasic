package BasicContinue;

/* continue��
   �ڽ��� ���Ե� �ݺ����� ������ �̵��Ѵ�.(���� �ݺ����� �Ѿ��.)
   continue�� ������ ������� ������� �ʴ´�.
 */

public class BasicContinue {

	public static void main(String[] args) {
		
		for(int k07_i = 0; k07_i <= 10; k07_i++) {  // k07_i�� int���·� ����ǰ� 0���� �����ؼ� 10���� 1�� �����Ѵ�.
			if(k07_i % 3 == 0)						// k07_i�� 3���� ������ �������� ��, 3�� ����̸�
				continue;							// �ݺ����� ������ �̵��Ѵ�.(������ �����ϸ� continue�� ������ ������� ������� �����Ƿ�
			System.out.println(k07_i);				// ��µ� k07_i�� ���� 3�� ����� �����ϰ� ��µ� ���� Ȯ���� �� �ִ�.
		}
	}

}
