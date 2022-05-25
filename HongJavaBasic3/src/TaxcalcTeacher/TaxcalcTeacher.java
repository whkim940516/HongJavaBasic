package TaxcalcTeacher;

public class TaxcalcTeacher {
	
	// k07_val����(��������)�� int�� ���� �ް� k07_rate ����(����)�� int�� ���� �����ϴ� ������ ����ϴ� �Լ��� �����Ѵ�.
	public static int taxcal(int k07_netprice, int k07_taxrate) {     // �������� 105, ���� 10
		int k07_tax;    	// int ������ k07_tax ������ �����Ͽ���.
		double k07_d_tax;   // double������ k07_d_tax ������ �����Ͽ���.
		
		k07_d_tax = k07_netprice * k07_taxrate/100.0; // d_tax -> 105 * 10/100 = 10.5     100.0�� ���ϸ� �ᱹ�� �Ҽ��� ���·� ������ �ȴ�.
		k07_tax = (int) k07_d_tax;   // k07_d_tax ���� 10.5���� (int)�� �����Ƿ� ����� 10�� ���� �ȴ�.
		
		if(k07_d_tax != (double)k07_tax) {  // k07_d_tax�� 10.5�̰� (double)k07_tax�� 10.0 �̹Ƿ�  10.5 == 10.0 
			k07_tax=k07_tax+1;				// k07_d_tax�� k07_tax�� ���� �ٸ� ���� 1�� �����ش�.  
		}  		 							// ��, �Ҽ����� �ִٸ� ������ 1�� �� �������� ���̴�.
		
		return k07_tax;   // return ������ k07_tax�� �ָ� tax���� ����ϴ� ���� �ȴ�.
	}

	public static void main(String[] args) {
		
		}

}
