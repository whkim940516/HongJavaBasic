package PrintInSpace;

// 일반적 리포트는 헤더 인쇄 후 내용을 인쇄
// 폰트가 칸이 맞아야 한다.
// printf("%1.1s", "a");
// printf("%1.1s", "가");
// 한글을 1s로 인식한다.(한글 한자당 -1을 해야한다.)

import java.text.DecimalFormat;

public class PrintInSpace {

	public static void main(String[] args) {

		String item = "사과";					// String형태로 변수명은 k07_item으로 하여 "사과"를 선언한다.
		int unit_price = 5000;				// int 형태로 변수명은 k07_unit_price로 하여 그 값은 5000으로 한다.
		int num = 500;						// int 형태로 변수명은 k07_num으로 하여 그 값은 500으로 한다.
		int total = 0;						// int 형태로 변수명은 k07_total로 하여 그 값은 0으로 한다.
		
		DecimalFormat df = new DecimalFormat( "###,###,###,###,###" );   
		/*자바에는 숫자의 Format을 변경할 수 있는 클래스를 제공한다. 숫자 3자리마다 , 를 붙인다던가, 
		  소숫점 몇자리 이하부터 0을 표시하던가 등을 DecimalFormat 클래스를 사용하여 Format을 변경 가능하다.*/
		
		// %20.20s 의미 : s는 데이터를 문자열로 출력하라는 것이며 만약 %-20.20s 처럼 %뒤에 -가 붙게 되면 왼쪽 정렬하라는 의미이다.
		//               그 뒤에 20은 최소 20개의 문자를 출력하라는 뜻으로 길이가 20 미만인 문자열은 공백으로 길이를 맞춘다.
		//				 그리고 .20은 최대 20 문자를 출력하라는 뜻으로 20문자가 넘으면 짤리게 된다.
		
		// 헤더 찍기
		System.out.printf("====================================================\n");   // 전체 칸 중에 20칸은 품목, 8칸은 단가, 8칸은 수량, 8칸은 합계가
		System.out.printf("%20.20s %8.8s %8.8s %8.8s\n","품목","단가","수량","합계");       // 차지하도록 한다.     
		System.out.printf("====================================================\n");

		// 값 찍기
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",								// 맨위에 언급된 변수들이 차례대로 출력되며	각각 20칸, 10칸, 10칸, 10칸을 차지한다.	
			item,df.format(unit_price),df.format(num),df.format(unit_price*num));		// "사과", 5000, 500, 5000*500 계산한것이 출력된다.
		System.out.printf("=====================================================\n");
	}
}
