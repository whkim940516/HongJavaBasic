package BasicSwitchCase;

public class BasicSwitchCase {

	public static void main(String[] args) {

		String k07_jumin = "123456-1234567";   // ������ ���� �ֹι�ȣ�� �Ͽ� String ���·� k07_jumin��� ������ �����Ѵ�. 
		
		switch(k07_jumin.charAt(7)) {          // switch case ���� ����ϴ� �� charAt �޼��带 Ȱ���Ͽ�(charAt �޼���� ~��° �ڸ��� �ϳ��� ���������� ���ش�.)
			case '1' :					   // 7��° �ڸ��� �ش��ϴ� ���ڸ� Ȯ���Ͽ� case�� �����ϰ� �׿� �´� �ڵ带 ����ϵ��� �Ѵ�.
				System.out.printf("20���� �� �¾ ���� ���\n");     // case1�� ���(7��° �ڸ��� 1) 20���� �� �¾ ���� ����� ����Ѵ�.  ���⼭�� break;�� �����ʾ����� �ָ�����
			case '2' :								
				System.out.printf("20���� �� �¾ ���� ���\n");    //  case2�� ���(7��° �ڸ��� 2) 20���� �� �¾ ���� ����� ����Ѵ�.
				break;											// ���⼭ break;�� �ɾ����Ƿ� ���� ����� �� ���常 ��µǰ� �Ʒ��� ���ʹ� ��µ��� �ʴ´�.
			case '3' :
				System.out.printf("20���� �� �¾ ���� ���\n");    //  case3�� ���(7��° �ڸ��� 3) 20���� �� �¾ ���� ����� ����Ѵ�.
				break;
			case '4' :
				System.out.printf("20���� �� �¾ ���� ���\n");	//  case4�� ���(7��° �ڸ��� 4) 20���� �� �¾ ���� ����� ����Ѵ�.
				break;
			default :											// ���ǽ��� ����� ��ġ�ϴ� case ���� ���� ��� 
				System.out.printf("���\n");   				    // ����� ��µǵ��� �Ѵ�.
				break;
		}
	}

}
