package VarEx1;

public class VarEx1 {  // Ŭ���� ����
	public static void main(String[] args) {	// �������κ��� ���α׷� ����
		
		int k07_year = 0;  // year��� ������ ������ �����ϰ� 0���� �ʱ�ȭ
		int k07_age = 14;  // age��� ������ ������ �����ϰ� 14�� �ʱ�ȭ
		
		System.out.println("���1 :" + k07_year); // year ������ ȭ�鿡 ���
		System.out.println("���2 :" + k07_age);  // age ������ ȭ�鿡 ���
		
		k07_year = k07_age + 2000;  // ���� age�� ���� 2000�� ���ؼ� ���� year�� ����
		k07_age = k07_age + 1;      // ���� age�� ����� ���� 1 ������Ų��.
		
		System.out.println("���3 :" + k07_year);
		System.out.println("���4 :" + k07_age);
	}
}
