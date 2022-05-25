package For_gugu2;

public class For_gugu2 {

	public static void main(String[] args) {

		for(int k07_i = 1; k07_i < 10; k07_i++) {					// int 형태인 k07_i는 1부터 9까지 1씩 증가한다.
			System.out.printf("**********************\n", k07_i);	// 여기서 k07_i는 사실 안써줘도 무관하다. 
			System.out.printf("     구구단 %d 단\n", k07_i);			// k07_i가 증가하면서 1단 부터 9단까지 출력되며 이는 %d이므로 정수 형태로 출력된다. 
			System.out.printf("**********************\n", k07_i);	// 여기서 k07_i는 사실 안써줘도 무관하다.
			for(int k07_j = 1; k07_j < 10; k07_j++) {				// int 형태인 k07_j는 1부터 9까지 1씩 증가한다. 
				System.out.printf("%d * %d = %d \n", k07_i, k07_j, k07_i*k07_j);	// 가장 바깥쪽에 있는 for문이 수행되면서 안쪽에 있는 for문이 수행된다.
			}																		// k07_i는 1이 수행되면서 k07_j에서 1에서부터 9까지 수행된다.
		}																			// 그 다음에 2가 수행되면서 k07_j에서 1에서부터 9까지 수행된다.
	}																				// 이렇게 반복되어 9까지 수행된다. 그리고 이를 정수 형태로 표현하기 위해
																					// %d 서식을 사용해주었고 한줄 나오고 나서 줄바꿈을 위해 \n기호를 사용해주었다.
}
