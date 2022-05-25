package Receipt;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 제품명 30개를 설정
		String[] itemname = { "쫀득초코칩240g", "초콜릿 샌드위치 비스킷 135g", "초코칩쿠키 클래식 150g", "카스타드 2번들 460G(20입)",
				"당도선별 참외 4~7입/봉 (1.5kg)", "삼다수 2L", "신라면 120gx5입", "애호박(개)", "새우볶음밥 6입(210g*6)",
				"국산콩 콩나물 300g", "네이블 오렌지 7~11입/봉 (2.1kg내외)", "에이 클래스 우유 900ml (1A등급)(매일유업)",
				"A)파머스픽 흙대파(봉)", "이맛쌀 20kg", "Dole 스위티오 바나나 1.3kg내외", "서울우유 1000ml 나100%",
				"크라비 맛살 150g", "훈제 오리 다리 살 슬라이스 200g", "콩이가득두부찌개용 300g", "[냉동] 양지 샤브샤브 (600g)",
				"숯불 데리야끼 닭꼬치 800g", "초콜릿 샌드위치 비스킷 135g", "피코크 에이 클래스 그릭요거트 450g",
				"더달콤 스테비아 대추방울토마토 550g/팩", "양파 (1.8kg/망)", "비비고왕교자1.12kg", "한입쏙쏙비엔나 550g",
				"노브랜드 쫄깃한 베이컨 300g", "삼호 부산어묵 골드 300g", "잭슨피자 시카고볼로네제510g", "Avante" };

		// 제품 금액 30개 모두 지정하였다
		int[] price = { 4980, 2980, 1480, 6980, 14900, 980, 3680, 1580, 6986, 1280, 10900, 2080, 1984, 49900, 5480,
				2710, 1580, 4980, 1280, 9980, 12980, 2980, 4280, 5900, 3980, 9980, 5380, 4480, 2180, 8980, 30000000 };

		// 제품 수량을 임의로 지정하였다
		int[] num = { 1, 2, 3, 4, 3, 2, 5, 7, 8, 1, 3, 2, 5, 6, 3, 2, 3, 4, 5, 6, 7, 8, 9, 5, 3, 2, 1, 2, 4, 2, 1 };
		
		// 제품의 면세물품에 해당하는지 유무를 boolean을 사용하여 설정하였다
		boolean[] taxfree = { false, false, false, false, false, false, false, true, false, true, false, false,
				true, true, false, false, false, false, false, false, false, false, false, true, true, false, false,
				false, false, false, false };
		
		int[] itemprice; // 물건값을 구하는 배열을 k17_itemprice로 만들어주었다
		itemprice = new int[31]; // k17_itemprice 라는 배열의 크기를 31으로 하고 초기화
		for (int i = 0; i < itemname.length; i++) {
			itemprice[i] = price[i] * num[i];
			// for문을 이용하여 k17_itemprice 금액을 구하였다
		}
		 int totalPrice = 0; // 총합 k17_totalPrice을 0으로 초기화해주었다
		 for (int i = 0; i < itemname.length; i++) { // 배열의 크기만큼 for문을 만들어주었고 총 금액을 구해주기 위하여  			 
			 totalPrice += price[i] * num[i];    // 각 제품 금액에 수량을 곱해 제품의 총 금액을 구해주었다
		 } totalPrice = (totalPrice+9) / 10 * 10;  				// 제품의 총 금액에 9를 더한 후 10을 나누어주고 10을 다시 곱해주어 올림을 해주었다
		 int taxFreePriceSum = 0; // 면세 가격을 0으로 초기화해주었다
		 for (int i = 0; i < itemname.length; i++) {	// 배열의 크기만큼 for문을 만들어주었다.
			  if (taxfree[i] == true) { 						// 위에 설정한 taxfree배열이 true일때와 false일때를 확인하여 각각 금액을 구해주었다
				  taxFreePriceSum += price[i] * num[i];
		 } else {
         }
      }
		   int afterTaxPriceSum = totalPrice - taxFreePriceSum; // 총합에서 면세가를 빼주어 과세물품에 부가세가 더해진 금액을 구해주었다.
		   double taxRate = 0.1; // 세율을 0.1로 설정하여 주었다
		   int beforeTaxPriceSum = (int) (afterTaxPriceSum / (1 + taxRate)); // 과세물품의 가격을 과세물품에 부가세가 더해진 금액을
		   																			// 세율 1.1로 나누어 주어 정수형 처리하여 구해주었다.
		   int tax = afterTaxPriceSum - beforeTaxPriceSum; // 부가세를 afterTaxpriceSum에 과세물품 가격을 뺴주어 구해주었다.

		for(int i = 0; i < itemname.length; i++) {  	// 배열의 크기만큼 for문을 만들어 주었다.		
			   String newitemName = "";								// 새로운 제품명 변수를 초기화하여 선언하여주었다.
		         if (itemname[i].getBytes().length > 15) {		// getBytes().length 명령어로 제품명의 바이트길이를 구해 15 이상,이하일때로 나누었다.
		            int byteCount = 0; 								// k17_byteCount라는 변수를 만들어 0으로 초기화하여주었다.
		            for(char characteritemName: itemname[i].toString().toCharArray()){ 
		            	// 제품명의 각 길이만큼 돌아가는 for문을 만들어 주었다.
		               byteCount += String.valueOf(characteritemName).getBytes().length;
		                // k17_byteCount라는 변수에 각 char 바이트를 구해 계속 더해주었다.
		               if(byteCount > 15) 
		                  break;  // k17_byteCount가 15 이상이 되면 정지되도록 설정하였다.
		               newitemName += characteritemName; // k17_newitemName이라는 변수에 15이하만큼 되는 char를 차례로 더해주었다.
		               itemname[i] = newitemName;
		               }
		         } else {
		     
		         }
		         if(itemname[i].getBytes().length < 15) { // 이전의 for문이 돌아간 후 15바이트보다 작은 k17_itemname이 생겼을때를 가정하여 
		        	 													// if문을 만들었다.
		        	 while (itemname[i].getBytes().length < 15) { // byte의 길이가 15보다 작을때는 계속 " "가 추가되도록 설정하였다.
		        		 itemname[i] += " ";
		        	 }
		         }			 
		}
		System.out.printf("              이마트 죽전점 (031)888-1234\n");
		System.out.printf("    emart     206-86-50913 강희석\n");
		System.out.printf("              용인 수지구 포은대로 552\n\n");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n");
		Calendar calendar = Calendar.getInstance(); 					//k17_calender로 날짜생성이 가능하게 만들었다.
		SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // 날짜의 형식을 "YYYY-MM-dd HH:mm"로 설정하였다.
		DecimalFormat format = new DecimalFormat("###,###,###,###,###");  // 숫자 세번째마다 ','를 찍어주기 위해 DecimalFormat을 만들어 설정해주었다.
		System.out.printf("[구 매]%s     POS:0011-9861\n", date.format(calendar.getTime())); // 날짜를 위의 형식으로 입력하여주었다.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%10.8s     %7s%3s%6s\n", "상 품 명", "단 가", "수량", "금 액"); // 상품명, 단가, 수량, 금액을 입력하였다.
		System.out.printf("-----------------------------------------\n");
		for (int i = 0; i < itemname.length; i++) { 	// 제품의 개수만큼 돌아가는 for문을 만들어 주었다.
			if (taxfree[i]) {					// 면세물품을 확인하기 위해 k17_taxfree배열에서 true일경우와 false일 경우를 나누어주었다.
				System.out.printf("* ");				// 면세물품 true일 경우 "* " 를 찍어주도록 설정하였다
			} else {
				System.out.printf("  ");				// 면세물품이 false일 경우 "  "를 찍어주도록 설정하였다.
			}
			System.out.printf("%8s%10s%3s %10s\n", itemname[i], format.format(price[i]),
					num[i], format.format(itemprice[i]));		// 제품명8칸, 금액 10칸, 수량 3칸, 제품당 총 가격 10칸으로 설정하여
																					// 세번째수마다 ','를 찍어주며 출력되도록 하였다.
			if((i +1) % 5 == 0 ) {									// 5개 제품이 출력될때마다 구분되도록 "---"를 5번째마다 출력하도록 하였다
				System.out.printf("-----------------------------------------\n");
			}
		}
		System.out.printf("\n");
		System.out.printf("                %7s   %10s\n", "총 품목 수량", format.format(itemname.length));	// 총 품목 수량은 배열의 개수로 출력하였다
		System.out.printf("             %7s   %10s\n","(*)면  세  물품", format.format(taxFreePriceSum)); // 위에 구하였던 면세물품가를 출력하였다.
		System.out.printf("                %7s   %10s\n", "과  세  물품", format.format(beforeTaxPriceSum)); // 위에 구하였던 과세 물품가를 출력하였다
		System.out.printf("                %7s   %10s\n", "부   가   세", format.format(tax));				// 위에서 구한 부가세를 출력하였다
		System.out.printf("                %7s   %10s\n", "합        계",
				format.format(totalPrice));// 위에서 구한 총 금액을 출력하여 주었다
		System.out.printf("결 제 대 상 금 액\n"); 
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012 KEB 하나       541707**0484/35860658\n");
		System.out.printf("카드결제(IC)          %5s %10s\n", "일시불 /", format.format(totalPrice)); //카드결제내역에도 총 금액을 출력하여 주었다																						// 나눠주어
		System.out.printf("-----------------------------------------\n"); 
		System.out.printf("\t   [신세계포인트 적립]\n");
		System.out.printf("백*우 고객님의 포인트 현황입니다.\n");
		int point = 5473; // 원래 가지고 있던 포인트를 5473으로 설정하였다.
		int pointsum = point + (totalPrice/1000); //포인트 총 합을 원래포인트 + 이번에 발생한 포인트로 설정하였다. 
													  // 금일 발생한 포인트는 금일 계산 총액에 1000을 나누어주어 입력하였다
		System.out.printf("금회발생포인트         9350**9995  %5s\n",format.format(totalPrice/1000)); // 금일발생 포인트를 출력하였다.
		System.out.printf("누계(가용)포인트         %5s(   %5s)\n",format.format(pointsum),format.format(point)); // 누적포인트와 원래 포인트를 출력하였다
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("%-5s:\t\t         34저****\n", "차량번호"); // 차량번호를 임의로 설정하였다.
		String today = null;				// 차량입차시간을 확인하기 위해 today라는 변수를 null로 초기화하였다.
		Date date1 = new Date();				
		SimpleDateFormat carTime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");	// 입차시간을 위한 날짜 형식을 "YYYY-MM-dd HH:mm:ss"로 설정하였다
		Calendar cal = Calendar.getInstance();			// 
		cal.setTime(date1);
		cal.add(Calendar.HOUR, -2);
		cal.add(Calendar.MINUTE, -3);
		cal.add(Calendar.SECOND, -4);
		today = carTime.format(cal.getTime());
		System.out.printf("%-5s:\t      %s\n", "입차시간", today); // 입차시간을 setTime을 사용하여 2시간 3분 4초전으로 설정하였다
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:084599 양00                     1150\n");
		System.out.printf("            lilililililiililil\n");
		SimpleDateFormat day = new SimpleDateFormat("YYYYMMdd"); // 마지막 바코드 아래 첫칸이 날짜이기때문에 날짜를 출력하기 위하여 
																	 // YYYYMMdd의 형식으로 날짜를 생성하였다.
		String Stringtotalprice = Integer.toString(totalPrice); // 세번째칸은 총 금액을 8자리로 출력하는 칸이기 때문에 총 금액을
																		// 문자열 형식으로 선언하였다.
		if (totalPrice >= 0 && totalPrice < 10) {				// 8자리가 아닐 경우 앞에서부터 0을 채우기 때문에 각각 설정하였다.
			Stringtotalprice = "0000000" + Stringtotalprice;	// 1의자리금액이 나왔을경우 0을 7개 붙이게 설정하였다
	      } else if (totalPrice >= 10 && totalPrice < 100) {	// 10의자리금액이 나왔을경우 0을 6개 붙이게 설정하였다
	    	  Stringtotalprice = "000000" + Stringtotalprice;
	      } else if (totalPrice >= 100 && totalPrice < 1000) {	// 100의자리금액이 나왔을경우 0을 5개 붙이게 설정하였다
	    	  Stringtotalprice = "00000" + Stringtotalprice;
	      } else if (totalPrice >= 1000 && totalPrice < 10000) {	// 1000의자리금액이 나왔을경우 0을 4개 붙이게 설정하였다
	    	  Stringtotalprice = "0000" + Stringtotalprice;
	      } else if (totalPrice >= 10000 && totalPrice < 100000) {	// 10000의자리금액이 나왔을경우 0을 3개 붙이게 설정하였다
	    	  Stringtotalprice = "000" + Stringtotalprice;
	      } else if (totalPrice >= 100000 && totalPrice < 1000000) {	// 100000의자리금액이 나왔을경우 0을 2개 붙이게 설정하였다
	    	  Stringtotalprice = "00" + Stringtotalprice;
	      } else if (totalPrice >= 1000000 && totalPrice < 10000000) {	// 1000000의자리금액이 나왔을경우 0을 1개 붙이게 설정하였다
	    	  Stringtotalprice = "0" + Stringtotalprice;
	      } else {
	      }
		System.out.printf("       %s/00119861/%s/31", day.format(calendar.getTime()),Stringtotalprice); // 첫째와 세번째 칸에 위에 설정한 문자열을 입력하였다.
	}
	

}
