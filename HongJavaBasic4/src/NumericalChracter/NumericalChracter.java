package NumericalChracter;

/* ���ڴ� ������, �Ǽ��� �񱳿� ��������
   ��ȿ���ڿ� ��������
   char 1���� a = 'a'�� �񱳰� �����ϴ�.
   String�� Ŭ���� �Լ� .equal(" ")�� ����Ѵ�.
   �ƴϴٴ� !�̴�. */

public class NumericalChracter {

	public static void main(String[] args) {
		
		int k07_ii;   
		double k07_iD;
		
		k07_ii = 10/3;		// int�̱� ������ 3�� ���� ���̴�.
		k07_iD = 10/3.0;	// double�̱� ������ 3.33333 �� ���� ���̴�.
		
		// int�� double�� ������ ����� �Ǽ��� �����̴�.
		if (k07_ii == k07_iD) System.out.printf("equal\n");						// k07_ii�� k07_iD �� ������ equal�� ��������� 
		else System.out.printf("Not equal[%f][%f]\n", (double)k07_ii, k07_iD);	// �׷��� ������ �� ����� �� �� ������ %f�� ������ ��������Ƿ� �Ǽ����·� ��Ÿ���� �ȴ�.
																		// k07_ii�� ���� int������ ��ºο��� double�� �ٿ��־��� %f������ ��������Ƿ� �Ǽ� ���·� ������ �ǰ�
		// ���� ��ȿ���ڱ��� ǥ�õ� �� ������ �ٸ���.								// k07_iD�� ���� double ���¿��� %f ������ ��������Ƿ� �Ǽ����·� ������ �ȴ�.���� ���� ������ ���� �ٹٲ� ��ȣ \n�� ����ߴ�.
		if (k07_iD==3.333333) System.out.printf("equal\n");					
		else System.out.printf("Not equal[3.333333][%f]\n", k07_iD);		// k07_iD�� 3.333333�� �ƴϹǷ� Not equal~�� ���� ������� ��µȴ�.���� ���� ������ ���� �ٹٲ� ��ȣ \n�� ����ߴ�.
		
				
		k07_iD = (int)k07_iD;													// k07_iD�� ���� ���·� �ϰ� �̸� k07_iD�� �����Ѵ�.
		if(k07_ii == k07_iD) System.out.printf("equal\n");						// k07_ii�� ���� �����̰� k07_iD�� ���� �����̱� ������ 
		else System.out.printf("Not equal[%f][%f]\n", (double)k07_ii, k07_iD);	// equal�� ��µȴ�.���� ���� ������ ���� �ٹٲ� ��ȣ \n�� ����ߴ�.
		
		System.out.printf("int�� �μ�[%d][%f]\n", k07_ii, k07_iD);				// k07_ii�� int�̱� ������ %d �������� �������� �߰� k07_iD�� �Ǽ������̱� ������ %f �������� �������� �ߴ�.
		System.out.printf("double�� �μ�[%f][%f]\n", (double)k07_ii, k07_iD);		// �̹��� ���� �޸� k07_ii�� double���·� �ٲپ��־��� ������ %f�� ����Ͽ����� ��¹� ���� �Ǽ� ���·� ��µȴ�.
		
		char k07_a = 'c';													// c��� ���ڸ� a�� �����Ͽ� char ���·� �����Ѵ�.
		
		if (k07_a == 'b') System.out.printf("a�� b�̴�\n");
		if (k07_a == 'c') System.out.printf("a�� c�̴�\n");					// ������ a == 'c' �����Ƿ� �ش� ������ �����ϱ� ������ a�� c�̴� �� ����� ��µȴ�.
		if (k07_a == 'd') System.out.printf("a�� d�̴�");
		
		String k07_aa = "abcd";												// abcd��� ���ڸ� aa�� �����Ͽ� String ���·� �����Ѵ�.
		
		if(k07_aa.equals("abcd")) System.out.printf("aa�� abcd�̴�\n");   // ��ġ���� �޸� String������ equal("") �Լ��� ����Ͽ� ������ �ƴ����� ���Ѵ�.
		else System.out.printf("aa�� abcd�� �ƴϴ�\n");				// ���� if ���� ������ �����ϹǷ� aa�� abcd�̴� �� ��µȴ�.
		
		boolean k07_bb = true;											// boolean ���´� true�� false�� ��Ÿ����. ���⼭ bb�� true�� �Ͽ� boolean ���·� �����Ͽ���.
		
		if(!!k07_bb) System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�.\n");   // !!�� ���̴�. ���� bb�� ���̴ϱ� bb�� �ƴϰ� �ƴϸ� ���̴ٰ� ��µȴ�.
		else System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�.\n");
	}

}
