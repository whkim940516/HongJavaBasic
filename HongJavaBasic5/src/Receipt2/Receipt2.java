package Receipt2;

import java.text.DecimalFormat;// 금액에 콤마를 찍기 위한 라이브러리 클래스
import java.text.SimpleDateFormat;// 실행 시간 출력 양식을 지정하기 위한 라이브러리 클래스
import java.util.Calendar;// 날짜와 시간을 얻기 위한 라이브러리 클래스
import java.util.Date;// 현재 날짜와 시간을 얻기 위한 라이브러리 클래스

public class Receipt2 {

	public static void main(String[] args) {
		// 영수증 출력(2)
		String[] itemName = { "퓨어에어 비말차단용마스크(최고급형)", "슬라이드식명찰(가로형)(100호)", "매직흡착 인테리어후크(알루미늄타입)" };
		String[] itemCode = { "1031615", "1008152", "1020800" };
		int[] price = { 3000, 1000, 1000 };
		int[] amount = { 1, 1, 1 };
		
		double taxRate = 0.1;//double변수 k34_taxRate을 선언하고 0.1로 초기화한다. (세율 = 10%)
		
		int totalPrice = 0; // 총 금액을 저장할 변수 k34_totalPrice를 선언한다.
		for (int i = 0; i < itemName.length; i++) {// 총 금액을 구하기 위한 반복문
			totalPrice += price[i] * amount[i];
		}
		
		int netPrice = (int) (totalPrice / (1 + taxRate));// 세전 금액 계산을 위한 int형 변수 k34_netPrice를 선언하고 총 금액을 1 + 세율로 나눈 값을 대입한다.
		int tax = totalPrice - netPrice;// 세금 계산을 위한 int형 변수 k34_tax를 선언하고 총 금액에서 세전 금액을 뺀 값을 대입한다.
		
		// 출력 전 금액에 세자리마다 콤마를 찍기 위해 DecimalFormat 클래스를 가져온다.
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");// DecimalFormat 클래스를 사용하기 위해 객체를 생성하고 양식을 지정해준다.
				
		// 현재 시간을 출력하기 위해 Calendar 클래스를 가져온다.
		Calendar cal = Calendar.getInstance();// Calendar 클래스를 사용하기 위해 객체를 생성한다.
		cal.setTime(new Date());// 현재 날짜를 구한다.
		SimpleDateFormat sd1 = new SimpleDateFormat("MM월dd일");// 교환/환불 날짜를 양식대로 출력하기 위해 SimpleDateFormat클래스의 객체를 생성하고 양식을 지정한다.
		SimpleDateFormat sd2 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// 현재 시간을 양식대로 출력하기 위해 SimpleDateFormat클래스의 객체를 생성하고 양식을 지정한다.	
	
		System.out.printf("              \"국민가게, 다이소\"\n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부, 신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현\n동)\n");
		System.out.printf("================================================\n");
		System.out.printf("         소비자중심경영 (CCM) 인증기업\n");
		System.out.printf("        ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("================================================\n");
		cal.add(Calendar.DATE, + 14);// 교환/환불은 14일 이내로 가능하므로 + 14를 해준다.
		System.out.printf("         교환/환불 14일(%s)이내,\n", sd1.format(cal.getTime()));
		System.out.printf("(전자)영수증, 결제카드 지참 후 구입매장에서 가능\n");
		System.out.printf("       포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("         체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("================================================\n");
		cal.setTime(new Date());// 현재 날짜를 다시 세팅한다.
		System.out.printf("[POS 1058231]                %s\n", sd2.format(cal.getTime()));
		System.out.printf("================================================\n");
		
		
		for (int i = 0; i < itemName.length; i++) {// 품목명과 가격 등을 출력하기 위한 반복문
			printItemName(itemName[i]);
			System.out.printf("%9s%4s%9s\n", df.format(price[i]), amount[i], df.format(price[i] * amount[i]));
			System.out.printf("[%s]\n", itemCode[i]);
		}
		

		System.out.printf("%18s%26s\n", "과세합계", df.format(netPrice));
		System.out.printf("%19s%26s\n", "부가세", df.format(tax));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("판매합계%40s\n", df.format(totalPrice));
		System.out.printf("================================================\n");
		System.out.printf("신용카드%40s\n", df.format(totalPrice));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("우리카드                       538720**********\n");
		System.out.printf("승인번호 77982840(%26s\n", "승인금액 " + df.format(totalPrice));
		System.out.printf("================================================\n");
		System.out.printf("%28s 분당서현점\n", sd2.format(cal.getTime()));// 현재 시간을 출력한다.
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("             2112820610158231\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf(" ◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서\n  회원가입 후 다양한 혜택을 누려보세요! ◈\n");
		}


	public static void printItemName(String s) {// 아이템 이름의 길이를 세기 위한 함수
		int byte1 = 0;
		char[] str1 = s.toCharArray();// 아이템 이름을 한글자씩 잘라 char배열 k34_str에 넣는다.
		
		for (int i = 0; i < str1.length; i++) {// 아이템 이름의 바이트를 세기 위한 반복문
			if (str1[i] >= 'A' && str1[i] <= 'z') {// k34_str배열 k34_i번째 인덱스의 값이 영어이면
				byte1++;// 영어는 1칸을 차지하므로 1을 더한다.
			} else if (str1[i] >= '\uAC00' && str1[i] <= '\uD7A3') {// k34_str배열 k34_i번째 인덱스의 값이 한글이면 (유니코드로 정의)
				byte1 += 2;// 한글은 2칸을 차지하므로 2를 더한다.
			} else {
				byte1++;// 그 외 띄어쓰기나 특수문자라면 1을 더한다.
			}
			if (byte1 > 26) {// 만약 바이트 수가 26보다 크고
				if (str1[i] >= '\uAC00' && str1[i] <= '\uD7A3')// 인쇄 마지막 글자가 한글이라면
					System.out.printf(" ");// 한글 대신 공백을 출력하고
				break;// for문에서 빠져나간다.
			}
			System.out.printf("%s", str1[i]);
			if (byte1 == 26) {// 만약 바이트 수가 26이라면
				break;// for문에서 빠져나간다.
			}
		}
		for (int j = byte1; j < 26; j++) {// 글자수가 작은 아이템의 공백을 출력하기 위한 반복문
														   // k34_j는 k34_byte(바이트 수)부터 시작하고, k34_j가 26보다 작을 때 반복되며, 실행문이 끝나면 k34_j를 1씩 더한다.
			System.out.printf(" ");
		}
	}
}