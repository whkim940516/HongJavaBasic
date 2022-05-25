package TvRemocon3_Test;

import TvRemocon3.TvRemocon3;

public class TvRemocon3_Test {

	public static void main(String[] args) {
											
				TvRemocon3 k07_TvRemocon3 = new TvRemocon3();	// 클래스 TvRemocon2를 상속받은 클래스 Tvremocon3에서 객체를 생성해주었다.(생성자 생성)

				// 채널을 10번 올린다.
				for (int k07_i = 0; k07_i < 10; k07_i++) {		// k07_i는 0부터 9까지 1씩 증가한다.
					k07_TvRemocon3.k07_ChannelUp(k07_i);				// k07_TvRemocon3 객체에서 k07_ChannelUp 메서드를 호출해주었다.
					System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);	// k07_TvRemocon3 객체에서 k07_help를 호출하여 안내말이 나오도록 하였다.
				}
			
				// 채널을 10번 내린다.
				for (int k07_i = 0; k07_i < 10; k07_i++) {		// k07_i는 0부터 9까지 1씩 증가한다.
					k07_TvRemocon3.k07_ChannelDown(k07_i);			// k07_TvRemocon3 객체에서 k07_ChannelDown 메서드를 호출해주었다.
					System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);	// k07_TvRemocon3 객체에서 k07_help를 호출하여 안내말이 나오도록 하였다.
				}
				
				// 볼륨을 5번 올린다
				for (int k07_i = 0; k07_i < 5; k07_i++) {		// k07_i는 0부터 4까지 1씩 증가한다.
					k07_TvRemocon3.k07_VolUp(k07_i);					// k07_TvRemocon3 객체에서 k07_VolUp 메서드를 호출해주었다.
					System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);	// k07_TvRemocon3 객체에서 k07_help를 호출하여 안내말이 나오도록 하였다.
				}
				
				// 볼륨을 5번 내린다
				for (int k07_i = 0; k07_i < 5; k07_i++) {		// k07_i는 0부터 4까지 1씩 증가gksek.
					k07_TvRemocon3.k07_VolDown(k07_i);				// k07_TvRemocon3 객체에서 k07_VolDown 메서드를 호출해주었다.
					System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);	// k07_TvRemocon3 객체에서 k07_help를 호출하여 안내말이 나오도록 하였다.
				}
				
				// 건전지 체크 사항을 출력한다.
				k07_TvRemocon3.k07_Repair();					// 다른 클래스를 상속받는 과정에서 추가해준 k07_Repair 메서드를 호출해주었다. 
				System.out.printf("MSG k07_TvRemocon3[%s]\n", k07_TvRemocon3.k07_help);		// k07_TvRemocon3 객체에서 k07_help를 호출하여 안내말이 나오도록 하였다.
			}
		}
