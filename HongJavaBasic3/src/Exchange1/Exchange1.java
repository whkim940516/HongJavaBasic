// # 단순 환전 계산

package Exchange1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exchange1 {

	public static void main(String[] args) {
		
		int k07_MyWon = 1000000; // 나는 은행에서 100만원 주고 달러로 바꿔달라고 했다. 변수명은 k07_MyWon으로 형태는 int로 선언해주었다.
		double k07_MoneyEx = 1238.21;  // 달러 환율 변수명은 k07_MoneyEx로 하여 double형태로 선언해주었고 값은 1238.21이다.
		double k07_commision = 0.003;  // 환전 수수료 변수명은 k07_commission으로 하여 double 형태로 선언해주었고 값은 0.003이다.
		
		int k07_usd = (int) (k07_MyWon/k07_MoneyEx);  // 최종 결과를 정수형으로 만들면 버림 처리가 된다. 전체 금액인 k07_MyWon을 환율인 k07_MoneyEx로 나눠준 후 int로 씌워 소수점 이하 버림처리를 해주었고 
													  // 이를 k07_usd를 변수명으로 하여 int로 선언한 변수에 대입해주었다.
		int k07_remain = (int) (k07_MyWon-k07_usd*k07_MoneyEx); // 고객에게 돌려준 잔돈도 당연히 소숫점 이하의 금액은 삥땅해야한다. 실수로 계산 후 버림처리해준다.
												// 기존의 전체 금액인 k07_MyWon에서 달러 * 환율인(k07_usd * k07_MoneyEx)를 빼주었으며 이를 k07_remain을 변수명으로 하여 int로 선언해주었다.
												// 만일 2324.22원 이런식으로 나오면 0.22원은 삥땅처리한다.(줄 수도 없다)
		
		// 수수료 없이 계산 출력부
		System.out.printf("**********************************************\n");
		System.out.printf("*                수수료 없이 계산                *\n");
		System.out.printf("총 한화환전금액 : %d 원 => %d 달러, 잔돈: %d\n", k07_MyWon, k07_usd, k07_remain); // 총 한화환전금액, 달러 , 잔돈을 정수형태인 %d 를 사용하여 출력해주었다.
		
		System.out.printf("**********************************************\n");
		System.out.println();  // 너무 다닥다닥 안붙어있게 println을 통해 줄바꿈 해주었다.
		System.out.println();
		
		// 수수료 포함 환전 계산(1)
		
		double k07_ComPerOne = k07_MoneyEx * k07_commision;  // 환율인(k07_MoneyEx)와 수수료(k07_commision)를 곱하여 변수명 k07_ComperOne으로 형태는 double로 한 변수에 대입해주었으며 
															 // 의미는 1달러당 수수료(k07_ComPerOne)이다. 
		
		double k07_totalcom = k07_usd * k07_ComPerOne;		 // 위에서 계산한 1달러 당 수수료와 usd 달러를 곱하여 형태는 double 변수명은 k07_totalcom인 변수에 대입해주었으며 의미는 총 수수료이다.
		System.out.printf("***************************************************************\n");
		System.out.printf("*                         수수료 계산                            *\n");
		System.out.printf("총 수수료 : %f 원 => 미화: %d 달러, 달러당 수수료: %f원\n", k07_totalcom, k07_usd, k07_ComPerOne); // 총 수수료와 수수료는 실수 형태로 출력되야하므로 %f를 사용해주었고
		System.out.printf("***************************************************************\n");						 // 미화는 정수 형태로 출력되야하므로 %d를 사용해주었다.
		System.out.println();
		System.out.println();
		
		// 수수료 포함 환전 계산(2)
		
		// 은행은 수수료를 고려해서 달러를 바꿔줘야 한다.
		// 먼저 달러를 다 계산하고 수수료를 빼버리려면 어마어마한 오차가 생긴다.(수수료 0.003이 적은 돈이 아니다.)
		// 즉, (1달러 당 원화금액 + 1달러당 수수료)를 가지고 실수형 계산을 해야 한다.
		
		// 당연히 수수료는 받아야 할 돈이니 올림 처리
		
		int k07_i_totalcom;  // 변수명 k07_i_totalcom 형태는 int로 변수를 선언하였다.
		
		if (k07_totalcom != (double)((int)k07_totalcom))  // 소수점 없는 형태(k07_totalcom 변수)와 소수점 있는 형태((double)((int)k07_totalcom))가 다르다면 1원을 더해준다.
			k07_i_totalcom = (int)k07_totalcom + 1;  // ex) 0.5원 처리하기 애매하지만 버리기는 아까우니까 1을 올린다음에 삥땅을 쳐준다.  (은행이 손해를 보지 않도록 수수료 올림 처리 해준다.)
		else
			k07_i_totalcom = (int)k07_totalcom;      // 그렇지 않으면 그 값은 int가 씌워진 k07_totalcom 의 값 그대로 이다.
		
		System.out.printf("**************************************************************************\n");
		System.out.printf("*                              수수료 적용환전                               *\n");
		System.out.printf("총 수수료 : %d 원 => 미화: %d 달러, 달러당 수수료: %f원\n", k07_i_totalcom, k07_usd, k07_ComPerOne); // 총 수수료와 미화는 정수형태로 출력해야 하므로 %d
																													   // 달러당 수수료는 실수형태로 출력해야하므로 %f 서식을 사용하여 출력한다.
		k07_remain = (int) (k07_MyWon - k07_usd * k07_MoneyEx - k07_i_totalcom);
		System.out.printf("총 한화환전금액 : %d 원 => 미화: %d 달러, 수수료청구: %d원 잔돈: %d원\n", k07_MyWon, k07_usd, k07_i_totalcom, k07_remain);  // 총 한화 환전금액, 미화, 수수료청구, 잔돈 모두 정수형태
		System.out.printf("**************************************************************************\n");								   // 로 출력하도록 %d 서식을 사용한다.
		System.out.println();
		System.out.println();     // 잔돈이 -2233원이 나온 이유는 807달러를 바꿔줄때 돈이 모자라기 때문이다.
		
		// 콤마찍기
		
		//Decimal 클래스를 이용함(이클립스에서 자동으로 import 가져오기)
		
		DecimalFormat k07_df = new DecimalFormat( "###,###,###,###,###" );     // 해당 클래스 안에서 new를 통해 객체를 생성하며 3자리 마다 콤마를 찍는다는 의미로 ###, ### 와 같은 표현을 사용한다.
																			   // 영어이기 때문에 3자리씩 찍는다.
		System.out.printf("***********************************************************************\n");
		System.out.printf("*                           콤마찍기, 날짜 적용                           *\n");
		
		System.out.printf("총 수수료: %s원=> 미화:%s달러, 달러당 수수료: %f원\n", 	// 총 수수료와 미화는 String 형태로 출력해야하므로 %s, 달러당 수수료는 실수 형태로 출력해야하므로 %f 서식을 사용한다.
				k07_df.format(k07_i_totalcom),								// k07_df에 format을 태워서 수수료 포함 환전 계산인 k07_i_totalcom을 넣어준다.
				k07_df.format(k07_usd),										// k07_df에 format을 태워서 환전한 달러인 k07_usd를 넣어준다.
				k07_ComPerOne );											// 마지막으로 달러당 수수료인 k07_ComPerOne을 출력해준다.
		
		k07_remain = (int) (k07_MyWon - k07_usd * k07_MoneyEx - k07_i_totalcom);  //  총 한화 환전금액에서 미화와 환율을 곱한 금액을 빼주고 수수료 포함 환전 계산 금액을 빼준 후 int 형태로 만들어 준 후 
																				  //  k07_remain 변수로 선언해준다.
		System.out.printf("총 한화환전금액: %s원=> 미화: %s달러, 수수료청구:%s원, 잔돈: %s원\n",	// String 형태로 출력해야하므로 %s 서식을 사용하여 출력하도록 한다.
				k07_df.format(k07_MyWon), k07_df.format(k07_usd), k07_df.format(k07_i_totalcom), k07_df.format(k07_remain));    // 위와 같이 format을 태워서 해당값에 맞게 출력할 수 있게 해준다.
		
		// 현재 날짜, 시간 찍기
		
		// pc가 server한테 자원달라고 할때 .getInstance를 사용한다.
		// getInstance로 Calendar값을 가져온다.
		
		Calendar k07_calt = Calendar.getInstance();      // Calendar 라는 클래스에서 getInstance로 Calendar 값을 가져온다.
		SimpleDateFormat k07_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); //  연/월/일 시/분/초  를 출력하도록 한다.  대소문자 구분 유의하자 !!
		System.out.printf("최종실행시간: %s\n", k07_sdt.format(k07_calt.getTime()));  // format을 태운 후 k07_calt 즉 Calendar 값을 가져오도록 한다.이를 통해 찍는 순간의 시간을 가져올 수 있다.
		
		System.out.printf("***********************************************************************\n");
		
	}

}

