// 배열도 나오고, 몇개 나오는데 일단 따라해보고 찾아보고 해본다. 그리고 기억하라.
// 나중에 이런 방법으로도 쓰는구나

package Tax2;

// 5강 실습에 많이 나올 예정이니 확실히 익혀두기 !
// 소비자가격 세금 계산

public class Tax2 {

	public static void main(String[] args) {

		String [] k07_item = {"맛동산", "웨하스", "롯데센드", "오땅", "사브레"};    // 변수명은 k07_item이며 String 형태인 가변 배열을 선언하고 다음과 같은 과자들을 넣어준다.
		int [] k07_price = {1000, 2000, 3000, 2500, 1450}; 					// 변수명은 k07_price이며 int 형태인 가변 배열을 선언하고 항목에 맞게 가격을 적어준다. 
		int [] k07_amount = {10, 2, 1, 3, 5};   							// 변수명은 k07_amount이며 int 형태인 가변 배열을 선언하고 항목에 맞게 개수를 적어준다.
		double k07_tax_rate = 0.1;											// 변수명은 k07_tax_rate이며 double 형태로 0.1 값을 가지도록하고 해당 변수를 선언해준다.				
		int k07_total_sum = 0;   											// 변수명은 k07_total_sum으로 하여 누적을 처리하기 위한 변수를 초기화 해준다.
		
		// 출력부
		System.out.printf("*****************************************************\n");
		System.out.printf("                    너가 지른 과자들                \n");
		System.out.printf(" 항 목           단 가           수 량             합 계  \n");
		
		for(int k07_i=0; k07_i < k07_item.length; k07_i++) { 		 // int 형태로 k07_i는 0부터 시작하며 k07_item.length 즉, 5까지 반복하며 1씩 증가한다. 등호가 없으므로 4까지 반복할 것이다. 
			int k07_sum = k07_price[k07_i]*k07_amount[k07_i];		 // 위에 언급된 배열에 들어가있는 값들인 k07_price[index]와 k07_amount[index]가 곱해져 k07_sum 변수에 대입되며 int 형태로 선언된다.
			k07_total_sum = k07_total_sum + k07_sum;				 // 누적 합을 알기 위해서 k07_total_sum에 k07_sum이 더해지며 그 값을 다시 k07_total_sum에 대입한다.(int형태이다.)
			System.out.printf("%-12s\t%-12d\t%-12d\t%-12d\n", k07_item[k07_i], k07_price[k07_i], k07_amount[k07_i], k07_sum);   // 칸에 맞게 항목은 문자열 형태이므로 %s
		}																												 // 나머지인 단가, 수량, 합계는 정수 형태이므로 %d 로 출력한다.
		System.out.printf("*****************************************************\n");
		System.out.printf(" 지불 금액 :   %-40d\n", k07_total_sum);    // 소비자 가격인 k07_total_sum을 정수 형태로 출력한다.
		
		int k07_total_net_price = (int)(k07_total_sum/(1+k07_tax_rate));     // 과세금액은 소비자 가격 합계를 1+세율(1 + k07_tax_rate)로 나눈 것이며 변수명은 k07_total_net_price이며 int 형태로 선언한다.
		System.out.printf(" 과세 금액 :   %-40d\n", k07_total_net_price);      // 변수명은 k07_total_net_price이며 int 형태로 선언하고 이를 과세 금액으로 한다.
		int k07_tax = k07_total_sum - k07_total_net_price;		// 세금 계산   // 소비자 가격 합계인 k07_total_sum 에서 과세금액 k07_total_net_price를 빼면 최종 세금을 알 수 있으며 
		System.out.printf("  세  금  :   %-40d\n", k07_tax);					 // 변수명은 k07_tax로 하며 형태는 int 이다.
	}
}
