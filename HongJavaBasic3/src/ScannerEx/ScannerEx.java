package ScannerEx;

import java.util.*;

public class ScannerEx {  // Ŭ���� ����

	public static void main(String[] args) {  // �������κ��� ���α׷� ����

		Scanner scanner = new Scanner(System.in);  // ��ĳ�� ����, �������� ���� �ܼ�â���� �Է����� ������ ������ ���� ���
		
		System.out.println("�� �ڸ� ������ �ϳ� �Է����ּ���.>");  // �Է�
		
		String input = scanner.nextLine();  // �Է¹��� ���� ���ڿ��� ����
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³���:" + input);
		System.out.printf("num=%d\n", num);
	}

}
