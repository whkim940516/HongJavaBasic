package Receipt2_Practice;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Receipt2_Practice {

	public static void main(String[] args) {

		String[] itemName = {"퓨어에어 비말차단용마스크(최고급형)", "슬라이드식명찰(가로형)(100호)", "매직흡착 인테리어후크(알루미늄타입)"};
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
		
		SimpleDateFormat sd1 = new SimpleDateFormat("MM월dd일");
		SimpleDateFormat sd2 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		
		System.out.printf("");
	}

}
