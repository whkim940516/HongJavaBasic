package CaseSentenceComparison;

// Switch, case가 적합하지 않은 사례이다.
// 또한 break 문장이 복잡해지는 사례를 볼 수 있다.
// 이 예제는 정말 억지로 만든 것이며 이렇게 이상하게 프로그램 하지 않지만 실습은 해봐야 하는 부분이다.

public class CaseSentenceComparison {

	public static void main(String[] args) {

		for(int k07_i = 1; k07_i < 13; k07_i++) {   // int 형태인 k07_i는 1부터 시작하여 12까지 1씩 증가한다.
			System.out.printf(" %d월 =>", k07_i);			// 증가하는 대로 k07_i를 %d 정수형태로 출력하도록 한다.
			LOOP:for(int k07_j = 1; k07_j < 32; k07_j++) {	// int 형태인 k07_j는 1부터 시작하여 31까지 1씩 증가한다.
				
				System.out.printf("%d,", k07_j);		// 증가하는 대로 k07_j를 %d 정수형태로 출력하도록 한다.
				
				switch(k07_i) {
					case 4: case 6: case 9: case 7: case 11:	// 4, 6, 9, 7, 11 월 은 30일 이다.
						if(k07_j == 30) break LOOP;				// 30일이 되면 break를 하고 LOOP문으로 돌아가도록 하였다.
						// 거의 이런 표현은 안한다.
						// LOOP 라는 표시자가 없으면 엉뚱한 결과
						break;									// 이런 식으로 표현하는 것은 좋은 표현이 아니다.
					case 2:
						if(k07_j == 28) break LOOP;		// 28일이 되면 break를 하고 LOOP문으로 돌아가도록 하였다.
						break;
				}
			}
			System.out.printf("\n");   			// 다음 문장을 위해 줄바꿈 기호 \n을 써줬다.
		}
		
	}

}
