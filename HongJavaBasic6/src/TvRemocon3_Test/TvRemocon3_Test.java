package TvRemocon3_Test;

import TvRemocon3.TvRemocon3;

public class TvRemocon3_Test {

	public static void main(String[] args) {
											
				TvRemocon3 k07_TvRemocon3 = new TvRemocon3();	// Ŭ���� TvRemocon2�� ��ӹ��� Ŭ���� Tvremocon3���� ��ü�� �������־���.(������ ����)

				// ä���� 10�� �ø���.
				for (int k07_i = 0; k07_i < 10; k07_i++) {		// k07_i�� 0���� 9���� 1�� �����Ѵ�.
					k07_TvRemocon3.k07_ChannelUp(k07_i);				// k07_TvRemocon3 ��ü���� k07_ChannelUp �޼��带 ȣ�����־���.
					System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);	// k07_TvRemocon3 ��ü���� k07_help�� ȣ���Ͽ� �ȳ����� �������� �Ͽ���.
				}
			
				// ä���� 10�� ������.
				for (int k07_i = 0; k07_i < 10; k07_i++) {		// k07_i�� 0���� 9���� 1�� �����Ѵ�.
					k07_TvRemocon3.k07_ChannelDown(k07_i);			// k07_TvRemocon3 ��ü���� k07_ChannelDown �޼��带 ȣ�����־���.
					System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);	// k07_TvRemocon3 ��ü���� k07_help�� ȣ���Ͽ� �ȳ����� �������� �Ͽ���.
				}
				
				// ������ 5�� �ø���
				for (int k07_i = 0; k07_i < 5; k07_i++) {		// k07_i�� 0���� 4���� 1�� �����Ѵ�.
					k07_TvRemocon3.k07_VolUp(k07_i);					// k07_TvRemocon3 ��ü���� k07_VolUp �޼��带 ȣ�����־���.
					System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);	// k07_TvRemocon3 ��ü���� k07_help�� ȣ���Ͽ� �ȳ����� �������� �Ͽ���.
				}
				
				// ������ 5�� ������
				for (int k07_i = 0; k07_i < 5; k07_i++) {		// k07_i�� 0���� 4���� 1�� ����gksek.
					k07_TvRemocon3.k07_VolDown(k07_i);				// k07_TvRemocon3 ��ü���� k07_VolDown �޼��带 ȣ�����־���.
					System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);	// k07_TvRemocon3 ��ü���� k07_help�� ȣ���Ͽ� �ȳ����� �������� �Ͽ���.
				}
				
				// ������ üũ ������ ����Ѵ�.
				k07_TvRemocon3.k07_Repair();					// �ٸ� Ŭ������ ��ӹ޴� �������� �߰����� k07_Repair �޼��带 ȣ�����־���. 
				System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);		// k07_TvRemocon3 ��ü���� k07_help�� ȣ���Ͽ� �ȳ����� �������� �Ͽ���.
			}
		}
