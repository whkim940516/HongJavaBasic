package MethodOverLoading1;

// Ŭ���� �޼ҵ�� argument(�Ű�����) �����̳� ������ �ٸ��� �̸��� �����ϰ� ����Ͽ� ���ϰ� ����� �� �ִµ� 
// �̷��� ���� �޼ҵ� �����ε��̶��Ѵ�.

public class MethodOverLoading1 {	// ȣ���ϱ� ���� Ŭ������ ����� �־���.
	
	public int k07_sum(int a, int b) {	// ������ ���� a�� b�� �޾Ƽ� a+b�� ���ϵ� �� �ִ� int�� �޼��带 ������־���.
		return a + b;
	}
	
	public int k07_sum(int a, int b, int c) {	// ������ ���� a,b,c�� �޾Ƽ� a+b+c�� ���ϵ� �� �ִ� int�� �޼��带 ������־���.
		return a + b + c;
	}
	
	public int k07_sum(int a, int b, int c, int d) {	// ������ ���� a,b,c,d�� �޾Ƽ� a+b+c�� ���ϵ� �� �ִ� int�� �޼��带 ������־���.
		return a + b + c + d;
	}
	
	public double k07_sum(double a, double b) {	// �Ǽ��� ���� a,b�� �޾Ƽ� a+b�� ���ϵ� �� �ִ� double�� �޼��带 ������־���.
		return a + b;
	}
}
