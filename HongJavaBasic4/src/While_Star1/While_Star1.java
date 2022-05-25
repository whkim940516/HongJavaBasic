package While_Star1;

// 단순비교
// for문을 안쓰고 while을 써본 사례
// 누적변수 초기화 -> Looping -> 누적

public class While_Star1 {

	public static void main(String[] args) {

		int k07_iA, k07_iB;   // int 형태로 하여 k07_iA, k07_iB 변수를 선언한다
		
		k07_iA = 0;		// 기본적으로 k07_iA 변수를 초기화 시켜준다.(누적 변수 초기화)
		while(true) {
			
			k07_iB = 0;	// 기본적으로 k07_iB 변수를 초기화 시켜준다.(누적 변수 초기화)
			while(true) {
				System.out.printf("*");   // 별을 찍어준다.
				
				if(k07_iA == k07_iB) break;   // 0  0 이니까 처음에는 별 하나를 찍고 나오게 된다.  -> 그다음 2개 3개...30개
				k07_iB++;				  // k07_iB는 1씩 증가한다.
			}
			System.out.printf("\n");  // 줄을 바꿔준다.
			k07_iA++;					  // k07_iA는 1씩 증가한다.
			if(k07_iA == 30) break;		  // k07_iA의 값이 30이 되면 해당 반복문을 빠져나온다.
		}
	}

}

