package TvRemocon1_Test;

import TvRemocon1.TvRemocon1;

public class TvRemocon1_Test {

	public static void main(String[] args) {

		TvRemocon1 k07_TvRemocon;	// TvRemocon1 Ŭ������ �޾Ƽ� k07_TvRemocon ��ü�� �����.
		
		k07_TvRemocon = new TvRemocon1();	// ��ü k307_TvRemocon�� TvRemocon1 �ν��Ͻ��� �����ؼ� �����Ѵ�.
					
		for (int k07_i = 0; k07_i < 5; k07_i++) {	// k07_i�� 0���� 4���� 1�� �����Ѵ�.
			k07_TvRemocon.k07_VolUp();	// k07_TvRemocon1 Ŭ���� k07_Volup���� �̵��Ѵ�.
			System.out.printf("[%s]\n", k07_TvRemocon.k07_help);	// ���� ������ ������ش�.
		}
		
		for (int k07_i = 0; k07_i < 5; k07_i ++) {	// k07_i�� 0���� 4���� 1�� �����Ѵ�.
			k07_TvRemocon.k07_VolDown();	// k07_TvRemocon1 Ŭ���� k07_VolDown���� �̵��Ѵ�.
			System.out.printf("[%s]\n", k07_TvRemocon.k07_help);	// ���� ������ ������ش�.
		}
		
		for (int k07_i = 0; k07_i < 10; k07_i++) {	// k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_TvRemocon.k07_ChannelDown();	// k07_TvRemocon1 Ŭ���� k07_Channelup���� �̵��Ѵ�.
			System.out.printf("[%s]\n", k07_TvRemocon.k07_help);	// ���� ä���� ������ش�.
		}
		
		for (int k07_i = 0; k07_i < 10; k07_i++) {	// k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_TvRemocon.k07_ChannelDown();	// k07_TvRemocon1 Ŭ���� k07_ChannelDown���� �̵�
			System.out.printf("[%s]\n", k07_TvRemocon.k07_help);	// ���� ä���� ������ش�.
		}
	}

}
