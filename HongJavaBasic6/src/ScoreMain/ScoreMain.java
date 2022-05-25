package ScoreMain;

import Score1.Score1;

public class ScoreMain {

	public static void main(String[] args) {

		String k07_name = "폴리융";	// 

		Score1 k07_mainscore = new Score1();	// Score1 클래스를 받아서 mainscore 객체를 생성하였다.
		
		System.out.println("3월 성적표");		
		System.out.println("=================================================");		
		System.out.printf("%s%6s%4s%4s%4s%4s\n", "이름", "국어", "영어", "수학", "총점", "평균");	// 구간 6개로 나눠 각 항목들이 들어갈 수 있도록 하였으며 문자열이기 때문에 %s 서식을 사용하였다.
		System.out.println("=================================================");
		System.out.printf("%s%5d%6d%6d%6d%5.0f\n\n", k07_name,100, 100, 100, 		// 문자열 %s 정수 %d 실수 %f 서식을 각 항목에 맞게 사용하였고
				k07_mainscore.k07_sum(100, 100, 100), (k07_mainscore.k07_ave(100, 100, 100)));		// k07_mainscore 객체의 sum함수와 ave함수에 각 인자를 넣어 값을 출력할 수 있도록 하였다. 
		
		System.out.println("4월 성적표");																										
		System.out.println("=================================================");
		System.out.printf("%s%6s%4s%4s%4s%4s%4s\n", "이름", "국어", "영어", "수학", "과학", "총점", "평균");	// 구간 6개로 나눠 각 항목들이 들어갈 수 있도록 하였으며 문자열이기 때문에 %s 서식을 사용하였다.
		System.out.println("=================================================");
		System.out.printf("%s%5d%6d%6d%6d%5d%7.1f\n\n", k07_name, 100, 100, 100, 100,					// 문자열 %s 정수 %d 실수 %f 서식을 각 항목에 맞게 사용하였고 소수점이 이하 첫번째 자리만 출력하도록 %7.1f를 사용하였다.
				k07_mainscore.k07_sum(100, 100, 100, 100), (k07_mainscore.k07_ave(100, 100, 100, 100)));				// k07_mainscore 객체의 sum함수와 ave함수에 각 인자를 넣어 값을 출력할 수 있도록 하였다. 
		
		System.out.println("5월 성적표");
		System.out.println("=================================================");
		System.out.printf("%s%6s%4s%4s%4s%4s%4s%4s\n", "이름", "국어", "영어", "수학", "과학", "사회", "총점", "평균");
		System.out.println("=================================================");
		System.out.printf("%s%5d%6d%6d%6d%6d%5d%7.1f\n", k07_name, 100, 100, 100, 100, 100,					// 구간 6개로 나눠 각 항목들이 들어갈 수 있도록 하였으며 문자열이기 때문에 %s 서식을 사용하였다.
				k07_mainscore.k07_sum(100, 100, 100, 100, 100), (k07_mainscore.k07_ave(100, 100, 100, 100, 100)));			// k07_mainscore 객체의 sum함수와 ave함수에 각 인자를 넣어 값을 출력할 수 있도록 하였다. 
	}
}