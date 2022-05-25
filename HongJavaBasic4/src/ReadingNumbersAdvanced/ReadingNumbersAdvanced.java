package ReadingNumbersAdvanced;

// ���� �б� ���
// 1) ���ʿ��� ���� �Ѱ��� ó��
// 2) ��,��,��,...,��,���� ���� ������ ����.
// �ش� ���ڰ� �� �ڸ� ���� �˾Ƴ��� ù ���ڰ� ������ � ������ �ȴ�.

public class ReadingNumbersAdvanced {

	public static void main(String[] args) {

		int k07_iNumVal = 1001034567;					// int ���·� k07_iNumVal�� ���������� �Ͽ� �ش� ���ڸ� �����Ͽ� �����Ѵ�.
		String k07_sNumVal = String.valueOf(k07_iNumVal); 		// ���ڿ� valueof�� �¿�� ���ڷ� ��ȯ�� �Ǹ� �̰��� k07_sNumVal�� ���������� �Ͽ� �������־���.
		String k07_sNumVoice = "";							// String ���·� k07_sNumVoice�� ���������� �Ͽ� ������ �־��־���. 
		
		System.out.printf("==> %s [%d�ڸ�]\n", k07_sNumVal, k07_sNumVal.length());	// k07_sNumval�� ���ڿ��̹Ƿ� %s ������ ����Ͽ� ����ϵ��� �Ͽ���
																			// k07_sNumval�� ���̴� 10�̹Ƿ� 10�� ��µȴ�. �� 10�� �����̹Ƿ�
		int k07_i, k07_j;    // int ���·� �Ͽ� k07_i, k07_j�� �������ش�.					// %d ������ ����Ͽ� ������ش�.
		
		String [] k07_units = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};  // String ���·� �Ͽ� k07_units�� ���������� �Ͽ� �迭�� �������־����� ���� ������ ������ �Ͽ���.
		String [] k07_unitX = {"", "��", "��", "õ", "��", "��", "��", "õ", "��", "��"};	  // String ���·� �Ͽ� k07_unitX�� ���������� �Ͽ� �迭�� �������־����� ���� ������ ������ �Ͽ���.
		
		k07_i = 0;		// k07_i ������ �ʱ�ȭ ���־���.
		k07_j = k07_sNumVal.length() - 1;	// k07_sNumVal.length()���� 1�� �� ���� k07_j������ �������־���.(1���� ���� �ε����� ���߱� �����̴�.)
									// length �Լ��� ���״�� ���̸� ������ֱ� ������ �ε����� ���� �����ؾ��� ��� 1�� ����� �Ѵ�.
		
		while(true) {							// while(true)�� ���� �ݺ��� ����
			if(k07_i >= k07_sNumVal.length()) break;	// k07_i�� sNumval.length() �̻��� ��� �ݺ����� Ż���Ѵ�.
			
			// substring �Լ��� �Է� ���ڰ��� �ΰ��̸� => substring(int beginindex, int endindex)
			// ù��° �Է¹޴� ���� ���� ���ڰ��� �� ���� substring�� ���� ������ ���ڿ��� ���� �κ��� �����Ѵ�.
			// �ι�° �Է¹޴� ���� ���� ������ ���ڿ��� �� �κ��� �����ϴ� �Ѵ�.
			// beginindex ��ġ���� �����Ͽ� endindex �ٷ� �� ��ġ������ ���� �����Ѵ�.
			System.out.printf("%s[%s]",
					k07_sNumVal.substring(k07_i, k07_i+1),	// �� ���� ¥�� �͵��� �����ش�. ��, ���⼭�� k07_i�������� k07_i���� �� ���� �����Ѵ�. ���� ��� 1�� �־��� ��� '��'�� ������ �� �ְԵȴ�.
					k07_units[Integer.parseInt(k07_sNumVal.substring(k07_i, k07_i+1))]); // ���ڸ� int������ �ٲٱ� ���� Integer.parseInt�� ����ߴ�.
																		 // ��, ¥�� ���ڵ��� ��ġ������ �ٲ� ���� �� ���ڵ��� k07_units �迭���� ����ϵ��� �Ͽ���.
			if(k07_sNumVal.substring(k07_i, k07_i+1).equals("0")) {     // k07_sNumVal���� ¥�� ���ڰ� 0�� ���ٸ� ��, (1001034567)���� 0�κа� �������ٸ�
	
																	// k07_unitX�� "��" �̰ų� "��" �̸�
				if(k07_unitX.equals("��") || k07_unitX[k07_j].equals("��")) {    // �ش� �ڸ��� 0�̸� ������ �ٿ��ش�. 
					k07_sNumVoice = k07_sNumVoice + "" + k07_unitX[k07_j];		    // ���� �ٿ��� ���� k07_sNumVoice�� �������ش�.
				} else {
					// �ƹ����� ����
				}
			}else {															// �� ��° if���� �ƴ϶��(¥�� ���ڰ� 0�� �ƴ϶��)
				k07_sNumVoice = k07_sNumVoice										// sNumVoice�� ¥�� ���ڿ� �´� ������ �������ش�. 
						+ k07_units[Integer.parseInt(k07_sNumVal.substring(k07_i, k07_i+1))]
						+ k07_unitX[k07_j];
			}
			k07_i++; k07_j--;				// k07_i�� 1�� �����ϵ��� �ϰ� k07_j�� 1�� �����ϵ��� �Ͽ���.
		}
	System.out.printf("\n %s[%s]\n", k07_sNumVal, k07_sNumVoice);	// ������ �������� k07_sNumVal�� sNumVoie�� ���� �������� ����ϱ� ���� %s�� ������־���.
}
	
}


