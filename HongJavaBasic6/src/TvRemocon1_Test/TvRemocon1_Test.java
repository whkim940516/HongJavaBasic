package TvRemocon1_Test;

import TvRemocon1.TvRemocon1;

public class TvRemocon1_Test {

	public static void main(String[] args) {

		TvRemocon1 k07_TvRemocon;	// TvRemocon1 클래스를 받아서 k07_TvRemocon 객체를 만든다.
		
		k07_TvRemocon = new TvRemocon1();	// 객체 k307_TvRemocon에 TvRemocon1 인스턴스를 생성해서 연결한다.
					
		for (int k07_i = 0; k07_i < 5; k07_i++) {	// k07_i는 0부터 4까지 1씩 증가한다.
			k07_TvRemocon.k07_VolUp();	// k07_TvRemocon1 클래스 k07_Volup으로 이동한다.
			System.out.printf("[%s]\n", k07_TvRemocon.k07_help);	// 현재 볼륨을 출력해준다.
		}
		
		for (int k07_i = 0; k07_i < 5; k07_i ++) {	// k07_i는 0부터 4까지 1씩 증가한다.
			k07_TvRemocon.k07_VolDown();	// k07_TvRemocon1 클래스 k07_VolDown으로 이동한다.
			System.out.printf("[%s]\n", k07_TvRemocon.k07_help);	// 현재 볼륨을 출력해준다.
		}
		
		for (int k07_i = 0; k07_i < 10; k07_i++) {	// k07_i는 0부터 9까지 1씩 증가한다.
			k07_TvRemocon.k07_ChannelDown();	// k07_TvRemocon1 클래스 k07_Channelup으로 이동한다.
			System.out.printf("[%s]\n", k07_TvRemocon.k07_help);	// 현재 채널을 출력해준다.
		}
		
		for (int k07_i = 0; k07_i < 10; k07_i++) {	// k07_i는 0부터 9까지 1씩 증가한다.
			k07_TvRemocon.k07_ChannelDown();	// k07_TvRemocon1 클래스 k07_ChannelDown으로 이동
			System.out.printf("[%s]\n", k07_TvRemocon.k07_help);	// 현재 채널을 출력해준다.
		}
	}

}
