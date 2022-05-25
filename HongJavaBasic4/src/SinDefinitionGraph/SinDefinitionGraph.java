package SinDefinitionGraph;

// 360�� = 2pi
// sin �Լ��� -1 ~ 1 ���� ���´�.
// ���ȭ �Ͽ� 1�� ���ϸ� 0~2���� ���´�.
// ���ϱ� 50�� �ϸ� 0~100 ���� ǥ�� �����ϴ�.
// �� �� ��ŭ ��� �� ���� �� �ϳ� ����

public class SinDefinitionGraph {

	public static void main(String[] args) {

		double k07_fSin;		// double ���·� k07_fSin�� �������־���
		
		for(int k07_i = 0; k07_i < 360; k07_i++) {	// k07_i�� 0���� 359���� 1�� �����Ѵ�.
			k07_fSin = Math.sin(k07_i * 3.141592/180);  // ���� ������ �����ϱ� ���� ������ ����� ���� k07_fSin�� �������־���.
			
			int iSpace = (int)((1.0 - k07_fSin) * 50);   // 1���� k06_fSin�� ���� �� 50�� ���ؼ� �׸�ŭ ����ְ� int ���·� k07_iSpace�� �������ش�.
			for(int k07_j = 0; k07_j < iSpace; k07_j++) System.out.printf(" ");  // k07_j�� 0���� k07_iSpace ��ŭ ����ָ� 1�� �����Ѵ�. 
			System.out.printf("*[%f][%d]\n", k07_fSin, iSpace);			//  k07_fSin�� k07_iSpace�� �ش��ϴ� ������ ��µǸ� ���⵵ �׿� �°� ��µȴ�.
		}
	
	
	}
}
