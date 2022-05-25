package Receipt;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ǰ�� 30���� ����
		String[] itemname = { "�˵�����Ĩ240g", "���ݸ� ������ġ ��Ŷ 135g", "����Ĩ��Ű Ŭ���� 150g", "ī��Ÿ�� 2���� 460G(20��)",
				"�絵���� ���� 4~7��/�� (1.5kg)", "��ټ� 2L", "�Ŷ�� 120gx5��", "��ȣ��(��)", "���캺���� 6��(210g*6)",
				"������ �ᳪ�� 300g", "���̺� ������ 7~11��/�� (2.1kg����)", "���� Ŭ���� ���� 900ml (1A���)(��������)",
				"A)�ĸӽ��� �����(��)", "�̸��� 20kg", "Dole ����Ƽ�� �ٳ��� 1.3kg����", "������� 1000ml ��100%",
				"ũ��� ���� 150g", "���� ���� �ٸ� �� �����̽� 200g", "���̰���κ���� 300g", "[�õ�] ���� ������� (600g)",
				"���� �����߳� �߲�ġ 800g", "���ݸ� ������ġ ��Ŷ 135g", "����ũ ���� Ŭ���� �׸����Ʈ 450g",
				"������ ���׺�� ���߹���丶�� 550g/��", "���� (1.8kg/��)", "����ձ���1.12kg", "���Խ��񿣳� 550g",
				"��귣�� �̱��� ������ 300g", "��ȣ �λ� ��� 300g", "�轼���� ��ī���γ���510g", "Avante" };

		// ��ǰ �ݾ� 30�� ��� �����Ͽ���
		int[] price = { 4980, 2980, 1480, 6980, 14900, 980, 3680, 1580, 6986, 1280, 10900, 2080, 1984, 49900, 5480,
				2710, 1580, 4980, 1280, 9980, 12980, 2980, 4280, 5900, 3980, 9980, 5380, 4480, 2180, 8980, 30000000 };

		// ��ǰ ������ ���Ƿ� �����Ͽ���
		int[] num = { 1, 2, 3, 4, 3, 2, 5, 7, 8, 1, 3, 2, 5, 6, 3, 2, 3, 4, 5, 6, 7, 8, 9, 5, 3, 2, 1, 2, 4, 2, 1 };
		
		// ��ǰ�� �鼼��ǰ�� �ش��ϴ��� ������ boolean�� ����Ͽ� �����Ͽ���
		boolean[] taxfree = { false, false, false, false, false, false, false, true, false, true, false, false,
				true, true, false, false, false, false, false, false, false, false, false, true, true, false, false,
				false, false, false, false };
		
		int[] itemprice; // ���ǰ��� ���ϴ� �迭�� k17_itemprice�� ������־���
		itemprice = new int[31]; // k17_itemprice ��� �迭�� ũ�⸦ 31���� �ϰ� �ʱ�ȭ
		for (int i = 0; i < itemname.length; i++) {
			itemprice[i] = price[i] * num[i];
			// for���� �̿��Ͽ� k17_itemprice �ݾ��� ���Ͽ���
		}
		 int totalPrice = 0; // ���� k17_totalPrice�� 0���� �ʱ�ȭ���־���
		 for (int i = 0; i < itemname.length; i++) { // �迭�� ũ�⸸ŭ for���� ������־��� �� �ݾ��� �����ֱ� ���Ͽ�  			 
			 totalPrice += price[i] * num[i];    // �� ��ǰ �ݾ׿� ������ ���� ��ǰ�� �� �ݾ��� �����־���
		 } totalPrice = (totalPrice+9) / 10 * 10;  				// ��ǰ�� �� �ݾ׿� 9�� ���� �� 10�� �������ְ� 10�� �ٽ� �����־� �ø��� ���־���
		 int taxFreePriceSum = 0; // �鼼 ������ 0���� �ʱ�ȭ���־���
		 for (int i = 0; i < itemname.length; i++) {	// �迭�� ũ�⸸ŭ for���� ������־���.
			  if (taxfree[i] == true) { 						// ���� ������ taxfree�迭�� true�϶��� false�϶��� Ȯ���Ͽ� ���� �ݾ��� �����־���
				  taxFreePriceSum += price[i] * num[i];
		 } else {
         }
      }
		   int afterTaxPriceSum = totalPrice - taxFreePriceSum; // ���տ��� �鼼���� ���־� ������ǰ�� �ΰ����� ������ �ݾ��� �����־���.
		   double taxRate = 0.1; // ������ 0.1�� �����Ͽ� �־���
		   int beforeTaxPriceSum = (int) (afterTaxPriceSum / (1 + taxRate)); // ������ǰ�� ������ ������ǰ�� �ΰ����� ������ �ݾ���
		   																			// ���� 1.1�� ������ �־� ������ ó���Ͽ� �����־���.
		   int tax = afterTaxPriceSum - beforeTaxPriceSum; // �ΰ����� afterTaxpriceSum�� ������ǰ ������ ���־� �����־���.

		for(int i = 0; i < itemname.length; i++) {  	// �迭�� ũ�⸸ŭ for���� ����� �־���.		
			   String newitemName = "";								// ���ο� ��ǰ�� ������ �ʱ�ȭ�Ͽ� �����Ͽ��־���.
		         if (itemname[i].getBytes().length > 15) {		// getBytes().length ��ɾ�� ��ǰ���� ����Ʈ���̸� ���� 15 �̻�,�����϶��� ��������.
		            int byteCount = 0; 								// k17_byteCount��� ������ ����� 0���� �ʱ�ȭ�Ͽ��־���.
		            for(char characteritemName: itemname[i].toString().toCharArray()){ 
		            	// ��ǰ���� �� ���̸�ŭ ���ư��� for���� ����� �־���.
		               byteCount += String.valueOf(characteritemName).getBytes().length;
		                // k17_byteCount��� ������ �� char ����Ʈ�� ���� ��� �����־���.
		               if(byteCount > 15) 
		                  break;  // k17_byteCount�� 15 �̻��� �Ǹ� �����ǵ��� �����Ͽ���.
		               newitemName += characteritemName; // k17_newitemName�̶�� ������ 15���ϸ�ŭ �Ǵ� char�� ���ʷ� �����־���.
		               itemname[i] = newitemName;
		               }
		         } else {
		     
		         }
		         if(itemname[i].getBytes().length < 15) { // ������ for���� ���ư� �� 15����Ʈ���� ���� k17_itemname�� ���������� �����Ͽ� 
		        	 													// if���� �������.
		        	 while (itemname[i].getBytes().length < 15) { // byte�� ���̰� 15���� �������� ��� " "�� �߰��ǵ��� �����Ͽ���.
		        		 itemname[i] += " ";
		        	 }
		         }			 
		}
		System.out.printf("              �̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("    emart     206-86-50913 ����\n");
		System.out.printf("              ���� ������ ������� 552\n\n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n\n");
		Calendar calendar = Calendar.getInstance(); 					//k17_calender�� ��¥������ �����ϰ� �������.
		SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // ��¥�� ������ "YYYY-MM-dd HH:mm"�� �����Ͽ���.
		DecimalFormat format = new DecimalFormat("###,###,###,###,###");  // ���� ����°���� ','�� ����ֱ� ���� DecimalFormat�� ����� �������־���.
		System.out.printf("[�� ��]%s     POS:0011-9861\n", date.format(calendar.getTime())); // ��¥�� ���� �������� �Է��Ͽ��־���.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%10.8s     %7s%3s%6s\n", "�� ǰ ��", "�� ��", "����", "�� ��"); // ��ǰ��, �ܰ�, ����, �ݾ��� �Է��Ͽ���.
		System.out.printf("-----------------------------------------\n");
		for (int i = 0; i < itemname.length; i++) { 	// ��ǰ�� ������ŭ ���ư��� for���� ����� �־���.
			if (taxfree[i]) {					// �鼼��ǰ�� Ȯ���ϱ� ���� k17_taxfree�迭���� true�ϰ��� false�� ��츦 �������־���.
				System.out.printf("* ");				// �鼼��ǰ true�� ��� "* " �� ����ֵ��� �����Ͽ���
			} else {
				System.out.printf("  ");				// �鼼��ǰ�� false�� ��� "  "�� ����ֵ��� �����Ͽ���.
			}
			System.out.printf("%8s%10s%3s %10s\n", itemname[i], format.format(price[i]),
					num[i], format.format(itemprice[i]));		// ��ǰ��8ĭ, �ݾ� 10ĭ, ���� 3ĭ, ��ǰ�� �� ���� 10ĭ���� �����Ͽ�
																					// ����°������ ','�� ����ָ� ��µǵ��� �Ͽ���.
			if((i +1) % 5 == 0 ) {									// 5�� ��ǰ�� ��µɶ����� ���еǵ��� "---"�� 5��°���� ����ϵ��� �Ͽ���
				System.out.printf("-----------------------------------------\n");
			}
		}
		System.out.printf("\n");
		System.out.printf("                %7s   %10s\n", "�� ǰ�� ����", format.format(itemname.length));	// �� ǰ�� ������ �迭�� ������ ����Ͽ���
		System.out.printf("             %7s   %10s\n","(*)��  ��  ��ǰ", format.format(taxFreePriceSum)); // ���� ���Ͽ��� �鼼��ǰ���� ����Ͽ���.
		System.out.printf("                %7s   %10s\n", "��  ��  ��ǰ", format.format(beforeTaxPriceSum)); // ���� ���Ͽ��� ���� ��ǰ���� ����Ͽ���
		System.out.printf("                %7s   %10s\n", "��   ��   ��", format.format(tax));				// ������ ���� �ΰ����� ����Ͽ���
		System.out.printf("                %7s   %10s\n", "��        ��",
				format.format(totalPrice));// ������ ���� �� �ݾ��� ����Ͽ� �־���
		System.out.printf("�� �� �� �� �� ��\n"); 
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012 KEB �ϳ�       541707**0484/35860658\n");
		System.out.printf("ī�����(IC)          %5s %10s\n", "�Ͻú� /", format.format(totalPrice)); //ī������������� �� �ݾ��� ����Ͽ� �־���																						// �����־�
		System.out.printf("-----------------------------------------\n"); 
		System.out.printf("\t   [�ż�������Ʈ ����]\n");
		System.out.printf("��*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		int point = 5473; // ���� ������ �ִ� ����Ʈ�� 5473���� �����Ͽ���.
		int pointsum = point + (totalPrice/1000); //����Ʈ �� ���� ��������Ʈ + �̹��� �߻��� ����Ʈ�� �����Ͽ���. 
													  // ���� �߻��� ����Ʈ�� ���� ��� �Ѿ׿� 1000�� �������־� �Է��Ͽ���
		System.out.printf("��ȸ�߻�����Ʈ         9350**9995  %5s\n",format.format(totalPrice/1000)); // ���Ϲ߻� ����Ʈ�� ����Ͽ���.
		System.out.printf("����(����)����Ʈ         %5s(   %5s)\n",format.format(pointsum),format.format(point)); // ��������Ʈ�� ���� ����Ʈ�� ����Ͽ���
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   ���űݾױ��� ���������ð� �ڵ��ο�\n");
		System.out.printf("%-5s:\t\t         34��****\n", "������ȣ"); // ������ȣ�� ���Ƿ� �����Ͽ���.
		String today = null;				// ���������ð��� Ȯ���ϱ� ���� today��� ������ null�� �ʱ�ȭ�Ͽ���.
		Date date1 = new Date();				
		SimpleDateFormat carTime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");	// �����ð��� ���� ��¥ ������ "YYYY-MM-dd HH:mm:ss"�� �����Ͽ���
		Calendar cal = Calendar.getInstance();			// 
		cal.setTime(date1);
		cal.add(Calendar.HOUR, -2);
		cal.add(Calendar.MINUTE, -3);
		cal.add(Calendar.SECOND, -4);
		today = carTime.format(cal.getTime());
		System.out.printf("%-5s:\t      %s\n", "�����ð�", today); // �����ð��� setTime�� ����Ͽ� 2�ð� 3�� 4�������� �����Ͽ���
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ĳ��:084599 ��00                     1150\n");
		System.out.printf("            lilililililiililil\n");
		SimpleDateFormat day = new SimpleDateFormat("YYYYMMdd"); // ������ ���ڵ� �Ʒ� ùĭ�� ��¥�̱⶧���� ��¥�� ����ϱ� ���Ͽ� 
																	 // YYYYMMdd�� �������� ��¥�� �����Ͽ���.
		String Stringtotalprice = Integer.toString(totalPrice); // ����°ĭ�� �� �ݾ��� 8�ڸ��� ����ϴ� ĭ�̱� ������ �� �ݾ���
																		// ���ڿ� �������� �����Ͽ���.
		if (totalPrice >= 0 && totalPrice < 10) {				// 8�ڸ��� �ƴ� ��� �տ������� 0�� ä��� ������ ���� �����Ͽ���.
			Stringtotalprice = "0000000" + Stringtotalprice;	// 1���ڸ��ݾ��� ��������� 0�� 7�� ���̰� �����Ͽ���
	      } else if (totalPrice >= 10 && totalPrice < 100) {	// 10���ڸ��ݾ��� ��������� 0�� 6�� ���̰� �����Ͽ���
	    	  Stringtotalprice = "000000" + Stringtotalprice;
	      } else if (totalPrice >= 100 && totalPrice < 1000) {	// 100���ڸ��ݾ��� ��������� 0�� 5�� ���̰� �����Ͽ���
	    	  Stringtotalprice = "00000" + Stringtotalprice;
	      } else if (totalPrice >= 1000 && totalPrice < 10000) {	// 1000���ڸ��ݾ��� ��������� 0�� 4�� ���̰� �����Ͽ���
	    	  Stringtotalprice = "0000" + Stringtotalprice;
	      } else if (totalPrice >= 10000 && totalPrice < 100000) {	// 10000���ڸ��ݾ��� ��������� 0�� 3�� ���̰� �����Ͽ���
	    	  Stringtotalprice = "000" + Stringtotalprice;
	      } else if (totalPrice >= 100000 && totalPrice < 1000000) {	// 100000���ڸ��ݾ��� ��������� 0�� 2�� ���̰� �����Ͽ���
	    	  Stringtotalprice = "00" + Stringtotalprice;
	      } else if (totalPrice >= 1000000 && totalPrice < 10000000) {	// 1000000���ڸ��ݾ��� ��������� 0�� 1�� ���̰� �����Ͽ���
	    	  Stringtotalprice = "0" + Stringtotalprice;
	      } else {
	      }
		System.out.printf("       %s/00119861/%s/31", day.format(calendar.getTime()),Stringtotalprice); // ù°�� ����° ĭ�� ���� ������ ���ڿ��� �Է��Ͽ���.
	}
	

}
