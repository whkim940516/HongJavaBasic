// 프로그램 구현시 두번째 줄 같이 
// [String str = name + 8.0;] 이렇게 사용하다가간 귓방망이 날라감
// [String str = name + "8.0";] 이렇게 명확하게 써라. 에러나고 안나고가 중요한게 아님

package StringEx;

public class StringEx {
	public static void main(String[] args) {
		
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");   // 더하고 난 값이 문자열로 변한다
		System.out.println("" + 7 + 7);   // 문자열상태에서 7과 7을 붙이기 때문에 77이 나온다.
	}

}
