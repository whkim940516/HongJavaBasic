package TvRemocon1;

public class TvRemocon1 {
	
		int k07_limitUpVol = 5;			// 정수 형태로 하여 최대 볼륨을 설정해주었다.
		int k07_limitDownVol = 0;		// 정수 형태로 하여 최저 볼륨을 설정해주었다.
		int k07_limitUpChannel = 10;	// 정수 형태로 하여 최대 채널을 설정해주었다.
		int k07_limitDownChannel = 0;	// 정수 형태로 하여 최저 채널을 설정해주었다.
		
		int k07_vol = 1;			// 정수 형태로하여 현재 볼륨을 설정해주었다.
		int k07_channel = 1;		// 정수 형태로하여 현재 채널을 설정해주었다.
		public String k07_help;		// 문자 형태로하여 출력될 안내물을 선언해주었다.
		
		public void k07_VolUp() {				// 볼륨을 올리는 메서드를 만들어주었다.
			if(k07_vol == k07_limitUpVol) {		// 현재 볼륨이 최대 볼륨이면 
				k07_help = "볼륨 최대입니다.";		// 볼륨이 최대라고 출력해준다.
				
			} else {							// 현재 볼륨이 최대 볼륨이 아니라면
				k07_vol++;						// 볼륨이 하나씩 증가한다.
				k07_help = String.format("볼륨 %d 입니다.", k07_vol);	// 증가한 현재 볼륨을 출력한다.
			}
			
		}
		
		public void k07_VolDown() {				// 볼륨을 낮추는 메서드를 만들어주었다.
			if(k07_vol == k07_limitDownVol) {	// 현재 볼륨이 최저 볼륨이라면
				k07_help = "볼륨 최저입니다.";		// 볼륨이 최저라고 출력해준다.
			} else {							// 현재 볼륨이 최저 볼륨이 아니라면
				k07_vol--;						// 볼륨이 하나씩 감소한다.
				k07_help = String.format("볼륨 %d 입니다.", k07_vol);	// 감소한 현재 볼륨을 출력한다.
			}
		}
		
		void k07_ChannelUp() {							// 채널을 올려주는 메서드를 만들어주었다.
			if(k07_channel == k07_limitUpChannel) {		// 현재 채널이 최대 채널이면
				k07_help = "채널 최대입니다.";				// 채널이 최대라고 출력해준다.
			} else {									// 현재 채널이 최대 채널이 아니라면
				k07_channel++;							// 채널이 하니씩 증가한다.
				k07_help = String.format("채널 %d 입니다.", k07_channel);	// 증가한 현재 채널을 출력한다.
			}
		}
		
		public void k07_ChannelDown() {					// 채널을 내려주는 메서드를 만들어주었다.
			if(k07_channel == k07_limitDownChannel) {	// 현재 채널이 최저 채널이라면
				k07_help = "채널 최저입니다.";				// 채널이 최저라고 출력해준다.
			} else {									// 현재 채널이 최저 채널이 아니라면
				k07_channel--;							// 채널이 하나씩 감소한다.
				k07_help = String.format("채널 %d 입니다.", k07_channel);		// 감소한 현재 채널을 출력한다.
			}
		}

}
