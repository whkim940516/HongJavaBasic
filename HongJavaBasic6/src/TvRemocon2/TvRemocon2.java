package TvRemocon2;

public class TvRemocon2 {

	// ������ ȣ���ؼ� �ٲ��� ���ϵ��� private�� ����Ͽ���.
	private int k07_limitUpVol; 		// ���� ���·� �Ͽ� �ִ� ������ �������־���.
	private int k07_limitDownVol; 		// ���� ���·� �Ͽ� ���� ������ �������־���.
	private int k07_limitUpChannel; 	// ���� ���·� �Ͽ� �ִ� ä���� �������־���.
	private int k07_limitDownChannel; 	// ���� ���·� �Ͽ� ���� ä���� �������־���.

	private int k07_vol; 			// ���� ���·��Ͽ� ���� ������ �������־���.
	private int k07_channel; 		// ���� ���·��Ͽ� ���� ä���� �������־���.
	public String k07_help; 		// ���� ���·��Ͽ� ��µ� �ȳ����� �������־���.

	// Ŭ������ �̸��� �Ȱ��� �޼��带 �����ڶ� �Ѵ�.
	public TvRemocon2() { 			// TvRemocon2 �����ڸ� ���� �⺻ ������(�Ű������� ���� �ʾ��� ���)�� �������־���.
		k07_limitUpVol = 5; 		// �ִ� ���� �ʱⰪ�� 5�� �������־���.
		k07_limitDownVol = 0; 		// ���� ���� �ʱⰪ�� 0���� �������־���.
		k07_limitUpChannel = 10; 	// �ִ� ä�� �ʱⰪ�� 10���� �������־���.
		k07_limitDownChannel = 0; 	// ���� ä�� �ʱⰪ�� 0���� �������־���.
		k07_vol = 1; 				// ���� ���� �ʱⰪ�� 1�� �������־���.
		k07_channel = 1; 			// ���� ä�� �ʱⰪ�� 1�� �������־���.
		k07_help = "������ �⺻ ���� �Ϸ�"; // �⺻ ������ �ȳ����� �������־���.
	}

	// ���� TV�������� ����� ���� �ִ� ����, ���� ����, ���� ����, �ִ� ä��, ���� ä��, ���� ä���� ���ڷ� �޴´�.
	public TvRemocon2(int k07_upVol, int k07_downVol, int k07_upChannel, int k07_downChannel, int k07_inVol,
			int k07_inChannel) {
		k07_limitUpVol = k07_upVol; 		// �ִ� ������ �Է¹��� �ִ� �������� �����Ѵ�.
		k07_limitDownVol = k07_downVol; 	// ���� ������ �Է¹��� ���� �������� �����Ѵ�.
		k07_limitUpChannel = k07_upChannel; // �ִ� ä���� �Է¹��� �ִ� ä�η� �����Ѵ�.
		k07_limitDownChannel = k07_downChannel; // ���� ä���� �Է¹��� ���� ä�η� �����Ѵ�.
		k07_vol = k07_inVol; 				// ���� ������ �Է¹��� ���� �������� �����Ѵ�.
		k07_channel = k07_inChannel; 		// ���� ä���� �Է¹��� ���� ä�η� �����Ѵ�.
		k07_help = "������ ���� ���� �Ϸ�"; 		// ���� ������ �ȳ����� �������־���.
	}

	public void k07_VolUp(int i) { 		// ������ �ø��� �޼��带 ������־���.
		if (k07_vol == k07_limitUpVol) { 	// ���� ������ �ִ� �����̸�
			k07_help = "���� �ִ��Դϴ�."; 		// ������ �ִ��� ������ش�.

		} else { 				// ���� ������ �ִ� ������ �ƴ϶��
			k07_vol++; 			// ������ �ϳ��� �����Ѵ�.
			k07_help = String.format("���� %d �Դϴ�.", k07_vol); // ������ ���� ������ ����Ѵ�.
		}

	}

	public void k07_VolDown(int i) { 		// ������ ���ߴ� �޼��带 ������־���.
		if (k07_vol == k07_limitDownVol) { 		// ���� ������ ���� �����̶��
			k07_help = "���� �����Դϴ�."; 			// ������ ������� ������ش�.
		} else { 								// ���� ������ ���� ������ �ƴ϶��
			k07_vol--; 							// ������ �ϳ��� �����Ѵ�.
			k07_help = String.format("���� %d �Դϴ�.", k07_vol); // ������ ���� ������ ����Ѵ�.
		}
	}

	public void k07_ChannelUp(int i) { 			// ä���� �÷��ִ� �޼��带 ������־���.
		if (k07_channel == k07_limitUpChannel) { 	// ���� ä���� �ִ� ä���̸�
			k07_help = "ä�� �ִ��Դϴ�."; 				// ä���� �ִ��� ������ش�.
		} else { 									// ���� ä���� �ִ� ä���� �ƴ϶��
			k07_channel++; 							// ä���� �ϴϾ� �����Ѵ�.
			k07_help = String.format("ä�� %d �Դϴ�.", k07_channel); // ������ ���� ä���� ����Ѵ�.
		}
	}

	public void k07_ChannelDown(int i) { 		// ä���� �����ִ� �޼��带 ������־���.
		if (k07_channel == k07_limitDownChannel) { 	// ���� ä���� ���� ä���̶��
			k07_help = "ä�� �����Դϴ�."; 				// ä���� ������� ������ش�.
		} else { 									// ���� ä���� ���� ä���� �ƴ϶��
			k07_channel--; 							// ä���� �ϳ��� �����Ѵ�.
			k07_help = String.format("ä�� %d �Դϴ�.", k07_channel); // ������ ���� ä���� ����Ѵ�.
		}
	}

	public void k07_msg(String k07_id) {
		System.out.printf("%s=>[%s] �ִ� ����[%d] �ּ� ����[%d] ���� ����[%d], �ִ� ä��[%d] �ּ� ä��[%d], ���� ä��[%d]\n", k07_id, k07_help,
				k07_limitUpVol, k07_limitDownVol, k07_vol, k07_limitUpChannel, k07_limitDownChannel, k07_channel);
		// �ִ뺼��, �ּҺ���, ���纼��, �ִ�ä��, �ּ�ä��, ����ä���� ������ָ� ���Ŀ� �°� %s�� %d�� ������־���.

	}
}
