package VariableandMethod1;

// �Լ��� �޼���(method)��� ��Ī�Ѵ�.
// �ڱ� Ŭ���� �ȿ� �Լ��� �����ϸ� �Լ� �̸����θ� �ҷ��� �� �ִ�.

public class VariableandMethod1 {
	
	public static void k07_iamMethod() {				// iamMethod()��� �Լ�, �޼��带 �����Ͽ���.
		System.out.printf("�޼ҵ�� �ҷ����~~\n");
	}
	public static void main(String[] args) {		// ���� �Լ��̴�.

		VariableandMethod1.k07_iamMethod();				// �ش� Ŭ�������� .�� ���� iamMethod()�� ȣ���Ͽ���.
		k07_iamMethod();								// �ش� Ŭ���� ���� �ֱ� ������ �׳� iamMethod()�� ȣ���ص� ȣ���� �ȴ�.
	}

}
