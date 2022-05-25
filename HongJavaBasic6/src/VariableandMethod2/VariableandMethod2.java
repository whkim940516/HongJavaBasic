package VariableandMethod2;

// ������ Ŭ�������� �������� ����ϴ� static���� ����(���� ��� ����)
// ������ �޼ҵ� ���� �����Ͽ� �Ű������� �����ϰ� ���Ϲ޴� ���·� ���

public class VariableandMethod2 {
	
	static int iStatic;   // Ŭ������ �������� static�� ����
	
	public static void add(int i) {
		iStatic++;
		i++;
		System.out.printf("add�޼ҵ忡�� -> iStatic=[%d]\n", iStatic);
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n", i);
	}
	
	public static int add2(int i) {
		iStatic++;
		i++;
		System.out.printf("add�޼ҵ忡�� -> iStatic=[%d]\n", iStatic);
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n", i);
		return i;
	}
	
	public static void main(String[] args) {
	
		int iMain;		// main������ ���ϴ� ��������
		
		iMain = 1;
		iStatic = 1;
		
		System.out.printf("***************************************\n");
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> iStatic=[%d]\n", iStatic);
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> iMain=[%d]\n", iMain);
		System.out.printf("***************************************\n");
		
		add(iMain);
		
		System.out.printf("***************************************\n");
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> iStatic=[%d]\n", iStatic);
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> iMain=[%d]\n", iMain);
		System.out.printf("***************************************\n");
		
		
		iMain = add2(iMain);
		
		System.out.printf("***************************************\n");
		System.out.printf("�޼ҵ� add2 ȣ�� �� ���ο��� -> iStatic=[%d]\n", iStatic);
		System.out.printf("�޼ҵ� add2 ȣ�� �� ���ο��� -> iMain=[%d]\n", iMain);
		System.out.printf("***************************************\n");
		
	}

}
