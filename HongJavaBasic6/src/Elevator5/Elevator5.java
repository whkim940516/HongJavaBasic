package Elevator5;

import Elevator3.Elevator3;

// Ŭ������ ��ӹ޾� �����ǰ� �����ϴ�. ��, Ŭ������ ������ ������ �´�.(public���� ����� ���� �� ��� �����ϴ�.)
// �Ʒ� Elevator5 Ŭ������ Elevator3�� ��ӹ޾� �������. : Elevator3���� ��밡����(public ��) �Լ� ������ �״�� ������ ��� �����ϴ�.
// Elevator3�� ����� ������ ���� up(),down(),, �޼ҵ带 ����ϰ� ���� Repair()��� �޼ҵ嵵 ����ϰ� �ִ�.
// �ڹٿ����� ���� ����� �����Ǿ��ִ�.(��, Elevator3�� ����Ͽ� Elevator5�� ������µ� Elevator5�� �� �̻� ����� ���� �ʴ´�.)

public class Elevator5 extends Elevator3{	// Ŭ���� Elevator5�� Ŭ���� Elevator3�� ��ӹ޴´�. 
	
	public void k07_Repair() {					// Elevator3���� ���� �Լ��� Repair() �Լ��� �߰����־���.
		k07_help = String.format("�������Դϴ�.");		// �������Դϴ� ��� �ȳ����� �������� �Ͽ���.
	}
}
