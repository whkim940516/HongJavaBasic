package ScannerEx;

import java.util.*;

public class ScannerEx {  // 클래스 선언

	public static void main(String[] args) {  // 메인으로부터 프로그램 시작

		Scanner scanner = new Scanner(System.in);  // 스캐너 생성, 웹에서는 거의 콘솔창에서 입력하지 않지만 연습을 위해 사용
		
		System.out.println("두 자리 정수를 하나 입력해주세요.>");  // 입력
		
		String input = scanner.nextLine();  // 입력받은 것을 문자열로 받음
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용:" + input);
		System.out.printf("num=%d\n", num);
	}

}
