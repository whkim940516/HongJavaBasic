package Basicif;

public class Basicif {

	public static void main(String[] args) {
		
		// 입력 받는 경우가 아니기 때문에 일단 변수 초기화를 해주었다.
		int k07_score = 0;  // k07_score 변수를 int 형태로 선언하였다.
		int k07_num = 0;	// k07_num 변수를 int 형태로 선언하였다.
		
		if(k07_score > 60) {					 // k07_score가 60 초과 일경우 
			System.out.println("합격입니다.");  	 // 합격입니다를 출력한다.
		}
		if(k07_score > 60) {
			System.out.println("합격입니다.");  	 // 코드가 위와 동일하다
		}
		if(k07_score < 60) {       				 // k07_score가 60 미만 일경우
			System.out.println("합격입니다.");  	 // 합격입니다를 출력한다.
		} else {
			System.out.println("불합격입니다."); 	 // 그렇지 않을 경우 불합격입니다를 출력한다.
		}
		
		if(k07_num > 0) {						 // k07_num이 0 초과 일경우
			System.out.println("양수입니다.");  	 // 양수입니다를 출력한다.
		} else if(k07_num < 0) {				 // k07_num이 0 미만일 경우
			System.out.println("음수입니다.");  	 // 음수입니다를 출력한다.
		} else {							 	 // 그렇지 않을 경우
			System.out.println("영입니다.");	 	 // 영입니다를 출력한다.
		}
		
		if(k07_score >= 90) {					 	  	// k07_score가 90 이상일 경우
			System.out.println("A등급");		 	 		// A등급을 출력한다.
		} else if(k07_score >= 80 && k07_score < 90) {  // k07_score가 80이상 90 미만일 경우
			System.out.println("B등급");					// B등급을 출력한다.
		} else if(k07_score >= 70 && k07_score < 80) { 	// k07_score가 70이상 80 미만일 경우
			System.out.println("C등급");					// C등급을 출력한다.
		} else {										// 그렇지 않을 경우
			System.out.println("F등급");			 		// F등급을 출력한다.
		}
	}

}
