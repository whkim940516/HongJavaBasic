package Receipt2;

import java.text.DecimalFormat;// �ݾ׿� �޸��� ��� ���� ���̺귯�� Ŭ����
import java.text.SimpleDateFormat;// ���� �ð� ��� ����� �����ϱ� ���� ���̺귯�� Ŭ����
import java.util.Calendar;// ��¥�� �ð��� ��� ���� ���̺귯�� Ŭ����
import java.util.Date;// ���� ��¥�� �ð��� ��� ���� ���̺귯�� Ŭ����

public class Receipt2 {

	public static void main(String[] args) {
		// ������ ���(2)
		String[] itemName = { "ǻ��� �����ܿ븶��ũ(�ְ����)", "�����̵�ĸ���(������)(100ȣ)", "�������� ���׸�����ũ(�˷�̴�Ÿ��)" };
		String[] itemCode = { "1031615", "1008152", "1020800" };
		int[] price = { 3000, 1000, 1000 };
		int[] amount = { 1, 1, 1 };
		
		double taxRate = 0.1;//double���� k34_taxRate�� �����ϰ� 0.1�� �ʱ�ȭ�Ѵ�. (���� = 10%)
		
		int totalPrice = 0; // �� �ݾ��� ������ ���� k34_totalPrice�� �����Ѵ�.
		for (int i = 0; i < itemName.length; i++) {// �� �ݾ��� ���ϱ� ���� �ݺ���
			totalPrice += price[i] * amount[i];
		}
		
		int netPrice = (int) (totalPrice / (1 + taxRate));// ���� �ݾ� ����� ���� int�� ���� k34_netPrice�� �����ϰ� �� �ݾ��� 1 + ������ ���� ���� �����Ѵ�.
		int tax = totalPrice - netPrice;// ���� ����� ���� int�� ���� k34_tax�� �����ϰ� �� �ݾ׿��� ���� �ݾ��� �� ���� �����Ѵ�.
		
		// ��� �� �ݾ׿� ���ڸ����� �޸��� ��� ���� DecimalFormat Ŭ������ �����´�.
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");// DecimalFormat Ŭ������ ����ϱ� ���� ��ü�� �����ϰ� ����� �������ش�.
				
		// ���� �ð��� ����ϱ� ���� Calendar Ŭ������ �����´�.
		Calendar cal = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
		cal.setTime(new Date());// ���� ��¥�� ���Ѵ�.
		SimpleDateFormat sd1 = new SimpleDateFormat("MM��dd��");// ��ȯ/ȯ�� ��¥�� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.
		SimpleDateFormat sd2 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// ���� �ð��� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.	
	
		System.out.printf("              \"���ΰ���, ���̼�\"\n");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������, ��ȣ�� 213-81-52063\n");
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (����\n��)\n");
		System.out.printf("================================================\n");
		System.out.printf("         �Һ����߽ɰ濵 (CCM) �������\n");
		System.out.printf("        ISO 9001 ǰ���濵�ý��� �������\n");
		System.out.printf("================================================\n");
		cal.add(Calendar.DATE, + 14);// ��ȯ/ȯ���� 14�� �̳��� �����ϹǷ� + 14�� ���ش�.
		System.out.printf("         ��ȯ/ȯ�� 14��(%s)�̳�,\n", sd1.format(cal.getTime()));
		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n");
		System.out.printf("       ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("         üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.printf("================================================\n");
		cal.setTime(new Date());// ���� ��¥�� �ٽ� �����Ѵ�.
		System.out.printf("[POS 1058231]                %s\n", sd2.format(cal.getTime()));
		System.out.printf("================================================\n");
		
		
		for (int i = 0; i < itemName.length; i++) {// ǰ���� ���� ���� ����ϱ� ���� �ݺ���
			printItemName(itemName[i]);
			System.out.printf("%9s%4s%9s\n", df.format(price[i]), amount[i], df.format(price[i] * amount[i]));
			System.out.printf("[%s]\n", itemCode[i]);
		}
		

		System.out.printf("%18s%26s\n", "�����հ�", df.format(netPrice));
		System.out.printf("%19s%26s\n", "�ΰ���", df.format(tax));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("�Ǹ��հ�%40s\n", df.format(totalPrice));
		System.out.printf("================================================\n");
		System.out.printf("�ſ�ī��%40s\n", df.format(totalPrice));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("�츮ī��                       538720**********\n");
		System.out.printf("���ι�ȣ 77982840(%26s\n", "���αݾ� " + df.format(totalPrice));
		System.out.printf("================================================\n");
		System.out.printf("%28s �д缭����\n", sd2.format(cal.getTime()));// ���� �ð��� ����Ѵ�.
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("             2112820610158231\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf(" �� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n  ȸ������ �� �پ��� ������ ����������! ��\n");
		}


	public static void printItemName(String s) {// ������ �̸��� ���̸� ���� ���� �Լ�
		int byte1 = 0;
		char[] str1 = s.toCharArray();// ������ �̸��� �ѱ��ھ� �߶� char�迭 k34_str�� �ִ´�.
		
		for (int i = 0; i < str1.length; i++) {// ������ �̸��� ����Ʈ�� ���� ���� �ݺ���
			if (str1[i] >= 'A' && str1[i] <= 'z') {// k34_str�迭 k34_i��° �ε����� ���� �����̸�
				byte1++;// ����� 1ĭ�� �����ϹǷ� 1�� ���Ѵ�.
			} else if (str1[i] >= '\uAC00' && str1[i] <= '\uD7A3') {// k34_str�迭 k34_i��° �ε����� ���� �ѱ��̸� (�����ڵ�� ����)
				byte1 += 2;// �ѱ��� 2ĭ�� �����ϹǷ� 2�� ���Ѵ�.
			} else {
				byte1++;// �� �� ���⳪ Ư�����ڶ�� 1�� ���Ѵ�.
			}
			if (byte1 > 26) {// ���� ����Ʈ ���� 26���� ũ��
				if (str1[i] >= '\uAC00' && str1[i] <= '\uD7A3')// �μ� ������ ���ڰ� �ѱ��̶��
					System.out.printf(" ");// �ѱ� ��� ������ ����ϰ�
				break;// for������ ����������.
			}
			System.out.printf("%s", str1[i]);
			if (byte1 == 26) {// ���� ����Ʈ ���� 26�̶��
				break;// for������ ����������.
			}
		}
		for (int j = byte1; j < 26; j++) {// ���ڼ��� ���� �������� ������ ����ϱ� ���� �ݺ���
														   // k34_j�� k34_byte(����Ʈ ��)���� �����ϰ�, k34_j�� 26���� ���� �� �ݺ��Ǹ�, ���๮�� ������ k34_j�� 1�� ���Ѵ�.
			System.out.printf(" ");
		}
	}
}