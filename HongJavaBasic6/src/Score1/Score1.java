package Score1;

// �޼ҵ� �����ε��� �̿��Ͽ� Ŭ������ ����� ���
// �Ű����� 3,4,5���� ȣ��Ǵ� sum, ave�Լ��� ���� ���

public class Score1 {
	
		public int k07_sum(int k07_a, int k07_b, int k07_c) {		// ���� ���·��Ͽ� ������ ���ڸ� 3�� �ް� ���� ����ϵ��� �ϴ� �޼��带 �����Ͽ���.
			return k07_a + k07_b + k07_c;
		}
		
		public int k07_sum(int k07_a, int k07_b, int k07_c, int k07_d) {	// ���� ���·��Ͽ� ������ ���ڸ� 4�� �ް� ���� ����ϵ��� �ϴ� �޼��带 �����Ͽ���.
			return k07_a + k07_b + k07_c + k07_d;
		}
		
		public int k07_sum(int k07_a, int k07_b, int k07_c, int k07_d, int k07_e) {	// ���� ���·��Ͽ� ������ ���ڸ� 6�� �ް� ���� ����ϵ��� �ϴ� �޼��带 �����Ͽ���.
			return k07_a + k07_b + k07_c + k07_d + k07_e;
		}
		
		public double k07_ave(int k07_a, int k07_b, int k07_c) {		// �Ǽ� ���·��Ͽ� ������ ���ڸ� 3�� �ް� ����� ����ϵ��� �ϴ� �޼��带 �����Ͽ���.
			return (k07_a + k07_b + k07_c) / 3;							
		}
		
		public double k07_ave(int k07_a, int k07_b, int k07_c, int k07_d) {	// �Ǽ� ���·��Ͽ� ������ ���ڸ� 4�� �ް� ����� ����ϵ��� �ϴ� �޼��带 �����Ͽ���.
			return (k07_a + k07_b + k07_c + k07_d) / 4;
		}
		
		public double k07_ave(int k07_a, int k07_b, int k07_c, int k07_d, int k07_e) {	// �Ǽ� ���·��Ͽ� ������ ���ڸ� 5�� �ް� ����� ����ϵ��� �ϴ� �޼��带 �����Ͽ���.
			return (k07_a + k07_b + k07_c + k07_d + k07_e) / 5;
		}
	
}
