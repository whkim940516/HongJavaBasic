package Receipt1;

import java.text.DecimalFormat;		// Decimalformat은 숫자의 Format을 변경할 수 있는 클래스이다.
import java.text.SimpleDateFormat;  // SimpleDateFormat 클래스는 날짜를 원하는 포맷으로 파싱시켜주는 역할을 한다.
import java.util.Date;				// java에서 현재시간을 알기 위해서는 Date 객체를 사용한다.

public class Receipt1 {
	public static void main(String[] args) {
		
		int k07_iPrice = 33000;   // int 형태로 하여 결제금액을 설정해주었다.
		
		DecimalFormat k07_Decimal = new DecimalFormat("###,###,###,###,###");  // 세자리마다 쉼표를 설정하도록 DecimalFormat 을 사용하여 객체를 생성해주었다. 
		Date k07_date = new Date();   	// Date와 관련된 객체를 생성하고 인스턴스를 생성하며 단위는 밀리세컨드이다.. => 연월시분초로 표현하는 객체와 인스턴스를 생성해주며  연월일시분초를 출력할 수 있다.
		SimpleDateFormat k07_simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  // 연월일시분초로 표현하는 객체를 생성하였으며 단위는 밀리세컨드이다. 연월일시분초 까지 출력한다. 
		SimpleDateFormat k07_simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd");			//  연월일시분초로 표현하는 객체를 생성하였으며 단위는 밀리세컨드이다. 연월일시까지 출력한다.
		
		System.out.printf("신용승인\n");											// 신용승인 문자를 출력하였다.
		System.out.printf("단말기  :  2N68665898 %21s\n", "전표번호 :  041218\n");	// 단말기와 전표번호를 출력하였다.
		System.out.printf("가맹점   :  한양김치찌개\n");								// 가맹점의 명칭을 출력하였다.
		System.out.printf("주소     : 경기 성남시 분당구 황새울로351번길 10,\n1층\n");	// 주소를 출력하였다.
		System.out.printf("대표자   :  유창선\n");									// 대표자 명을 출력하였다.
		System.out.printf("사업자  :  752-53-00558 %20s\n", "TEL : 7055695\n");	// 사업자 번호와 전화번호를 출력하였다.
		System.out.println("---------------------------------------------");	
		System.out.printf("금액%36s원\n", k07_Decimal.format(k07_iPrice / 1.1));			// 물품의 가격을 출력하였다.
		System.out.printf("부가세%34s원\n", k07_Decimal.format((k07_iPrice - (k07_iPrice / 1.1))));	// 부가세를 출력하였다.(전체가격 - 물품의가격)
		System.out.printf("합계%36s원\n", k07_Decimal.format(k07_iPrice));						// 물품가격과 부가세를 합한 가격을 출력하였다.
		System.out.println("---------------------------------------------");
		System.out.println("우리카드");											// 결제한 카드사를 출력하였다.
		System.out.printf("카드번호 : 5387-20**-****-4613(S) %7s\n", "일시불");		// 결제한 카드번호와 결제방식을 출력하였다.
		System.out.printf("거래일시 : %s\n", k07_simpleDateFormat.format(k07_date));		// simpleDateFormat의 date함수를 통해 현재시간을 출력하였다.
		System.out.println("승인번호 : 70404427");									// 승인번호를 출력하였다.
		System.out.println("거래번호 : 357734873739");								// 거래번호를 출력하였다.
		System.out.printf("매입 : 비씨카드사%25s\n", "가맹 : 720068568");				// 매입한 카드사와 가맹 번호를 출력하였다.
		System.out.println("알림 : EDC매출표");									// 매출표를 출력하였다.
		System.out.println("문의 : TEL)1544-4700");								// 문의번호를 출력하였다.
		System.out.println("---------------------------------------------");
		System.out.println("               * 감사합니다 *");						// 마무리 인사말을 출력하였다.
		System.out.printf("%34s%8s\n", "표준V2. 08.", k07_simpleDateFormat2.format(k07_date));	// 표준번호를 출력하고 simpleDateFormat2의 date함수를 사용해 오늘날짜를 출력하였다.
	}
}