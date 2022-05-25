package TvRemocon2_Test;

import TvRemocon2.TvRemocon2;

public class TvRemocon2_Test {

	// 각각 고정적인 공간을 만들기 위해서 static을 사용하였다.(오브젝트가 pc나 서버내에서 메모리 공간을 차지해도 간섭을 받지 않음)
	// TvRemocon2 변수로 오브젝트 3개를 만들어주었다.	
	static TvRemocon2 k07_TvRemocon1;	// TvRemocon2 클래스를 가져가다 오브젝트 TvRemocon1을 만들었다.
	static TvRemocon2 k07_TvRemocon2;	// TvRemocon2 클래스를 가져가다 오브젝트 TvRemocon2를 만들었다.
	static TvRemocon2 k07_TvRemocon3;	// TvRemocon2 클래스를 가져가다 오브젝트 TvRemocon3을 만들었다.

	public static void main(String[] args) {
		
		// 각각 new 생성자로 값을 만들어 주었다.
		k07_TvRemocon1 = new TvRemocon2();						// 인자를 받지 않았으므로 기본 TV리모콘이다. 
		k07_TvRemocon2 = new TvRemocon2(15, 1, 150, 1, 5, 5);	// 맞춤 TV리모콘1 이다.
		k07_TvRemocon3 = new TvRemocon2(10, 1, 50, 1, 3, 7);	// 맞춤 TV리모콘2 이다.
		
		for (int k07_i = 0; k07_i < 10; k07_i++) {		// 정수형태인 k07_i는 0부터 9까지 1씩 증가한다.
			k07_TvRemocon2.k07_ChannelUp(1); k07_TvRemocon2.k07_msg("1번TV 채널 1 올리기"); 	// k07_TvRemocon2객체에서 k07_ChannelUp메서드를 호출하고 인자에 1을 넣어 채널을 높여주었다.
			//k33_TvRemocon1.k07_channelUp(1); k07_TvRemocon2.k07_msg("2번TV 채널 1 올리기");
			//k33_TvRemocon1.k07_channelUp(1); k07_TvRemocon2.k07_msg("3번TV 볼륨 1 올리기");
		}
		
		for (int k07_i = 0; k07_i < 10; k07_i++) {		// 정수형태인 k07_i는 0부터 9까지 1씩 증가한다.
			k07_TvRemocon2.k07_ChannelDown(1); k07_TvRemocon2.k07_msg("1번TV 채널 1 내리기");	// k07_TvRemocon2객체에서 k07_ChannelDown메서드를 호출하고 인자에 1을 넣어 채널을 낮춰주었다.
			//k33_TvRemocon2.k07_channelDown(1); k07_TvRemocon1.k07_msg("2번TV 채널 1 내리기");
			//k33_TvRemocon2.k07_channelDown(1); k07_TvRemocon1.k07_msg("3번TV 채널 1 내리기");
		}
		
		for (int k07_i = 0; k07_i < 5; k07_i++) {		// 정수형태인 k07_i는 0부터 9까지 1씩 증가한다.
			k07_TvRemocon2.k07_VolUp(1); k07_TvRemocon2.k07_msg("1번TV 볼륨 1 올리기");		// k07_TvRemocon2객체에서 k07_VolUp메서드를 호출하고 인자에 1을 넣어 볼륨을 높여주었다.
			//k33_TvRemocon2.k07_volUp(1); k07_TvRemocon2.k07_msg("2번TV 볼륨 1 올리기");
			//k33_TvRemocon2.k07_volUp(1); k07_TvRemocon2.k07_msg("3번TV 볼륨 1 올리기");
		}
		
		for (int k07_i = 0; k07_i < 5; k07_i++) {		// 정수형태인 k07_i는 0부터 9까지 1씩 증가한다.
			k07_TvRemocon2.k07_VolDown(1); k07_TvRemocon2.k07_msg("1번TV 볼륨 1 내리기");	// k07_TvRemocon2객체에서 k07_VolDown메서드를 호출하고 인자에 1을 넣어 볼륨을 낮춰주었다.
			//k33_TvRemocon2.k07_volUp(1); k07_TvRemocon2.k07_msg("2번TV 볼륨 1 내리기");
			//k33_TvRemocon2.k07_volUp(1); k07_TvRemocon2.k07_msg("3번TV 볼륨 1 내리기");
		}
	}
}