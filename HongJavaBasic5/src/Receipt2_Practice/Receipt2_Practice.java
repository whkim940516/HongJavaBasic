package Receipt2_Practice;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Receipt2_Practice {

	public static void main(String[] args) {

		String[] itemName = {"ǻ��� �����ܿ븶��ũ(�ְ����)", "�����̵�ĸ���(������)(100ȣ)", "�������� ���׸�����ũ(�˷�̴�Ÿ��)"};
		String[] itemCode = {"1031615", "1008152", "1020800"};
		int[] price = {3000, 1000, 1000};
		int[] amount = {1, 1, 1};
		
		double taxRate = 0.1; 
		
		int totalPrice = 0;
		for(int i = 0; i < itemName.length; i++) {
			totalPrice += price[i] * amount[i];
		}
		
		int netPrice = (int) (totalPrice / (1 + taxRate));
		int tax = totalPrice - netPrice;
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		
		SimpleDateFormat sd1 = new SimpleDateFormat("MM��dd��");
		SimpleDateFormat sd2 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		
		System.out.printf("");
	}

}
