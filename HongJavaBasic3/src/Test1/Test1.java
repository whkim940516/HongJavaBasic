// ★매우 중요
//문자로 선언한 것을 연산처리를 하려면 숫자형태로 바꿔서 하고
//숫자로 처리한 것을 문자열로 붙이려면 문자로 고친후 해라

package Test1;

public class Test1 {

	public static void main(String[] args) {

		String s = "12345";
		int i = Integer.parseInt(s);  // Integer.parseInt() : String을 int형으로 바꿔준다.
		
		System.out.printf("문자를 숫자로 %d  (%d)  \n", i, i+10);
		
		String a;
		a = String.format("%d", i);  // String을 불러서 int형으로 사용
		
		System.out.printf("숫자를 문자로 %s (%s) \n", a, a+ "abcde");   // 문자형 덧셈은 뒤로 붙어서 나온다.
	}

}
