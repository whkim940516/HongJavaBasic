// 원표시(\)와 함께 사용되는 특별한 경우를 생각할 것

package SpecialCharEx;

public class SpecialCharEx {

	public static void main(String[] args) {

		System.out.println('\'');    		 // ''' 처럼 할수 없다.
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워진다.
		System.out.println('\n'); 			 // 개형(new line)문자 출력하고 개행
		System.out.println("\"Hello\""); 	 // 큰 따옴표를 출력하려면 이렇게 한다.
		System.out.println("c:\\");
	}

}
