// �� ��ȯ

package VarEx2;

public class VarEx2 {  // Ŭ���� ����
	public static void main(String[] args) {  // �������κ��� ���α׷� ����

		int x = 10;  // x��� ������ ������ �����ϰ� 10���� �ʱ�ȭ
		int y = 20;	 // y��� ������ ������ �����ϰ� 20���� �ʱ�ȭ
		int tmp = 0;  // tmp��� ������ ������ �����ϰ� 0���� �ʱ�ȭ
		
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;  // 10�̶�� ���� tmp������ ���ǵ�
		x = y;    // y��� ���� x������ ���ǵ�
		y = tmp;  // tmp���� y������ ���ǵ�
		
		System.out.println("x:" + x + " y:" + y);
	}

}
