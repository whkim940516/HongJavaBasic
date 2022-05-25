package MethodOverLoading2;

import MethodOverLoading1.MethodOverLoading1;

public class MethodOverLoading2 {

	public static void main(String[] args) {

		MethodOverLoading1 k07_cc = new MethodOverLoading1();	// MethodOverLoading1 클래스를 받아서 객체 k07_cc를 생성하였다.
		
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k07_cc.k07_sum(1, 2));		 // 객체 k07_cc의 k07_sum에 인자 1,2를 넣고 결과를 출력하였다.
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k07_cc.k07_sum(1, 2, 3));		 // 객체 k07_cc의 k07_sum에 인자 1,2,3을 넣고 결과를 출력하였다.
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k07_cc.k07_sum(1, 2, 3, 4));	 // 객체 k07_cc의 k07_sum에 인자 1,2,3,4를 넣고 결과를 출력하였다.	
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k07_cc.k07_sum(1.3, 2.4));	 // 객체 k07_cc의 k07_sum에 인자 1.3과 2.4를 넣고 결과를 출력하였다.
																				 // 실수형이기 떄문에 %f서식을 사용하였다.
	}

}
