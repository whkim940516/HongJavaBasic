package TvRemocon3;

import TvRemocon2.TvRemocon2;

public class TvRemocon3 extends TvRemocon2 {	// 클래스 TvRemocon3은 클래스 TvRemocon2를 상속받는다.
	
	public void k07_Repair() {					// TvRemocon2에는 없던 함수인 k07_Battery() 함수를 추가해주었다.
		k07_help = String.format("건전지가 부족합니다.");		// 건전지가 부족하다는 안내문이 나오도록 하였다.
	}
}

