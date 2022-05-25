package TvRemocon2;

public class TvRemocon2 {

	// 변수를 호출해서 바꾸지 못하도록 private를 사용하였다.
	private int k07_limitUpVol; 		// 정수 형태로 하여 최대 볼륨을 선언해주었다.
	private int k07_limitDownVol; 		// 정수 형태로 하여 최저 볼륨을 선언해주었다.
	private int k07_limitUpChannel; 	// 정수 형태로 하여 최대 채널을 선언해주었다.
	private int k07_limitDownChannel; 	// 정수 형태로 하여 최저 채널을 선언해주었다.

	private int k07_vol; 			// 정수 형태로하여 현재 볼륨을 선언해주었다.
	private int k07_channel; 		// 정수 형태로하여 현재 채널을 선언해주었다.
	public String k07_help; 		// 문자 형태로하여 출력될 안내물을 선언해주었다.

	// 클래스와 이름이 똑같은 메서드를 생성자라 한다.
	public TvRemocon2() { 			// TvRemocon2 생성자를 통해 기본 리모콘(매개변수를 받지 않았을 경우)을 설정해주었다.
		k07_limitUpVol = 5; 		// 최대 볼륨 초기값을 5로 설정해주었다.
		k07_limitDownVol = 0; 		// 최저 볼륨 초기값을 0으로 설정해주었다.
		k07_limitUpChannel = 10; 	// 최대 채널 초기값을 10으로 설정해주었다.
		k07_limitDownChannel = 0; 	// 최저 채널 초기값을 0으로 설정해주었다.
		k07_vol = 1; 				// 현재 볼륨 초기값을 1로 설정해주었다.
		k07_channel = 1; 			// 현재 채널 초기값을 1로 설정해주었다.
		k07_help = "리모콘 기본 설정 완료"; // 기본 리모콘 안내문을 설정해주었다.
	}

	// 맞춤 TV리모콘을 만들기 위해 최대 볼륨, 최저 볼륨, 현재 볼륨, 최대 채널, 최저 채널, 현재 채널을 인자로 받는다.
	public TvRemocon2(int k07_upVol, int k07_downVol, int k07_upChannel, int k07_downChannel, int k07_inVol,
			int k07_inChannel) {
		k07_limitUpVol = k07_upVol; 		// 최대 볼륨은 입력받은 최대 볼륨으로 설정한다.
		k07_limitDownVol = k07_downVol; 	// 최저 볼륨은 입력받은 최저 볼륨으로 설정한다.
		k07_limitUpChannel = k07_upChannel; // 최대 채널은 입력받은 최대 채널로 설정한다.
		k07_limitDownChannel = k07_downChannel; // 최저 채널은 입력받은 최저 채널로 설정한다.
		k07_vol = k07_inVol; 				// 현재 볼륨은 입력받은 현재 볼륨으로 설정한다.
		k07_channel = k07_inChannel; 		// 현재 채널은 입력받은 현재 채널로 설정한다.
		k07_help = "리모콘 맞춤 설정 완료"; 		// 맞춤 리모콘 안내문을 설정해주었다.
	}

	public void k07_VolUp(int i) { 		// 볼륨을 올리는 메서드를 만들어주었다.
		if (k07_vol == k07_limitUpVol) { 	// 현재 볼륨이 최대 볼륨이면
			k07_help = "볼륨 최대입니다."; 		// 볼륨이 최대라고 출력해준다.

		} else { 				// 현재 볼륨이 최대 볼륨이 아니라면
			k07_vol++; 			// 볼륨이 하나씩 증가한다.
			k07_help = String.format("볼륨 %d 입니다.", k07_vol); // 증가한 현재 볼륨을 출력한다.
		}

	}

	public void k07_VolDown(int i) { 		// 볼륨을 낮추는 메서드를 만들어주었다.
		if (k07_vol == k07_limitDownVol) { 		// 현재 볼륨이 최저 볼륨이라면
			k07_help = "볼륨 최저입니다."; 			// 볼륨이 최저라고 출력해준다.
		} else { 								// 현재 볼륨이 최저 볼륨이 아니라면
			k07_vol--; 							// 볼륨이 하나씩 감소한다.
			k07_help = String.format("볼륨 %d 입니다.", k07_vol); // 감소한 현재 볼륨을 출력한다.
		}
	}

	public void k07_ChannelUp(int i) { 			// 채널을 올려주는 메서드를 만들어주었다.
		if (k07_channel == k07_limitUpChannel) { 	// 현재 채널이 최대 채널이면
			k07_help = "채널 최대입니다."; 				// 채널이 최대라고 출력해준다.
		} else { 									// 현재 채널이 최대 채널이 아니라면
			k07_channel++; 							// 채널이 하니씩 증가한다.
			k07_help = String.format("채널 %d 입니다.", k07_channel); // 증가한 현재 채널을 출력한다.
		}
	}

	public void k07_ChannelDown(int i) { 		// 채널을 내려주는 메서드를 만들어주었다.
		if (k07_channel == k07_limitDownChannel) { 	// 현재 채널이 최저 채널이라면
			k07_help = "채널 최저입니다."; 				// 채널이 최저라고 출력해준다.
		} else { 									// 현재 채널이 최저 채널이 아니라면
			k07_channel--; 							// 채널이 하나씩 감소한다.
			k07_help = String.format("채널 %d 입니다.", k07_channel); // 감소한 현재 채널을 출력한다.
		}
	}

	public void k07_msg(String k07_id) {
		System.out.printf("%s=>[%s] 최대 볼륨[%d] 최소 볼륨[%d] 현재 볼륨[%d], 최대 채널[%d] 최소 채널[%d], 현재 채널[%d]\n", k07_id, k07_help,
				k07_limitUpVol, k07_limitDownVol, k07_vol, k07_limitUpChannel, k07_limitDownChannel, k07_channel);
		// 최대볼륨, 최소볼륨, 현재볼륨, 최대채널, 최소채널, 현재채널을 출력해주며 서식에 맞게 %s와 %d를 사용해주었다.

	}
}
