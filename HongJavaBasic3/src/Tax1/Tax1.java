// �ɽ��ѵ� �Լ� �ѹ� ����� ����?
//���� main�� ���ִ� public static void�� �貸����
//�ϴ� public�� �� Ŭ���� Tax1�ۿ����� ����� �� �ִٴ� �ǹ��ε�
//������ main�� ���� Ŭ���� ���̶� �������
//static�� �ڸ��� �����ϰ� .. �θ��� new�� �θ��°� �ƴ϶�� ��..
//void�� ��ȯ���� ���ٴ� �ǹ� ������ �츮�� ���ݰ� int�� ��ȯ�Ѵ�.abstract

// ������ ���� ���� �Ⱥ����� 1���̸� �ݾ��� ����� ������ 1�� �� ���� ��
// �Լ�, integer-double�������� �÷�����, ����ȯ �� �����ϱ�

package Tax1;

// static�� �ڸ��� �����ϰ� �θ� �� new�� �θ��°� �ƴϴ� !!!
// void�� ��ȯ���� ���ٴ� �ǹ������� �츮�� ���� �� int�� ��ȯ�Ѵ�. !!

public class Tax1 {
	
	public static int netprice(int k07_price, double k07_rate) {
		return (int)(k07_price/(1+k07_rate));  // ���������� k07_price ��, �Һ��� ������ 1+����(1 + k07_rate)�� ���� ���̴�.  
	}
	
	public static void main(String[] args) {
		int k07_price = 1234; // ��ǰ�� ���������� 1234���̸� �ش� ������ k07_price�� ���� int ���·� �����Ͽ���.
		double k07_tax_rate = 0.1; // ������ 0.1�̸� �ش� ������ k07_tax_rate�� ���� double ���·� �����Ͽ���.
		
		int k07_netprice = netprice(k07_price, k07_tax_rate);  // ���� �Լ��� �����Ͽ� ���� ���� k07_netprice ������ �������־����� int ���·� �����Ͽ���.
		int k07_tax = k07_price - k07_netprice;  			   // k07_price(�Һ��� ����) - k07_netprice(��������)�� ������ָ� ������ ������ �̸� 
															   // k07_tax�� ���� int ���·� �������־���.
		System.out.printf("**************************************\n");
		System.out.printf("*    �Һ��ڰ�,  ��������, ���� ���         *\n");
		System.out.printf("�Һ��ڰ���: %d, ��������: %d, ����: %d\n", k07_price, k07_netprice, k07_tax);  // �Һ��ڰ���, ��������, ���� ��� %d�� ����� �������·� ������־���.
		System.out.printf("**************************************\n");
	}

}
