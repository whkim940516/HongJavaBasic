package MethodOverLoading2;

import MethodOverLoading1.MethodOverLoading1;

public class MethodOverLoading2 {

	public static void main(String[] args) {

		MethodOverLoading1 k07_cc = new MethodOverLoading1();	// MethodOverLoading1 Ŭ������ �޾Ƽ� ��ü k07_cc�� �����Ͽ���.
		
		System.out.printf("2�� ������ ȣ��� [%d]\n", k07_cc.k07_sum(1, 2));		 // ��ü k07_cc�� k07_sum�� ���� 1,2�� �ְ� ����� ����Ͽ���.
		System.out.printf("3�� ������ ȣ��� [%d]\n", k07_cc.k07_sum(1, 2, 3));		 // ��ü k07_cc�� k07_sum�� ���� 1,2,3�� �ְ� ����� ����Ͽ���.
		System.out.printf("4�� ������ ȣ��� [%d]\n", k07_cc.k07_sum(1, 2, 3, 4));	 // ��ü k07_cc�� k07_sum�� ���� 1,2,3,4�� �ְ� ����� ����Ͽ���.	
		System.out.printf("������ ������ ȣ��� [%f]\n", k07_cc.k07_sum(1.3, 2.4));	 // ��ü k07_cc�� k07_sum�� ���� 1.3�� 2.4�� �ְ� ����� ����Ͽ���.
																				 // �Ǽ����̱� ������ %f������ ����Ͽ���.
	}

}
