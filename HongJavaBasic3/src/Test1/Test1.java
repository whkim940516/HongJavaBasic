// �ڸſ� �߿�
//���ڷ� ������ ���� ����ó���� �Ϸ��� �������·� �ٲ㼭 �ϰ�
//���ڷ� ó���� ���� ���ڿ��� ���̷��� ���ڷ� ��ģ�� �ض�

package Test1;

public class Test1 {

	public static void main(String[] args) {

		String s = "12345";
		int i = Integer.parseInt(s);  // Integer.parseInt() : String�� int������ �ٲ��ش�.
		
		System.out.printf("���ڸ� ���ڷ� %d  (%d)  \n", i, i+10);
		
		String a;
		a = String.format("%d", i);  // String�� �ҷ��� int������ ���
		
		System.out.printf("���ڸ� ���ڷ� %s (%s) \n", a, a+ "abcde");   // ������ ������ �ڷ� �پ ���´�.
	}

}
