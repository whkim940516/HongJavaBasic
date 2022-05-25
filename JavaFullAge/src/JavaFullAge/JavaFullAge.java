package JavaFullAge;

import java.text.SimpleDateFormat;  // ��¥ �� �ð��� ��� ������ ������ �� ����Ѵ�.
import java.util.Date;
import java.util.Scanner;

public class JavaFullAge {

	public static void main(String[] args) {

		// ������ ���
		/*
		 * "-"�� ������ �ֹε�Ϲ�ȣ 13�ڸ�
		 * 8��° �ڸ��� 0�Ǵ� 9�� ���, 1800���� ���
		 * 1�Ǵ� 2�� ��� 1900���� ���
		 * 3�Ǵ� 4�� ��� 2000���� ��� 
		 */
		
		/*��¥ �ð� �޾ƿ��� => ��ǻ�� �ý����� ��¥�� �ý����� ��� ���� Date�� ���

				SimpleDateFormat? => ��¥ �� �ð��� ��� ������ ������ �� ����մϴ�.

				SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

				2019�� 8�� 28�Ϸ� ��µǴ� ���� �ƴ� 20190828�� ����ϱ� ���� yyyyMMdd�� �Է��մϴ�.

				String today = format.format(new Date());�� �Է��� �� Sysout���� today�� ����ϸ�

				���� ��¥�� 20190828�� ��µ˴ϴ�.*/

		System.out.println("'-'�� ������ �ֹε�Ϲ�ȣ�� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		int manAge = 0;
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String today = format.format(new Date());
		System.out.println("���� ��¥ Ȯ�� : " + today);
		
		// substring�� Ȱ���� ���� �������� ����
		// String => int�� ����ȯ
		int thisYear = Integer.parseInt(today.substring(0, 4));
		int thisMonth = Integer.parseInt(today.substring(4, 6));
		int thisDay = Integer.parseInt(today.substring(6, 8));
//		System.out.println(thisYear + "" + thisMonth + "" + thisDay);
		
//		// �ֹε�ϻ��� ������ ����
//		// String => int�� ����ȯ
//		// ���� ����� ���� int�� ����ȯ �Ѵ�.
		int juminYear = Integer.parseInt(jumin.substring(0,2));
		int juminMonth = Integer.parseInt(jumin.substring(2,4));
		int juminDay = Integer.parseInt(jumin.substring(4,6));
//		System.out.println(juminYear+""+juminMonth+""+juminDay);
	

		/*8��° �ڸ��� 0�Ǵ� 9�� ���, 1800���� ���
		  1�Ǵ� 2�� ��� 1900���� ���
		  3�Ǵ� 4�� ��� 2000���� ���*/
		
		// ex) �ֹε�Ϲ�ȣ 111111-1111111
		//                     1        ��ġ�� ��ȯ�ϱ����� charAt(7)�� ���
		if(jumin.charAt(7) == '0' || jumin.charAt(7) == '9') {
			juminYear = 1800 + juminYear;
		} else if(jumin.charAt(7) == '1' || jumin.charAt(7) == '2') {
			juminYear = 1900 + juminYear;
		} else if(jumin.charAt(7) == '3' || jumin.charAt(7) == '4') {
			juminYear = 2000 + juminYear;
		}
		
		/* �� ����
		 * ���� ���� - �¾ ��
		 */
		
		manAge = thisYear - juminYear;
		System.out.println("��� �� ����: " + manAge);
		/* ��������� "��"�� �����°�?
		 * ��������� "��"�� �����°�?
		 */
		
		if(juminMonth > thisMonth) {
			manAge = manAge-1;
			System.out.println("�� ���� ��� ��� : " + manAge);
		}else if(juminMonth == thisMonth) {
			if(juminDay > thisDay) {
				manAge = manAge-1;
				System.out.println("�� ���� ��� ��� : " + manAge--);
		}else {
			System.out.println("�� ���� ��� ��� : " + manAge);
		}
		
	}else {
		System.out.println("�� ���� ��� ��� : " + manAge);
	}

  }
}