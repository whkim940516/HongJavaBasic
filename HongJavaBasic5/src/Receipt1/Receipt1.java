package Receipt1;

import java.text.DecimalFormat;		// Decimalformat�� ������ Format�� ������ �� �ִ� Ŭ�����̴�.
import java.text.SimpleDateFormat;  // SimpleDateFormat Ŭ������ ��¥�� ���ϴ� �������� �Ľ̽����ִ� ������ �Ѵ�.
import java.util.Date;				// java���� ����ð��� �˱� ���ؼ��� Date ��ü�� ����Ѵ�.

public class Receipt1 {
	public static void main(String[] args) {
		
		int k07_iPrice = 33000;   // int ���·� �Ͽ� �����ݾ��� �������־���.
		
		DecimalFormat k07_Decimal = new DecimalFormat("###,###,###,###,###");  // ���ڸ����� ��ǥ�� �����ϵ��� DecimalFormat �� ����Ͽ� ��ü�� �������־���. 
		Date k07_date = new Date();   	// Date�� ���õ� ��ü�� �����ϰ� �ν��Ͻ��� �����ϸ� ������ �и��������̴�.. => �����ú��ʷ� ǥ���ϴ� ��ü�� �ν��Ͻ��� �������ָ�  �����Ͻú��ʸ� ����� �� �ִ�.
		SimpleDateFormat k07_simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  // �����Ͻú��ʷ� ǥ���ϴ� ��ü�� �����Ͽ����� ������ �и��������̴�. �����Ͻú��� ���� ����Ѵ�. 
		SimpleDateFormat k07_simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd");			//  �����Ͻú��ʷ� ǥ���ϴ� ��ü�� �����Ͽ����� ������ �и��������̴�. �����Ͻñ��� ����Ѵ�.
		
		System.out.printf("�ſ����\n");											// �ſ���� ���ڸ� ����Ͽ���.
		System.out.printf("�ܸ���  :  2N68665898 %21s\n", "��ǥ��ȣ :  041218\n");	// �ܸ���� ��ǥ��ȣ�� ����Ͽ���.
		System.out.printf("������   :  �Ѿ��ġ�\n");								// �������� ��Ī�� ����Ͽ���.
		System.out.printf("�ּ�     : ��� ������ �д籸 Ȳ�����351���� 10,\n1��\n");	// �ּҸ� ����Ͽ���.
		System.out.printf("��ǥ��   :  ��â��\n");									// ��ǥ�� ���� ����Ͽ���.
		System.out.printf("�����  :  752-53-00558 %20s\n", "TEL : 7055695\n");	// ����� ��ȣ�� ��ȭ��ȣ�� ����Ͽ���.
		System.out.println("---------------------------------------------");	
		System.out.printf("�ݾ�%36s��\n", k07_Decimal.format(k07_iPrice / 1.1));			// ��ǰ�� ������ ����Ͽ���.
		System.out.printf("�ΰ���%34s��\n", k07_Decimal.format((k07_iPrice - (k07_iPrice / 1.1))));	// �ΰ����� ����Ͽ���.(��ü���� - ��ǰ�ǰ���)
		System.out.printf("�հ�%36s��\n", k07_Decimal.format(k07_iPrice));						// ��ǰ���ݰ� �ΰ����� ���� ������ ����Ͽ���.
		System.out.println("---------------------------------------------");
		System.out.println("�츮ī��");											// ������ ī��縦 ����Ͽ���.
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S) %7s\n", "�Ͻú�");		// ������ ī���ȣ�� ��������� ����Ͽ���.
		System.out.printf("�ŷ��Ͻ� : %s\n", k07_simpleDateFormat.format(k07_date));		// simpleDateFormat�� date�Լ��� ���� ����ð��� ����Ͽ���.
		System.out.println("���ι�ȣ : 70404427");									// ���ι�ȣ�� ����Ͽ���.
		System.out.println("�ŷ���ȣ : 357734873739");								// �ŷ���ȣ�� ����Ͽ���.
		System.out.printf("���� : ��ī���%25s\n", "���� : 720068568");				// ������ ī���� ���� ��ȣ�� ����Ͽ���.
		System.out.println("�˸� : EDC����ǥ");									// ����ǥ�� ����Ͽ���.
		System.out.println("���� : TEL)1544-4700");								// ���ǹ�ȣ�� ����Ͽ���.
		System.out.println("---------------------------------------------");
		System.out.println("               * �����մϴ� *");						// ������ �λ縻�� ����Ͽ���.
		System.out.printf("%34s%8s\n", "ǥ��V2. 08.", k07_simpleDateFormat2.format(k07_date));	// ǥ�ع�ȣ�� ����ϰ� simpleDateFormat2�� date�Լ��� ����� ���ó�¥�� ����Ͽ���.
	}
}