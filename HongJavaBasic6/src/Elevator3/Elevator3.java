package Elevator3;

// ������(constructor),(�Ҹ���),(�̺�Ʈ)
// Ŭ������ ȣ��Ǹ� (new)�����ڰ� ����ȴ�. �����ڴ� Ŭ���� ��� ������ public �޼ҵ�� ����ȴ�. 
// ���� �޼ҵ� �����ε��� �����ϴ�. ���� �ʱⰪ �ο� ���� �����Ѵ�.

public class Elevator3 {
		
		public int k07_limit_up_floor;				// �ֻ��� ��
		public int k07_limit_down_floor;			// ������ ��
		public int k07_floor;						// ���� ��
		public String k07_help;					// �ȳ���
			
		// Ŭ������ �̸��� �Ȱ��� �޼��带 �����ڶ� �Ѵ�.
		// �Ű������� ���� �ٸ� ���������͸� ȣ���� �� �ִ�.
		
		public Elevator3() {			 // �Ű������� ���� ���� ���
			k07_limit_up_floor = 10;		 // �ֻ��� ���� 10������ �����Ͽ���.
			k07_limit_down_floor = 1;		 // ������ ���� 1������ �����Ͽ���.
			k07_floor = 1;					 // ���� ���� 1������ �����Ͽ���.
			k07_help = "���������� �⺻ �ذ��Ϸ�";	 // �⺻ ���������� �ȳ����̴�.
			}
		
		public Elevator3(int k07_up_floor, int k07_d_floor, int k07_in_floor) {	// �Ű������� ���� �޾��� ���
			k07_limit_up_floor = k07_up_floor;		// �ֻ��� ���� ���� ���� up_floor�� ���� �ȴ�.
			k07_limit_down_floor = k07_d_floor;		// ������ ���� ���� ���� d_floor�� ���� �ȴ�.
			k07_floor = k07_in_floor;				// ���� ���� ���� ���� in_floor�� ���� �ȴ�.
			k07_help = "���������� ���� �ذ��Ϸ�";		// ���� ���������� �ȳ����̴�.
		}
		
		public void k07_up() {							// up �޼ҵ带 �������־���.
			if(k07_floor==k07_limit_up_floor) {		// �������� �ֻ��� ���̸�
				k07_help = "������ ���Դϴ�";		// ������ ���̶�� �ȳ����� �������� �Ѵ�.
			} else {						// �������� �ֻ��� ���� �ƴϸ�
				k07_floor++;					// ���� ���� �� ���� ������Ų��.
				k07_help = String.format("[%d] ���Դϴ�", k07_floor);		// ���� ������ ������ش�.
			}
		}
		
		public void k07_down() {						// down �޼ҵ带 �������־���.
			if(k07_floor==k07_limit_down_floor) {	// �������� ������ ���̸�
				k07_help = "ó�� ���Դϴ�.";		// ó�� ���̶�� �ȳ����� ���������Ѵ�.
			} else {						// �������� ������ ���� �ƴϸ�
				k07_floor--;					// ���� ���� �� ���� ���ҽ�Ų��.
				k07_help = String.format("[%d] ���Դϴ�", k07_floor);		// ���� ������ ������ش�.
			}
		}
		
		// ó�� �������� �����Ѵٸ� �׸�ŭ �ö󰡵��� �غô�.
		public void k07_up(int k07_u) {						// ������ ���� u�� �޴� up �޼��带 ������־���.
			for(int k07_i = 0; k07_i < k07_u; k07_i++) this.k07_up();	// this�� ���� ��Ȯ������.(���̽㿡���� ��Ȯ�� �ʿ䰡 �ִ�.)
		}
		
		// ó�� �������� �����Ѵٸ� �׸�ŭ ���������� �غô�.
		public void k07_down(int k07_u) {					// ������ ���� u�� �޴� down �޼��带 ������־���.
			for(int i =0; i < k07_u; i++) k07_down();		// this�� ���� �ʾƵ� ȣ���� �ȴ�.
		}
		
		public void k07_msg(String id) {				// ������ ���� id�� �޴� msg �޼��带 ������־���.
			System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n",	 // ���� ���ڿ� id�� �ȳ��� �ֻ��� ������ �������� ��µǵ��� �Ͽ���. 
					id, k07_help, k07_limit_up_floor, k07_limit_down_floor, k07_floor);
		}


}

