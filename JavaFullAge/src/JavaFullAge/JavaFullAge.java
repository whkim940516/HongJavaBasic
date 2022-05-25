package JavaFullAge;

import java.text.SimpleDateFormat;  // 날짜 및 시간의 출력 서식을 지정할 때 사용한다.
import java.util.Date;
import java.util.Scanner;

public class JavaFullAge {

	public static void main(String[] args) {

		// 만나이 계산
		/*
		 * "-"를 포함한 주민등록번호 13자리
		 * 8번째 자리가 0또는 9의 경우, 1800년대생 출생
		 * 1또는 2의 경우 1900년대생 출생
		 * 3또는 4의 경우 2000년대생 출생 
		 */
		
		/*날짜 시간 받아오기 => 컴퓨터 시스템의 날짜와 시스템을 얻기 위해 Date를 사용

				SimpleDateFormat? => 날짜 및 시간의 출력 서식을 지정할 때 사용합니다.

				SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

				2019년 8월 28일로 출력되는 것이 아닌 20190828로 출력하기 위해 yyyyMMdd로 입력합니다.

				String today = format.format(new Date());을 입력한 뒤 Sysout으로 today를 출력하면

				오늘 날짜가 20190828로 출력됩니다.*/

		System.out.println("'-'를 포함한 주민등록번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		int manAge = 0;
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String today = format.format(new Date());
		System.out.println("오늘 날짜 확인 : " + today);
		
		// substring을 활용해 현재 연월일을 구분
		// String => int로 형변환
		int thisYear = Integer.parseInt(today.substring(0, 4));
		int thisMonth = Integer.parseInt(today.substring(4, 6));
		int thisDay = Integer.parseInt(today.substring(6, 8));
//		System.out.println(thisYear + "" + thisMonth + "" + thisDay);
		
//		// 주민등록상의 연월일 구분
//		// String => int로 형변환
//		// 숫자 계산을 위해 int로 형변환 한다.
		int juminYear = Integer.parseInt(jumin.substring(0,2));
		int juminMonth = Integer.parseInt(jumin.substring(2,4));
		int juminDay = Integer.parseInt(jumin.substring(4,6));
//		System.out.println(juminYear+""+juminMonth+""+juminDay);
	

		/*8번째 자리가 0또는 9의 경우, 1800년대생 출생
		  1또는 2의 경우 1900년대생 출생
		  3또는 4의 경우 2000년대생 출생*/
		
		// ex) 주민등록번호 111111-1111111
		//                     1        위치를 반환하기위해 charAt(7)을 사용
		if(jumin.charAt(7) == '0' || jumin.charAt(7) == '9') {
			juminYear = 1800 + juminYear;
		} else if(jumin.charAt(7) == '1' || jumin.charAt(7) == '2') {
			juminYear = 1900 + juminYear;
		} else if(jumin.charAt(7) == '3' || jumin.charAt(7) == '4') {
			juminYear = 2000 + juminYear;
		}
		
		/* 만 나이
		 * 현재 연도 - 태어난 해
		 */
		
		manAge = thisYear - juminYear;
		System.out.println("계산 전 예측: " + manAge);
		/* 생년월일의 "월"이 지났는가?
		 * 생년월일의 "일"이 지났는가?
		 */
		
		if(juminMonth > thisMonth) {
			manAge = manAge-1;
			System.out.println("만 나이 계산 결과 : " + manAge);
		}else if(juminMonth == thisMonth) {
			if(juminDay > thisDay) {
				manAge = manAge-1;
				System.out.println("만 나이 계산 결과 : " + manAge--);
		}else {
			System.out.println("만 나이 계산 결과 : " + manAge);
		}
		
	}else {
		System.out.println("만 나이 계산 결과 : " + manAge);
	}

  }
}