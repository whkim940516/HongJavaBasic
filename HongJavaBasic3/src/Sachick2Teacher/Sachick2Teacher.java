// ���α׷����� ���� ����(sum)�ϴ� ���� ������ ����
// ������ ���� �� �ʱ�ȭ�ϰ�, �ݺ����� ���Ͽ� ��������� ���� ���� �״� ���
// ���⿡ M+ M- ��ư�� �� ����ϴ°�?

package Sachick2Teacher;

public class Sachick2Teacher {

	public static void main(String[] args) {

		int k07_sum = 0; // ���� ���� �� �ʱ�ȭ
		
		for(int k07_i=1; k07_i<101; k07_i++) {  // 1���� 100���� ���Ѵ�.
			k07_sum = k07_sum + k07_i; 			// �����ؼ� ��������.
		}
		System.out.printf("### : %d, %d", k07_sum, k07_sum/100);   // �հ�� ����� ����Ѵ�.
		
		int [] k07_v = {1,2,3,5,66};  // ���� �迭�� �����Ѵ�.
		
		int k07_vSum = 0;  // ������ ���̱� ������ �迭 ������ �ʱ�ȭ���ش�.
		
		for(int k07_i=0; k07_i<k07_v.length; k07_i++) {   // 0���� ������ŭ ���Ѵ�
			k07_vSum = k07_vSum + k07_v[k07_i];	 		  // �����Ѵ�.
		}
		System.out.printf("@@@ : %d, %d", k07_vSum, k07_vSum/k07_v.length);  // �����迭�� �հ�� ����� ����Ѵ�.
		
	}

}
