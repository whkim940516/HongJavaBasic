package TvRemocon2_Test;

import TvRemocon2.TvRemocon2;

public class TvRemocon2_Test {

	// ���� �������� ������ ����� ���ؼ� static�� ����Ͽ���.(������Ʈ�� pc�� ���������� �޸� ������ �����ص� ������ ���� ����)
	// TvRemocon2 ������ ������Ʈ 3���� ������־���.	
	static TvRemocon2 k07_TvRemocon1;	// TvRemocon2 Ŭ������ �������� ������Ʈ TvRemocon1�� �������.
	static TvRemocon2 k07_TvRemocon2;	// TvRemocon2 Ŭ������ �������� ������Ʈ TvRemocon2�� �������.
	static TvRemocon2 k07_TvRemocon3;	// TvRemocon2 Ŭ������ �������� ������Ʈ TvRemocon3�� �������.

	public static void main(String[] args) {
		
		// ���� new �����ڷ� ���� ����� �־���.
		k07_TvRemocon1 = new TvRemocon2();						// ���ڸ� ���� �ʾ����Ƿ� �⺻ TV�������̴�. 
		k07_TvRemocon2 = new TvRemocon2(15, 1, 150, 1, 5, 5);	// ���� TV������1 �̴�.
		k07_TvRemocon3 = new TvRemocon2(10, 1, 50, 1, 3, 7);	// ���� TV������2 �̴�.
		
		for (int k07_i = 0; k07_i < 10; k07_i++) {		// ���������� k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_TvRemocon2.k07_ChannelUp(1); k07_TvRemocon2.k07_msg("1��TV ä�� 1 �ø���"); 	// k07_TvRemocon2��ü���� k07_ChannelUp�޼��带 ȣ���ϰ� ���ڿ� 1�� �־� ä���� �����־���.
			//k33_TvRemocon1.k07_channelUp(1); k07_TvRemocon2.k07_msg("2��TV ä�� 1 �ø���");
			//k33_TvRemocon1.k07_channelUp(1); k07_TvRemocon2.k07_msg("3��TV ���� 1 �ø���");
		}
		
		for (int k07_i = 0; k07_i < 10; k07_i++) {		// ���������� k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_TvRemocon2.k07_ChannelDown(1); k07_TvRemocon2.k07_msg("1��TV ä�� 1 ������");	// k07_TvRemocon2��ü���� k07_ChannelDown�޼��带 ȣ���ϰ� ���ڿ� 1�� �־� ä���� �����־���.
			//k33_TvRemocon2.k07_channelDown(1); k07_TvRemocon1.k07_msg("2��TV ä�� 1 ������");
			//k33_TvRemocon2.k07_channelDown(1); k07_TvRemocon1.k07_msg("3��TV ä�� 1 ������");
		}
		
		for (int k07_i = 0; k07_i < 5; k07_i++) {		// ���������� k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_TvRemocon2.k07_VolUp(1); k07_TvRemocon2.k07_msg("1��TV ���� 1 �ø���");		// k07_TvRemocon2��ü���� k07_VolUp�޼��带 ȣ���ϰ� ���ڿ� 1�� �־� ������ �����־���.
			//k33_TvRemocon2.k07_volUp(1); k07_TvRemocon2.k07_msg("2��TV ���� 1 �ø���");
			//k33_TvRemocon2.k07_volUp(1); k07_TvRemocon2.k07_msg("3��TV ���� 1 �ø���");
		}
		
		for (int k07_i = 0; k07_i < 5; k07_i++) {		// ���������� k07_i�� 0���� 9���� 1�� �����Ѵ�.
			k07_TvRemocon2.k07_VolDown(1); k07_TvRemocon2.k07_msg("1��TV ���� 1 ������");	// k07_TvRemocon2��ü���� k07_VolDown�޼��带 ȣ���ϰ� ���ڿ� 1�� �־� ������ �����־���.
			//k33_TvRemocon2.k07_volUp(1); k07_TvRemocon2.k07_msg("2��TV ���� 1 ������");
			//k33_TvRemocon2.k07_volUp(1); k07_TvRemocon2.k07_msg("3��TV ���� 1 ������");
		}
	}
}