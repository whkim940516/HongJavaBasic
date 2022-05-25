package ArrayUseComparison;

// Array이용 비교
// 배열을 사용하는 경우도 좋은 사례이다. 하지만 복잡해 보이긴 하다.

public class ArrayUseComparison {

	public static void main(String[] args) {

		// 비정형 비교(룰이 애매한)는 배열을 이용하는 것도 한 방법이다.
		
		int [] k07_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31};  // int 형태로 k07_iLMD를 변수명으로 하여 배열을 선언한다.
															  // 단 배열은 0부터 시작한다는 것에 유의하자 LastMonthDate
															  // 즉, k07_iLMD[0] ~ k07_iLMD[11] 이다.
		
		for(int k07_i = 1; k07_i < 13; k07_i++) {					// int 형태인 k07_i는 1부터 시작하여 12까지 1씩 증가한다. 
			System.out.printf(" %d월 =>", k07_i);			// 증가하는 대로 k07_i가 출력된다.
			for(int k07_j = 1; k07_j < 32; k07_j++) {				// int 형태인 k07_j는 1부터 시작하여 31까지 1씩 증가한다.
				System.out.printf("%d", k07_j);				// 증가하는 대로 k07_j가 출력된다.
				
				if(k07_iLMD[k07_i-1]==k07_j) break;	// 인덱스가 하나 밀리는 부분에 유의해야한다. 
				
				System.out.printf(","); // 마지막 일 콤마 안찍기  그리고 이 문장은 마지막일에 콤마를 찍지 않기 위해 이 문장으로 부터 5문장 위의 문장과
			}							// 분리하였다. 아래와 같이 월이 바뀔때 ,가 찍히지 않는 것을 확인할 수 있는데 이게 가능한 이유는 반복문이 돌면서 k07_iMLD 배열에 있는 값과 k07_j가 같아질 때 
			System.out.printf("\n");	// 해당 반복을 멈추고 반복문을 빠져나온 후 다음 블럭으로 넘어가서 줄을 바꾸는 코드를 수행하기 때문에 이와 같은 결과가 나올 수 있는 것이다.
		}
	}

}
