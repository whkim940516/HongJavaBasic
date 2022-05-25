package Calendar;

public class Calendar {

	public static void main(String[] args) {

		int k07_iWeekday = 5;				// int 형태로 변수명은 iWeekday로 하여 첫번째 날을 설정하였다.
		int [] k07_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// 각 월의 마지막 날을 iEnd를 변수명으로 하여 배열을 만들어 주었다.
		
		// 기본 헤더 부분, 월 출력
		for(int k07_iMonth = 0; k07_iMonth < 12; k07_iMonth++) {		// iMonth는 0부터 11까지 1씩 증가한다.
			System.out.printf("\n\n  %16d월\n", k07_iMonth+1);			// index이기 때문에 +1을 해서 0~11 => 1~12 월로 출력될 수 있게 하였다.
			System.out.printf("======================================\n");
			System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n", "일", "월", "화", "수", "목", "금", "토");  // 문자열이기 떄문에 %s를 사용하였고 간격을 주기위해 서식사이에 숫자 4를 넣어서 
																									   // %4s를 적어주었다.
		// 각 월의 공백 부분	
		for(int k07_blankindex = 0; k07_blankindex < k07_iWeekday; k07_blankindex++) {   // 맨 처음 시작이 금요일이기 때문에 금요일 전까지 부분은 공백이 출력되도록 하였다.
			System.out.printf("%5s", "");	  							 // 공백이 5간격으로 출력되도록 하였다.(공백도 문자열이기 떄문에 %s를 사용하였다.)
		}
		
		// 일자 출력
		for(int k07_iDay = 1; k07_iDay <= k07_iEnd[k07_iMonth]; k07_iDay++, k07_iWeekday++) {	// 1일 부터 각 월의 마지막 일까지 iDay와 iWeekday는 1씩 증가한다.
			if(k07_iWeekday % 7  == 6) {									// iWeekday를 7로 나누었을 때 6이 나온다는 것은 첫번째 날이 토요일임을 의미하고
				System.out.printf("%5d\n", k07_iDay);						// 토요일마다 줄 바꿈을 해주기 위해서 \n을 사용하였다.또한 간격은 5를 주었다.
				k07_iWeekday = k07_iWeekday - 7;							// 다음 월들이 원활히 출력되도록 하기 위해 초기화를 해준다. 이 코드가 없을 경우 1월 다음의 월들은 원활히 출력되지 않는다.
			} else {														// 첫번째 날이 토요일이 아닐 경우
				System.out.printf("%5s", k07_iDay);							// 간격은 5로 하여 '나머지 일'들이 출력되도록 한다.
			}		
		}		
	}																							  
  }										
}												

