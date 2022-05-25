package VariableandMethod2;

// 변수는 클래스에서 전역으로 사용하는 static으로 선언(값이 계속 유지)
// 변수를 메소드 내에 선언하여 매개변수로 전달하고 리턴받는 형태로 사용

public class VariableandMethod2 {
	
	static int iStatic;   // 클래스내 전역변수 static에 주의
	
	public static void add(int i) {
		iStatic++;
		i++;
		System.out.printf("add메소드에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("add메소드에서 -> i=[%d]\n", i);
	}
	
	public static int add2(int i) {
		iStatic++;
		i++;
		System.out.printf("add메소드에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("add메소드에서 -> i=[%d]\n", i);
		return i;
	}
	
	public static void main(String[] args) {
	
		int iMain;		// main에서만 통하는 지역변수
		
		iMain = 1;
		iStatic = 1;
		
		System.out.printf("***************************************\n");
		System.out.printf("메소드 호출 전 메인에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("메소드 호출 전 메인에서 -> iMain=[%d]\n", iMain);
		System.out.printf("***************************************\n");
		
		add(iMain);
		
		System.out.printf("***************************************\n");
		System.out.printf("메소드 호출 전 메인에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("메소드 호출 전 메인에서 -> iMain=[%d]\n", iMain);
		System.out.printf("***************************************\n");
		
		
		iMain = add2(iMain);
		
		System.out.printf("***************************************\n");
		System.out.printf("메소드 add2 호출 후 메인에서 -> iStatic=[%d]\n", iStatic);
		System.out.printf("메소드 add2 호출 후 메인에서 -> iMain=[%d]\n", iMain);
		System.out.printf("***************************************\n");
		
	}

}
