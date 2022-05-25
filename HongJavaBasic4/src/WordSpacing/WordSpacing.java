package WordSpacing;

// 원하는 띄어쓸 칸 만큼 빈칸을 출력한다.

public class WordSpacing {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {   						// int 형태인 k07_i는 0부터 시작하여 9까지 1씩 증가한다.
			for(int j = 0; j < i; j++) System.out.printf(" ");	// int 형태인 k07_j는 0부터 시작하여 k07_i까지 1씩 증가한다.
			System.out.printf("%d\n", i);						// 정수 형태이기 때문에 %d 서식을 사용하였고 다음 줄을 바꿔주기 위해 \n 을 사용하였다.
		}														// k07_i가 0일 경우 k07_j는 0 < 0 이므로 공백을 따로 찍지 않고 0을 찍고 줄을 바꾼다.
	}															// k07_i가 1일 경우 k07_j는 0 < 1 을 만족하므로 공백을 한개 찍고 1을 찍고 줄을 바꾼다.
																// k07_i가 2일 경우 k07_j는 0 < 2  까지 만족하므로 공백을 두개 찍고 2를 찍고 줄을 바꾼다.    
																//						 1 < 2  
}																
																// k07_i가 3일 경우 k07_j는 0 < 3
																// 						 1 < 3
																// 						 2 < 3 까지 만족하므로 공백을 세개 찍고 3을 찍고 줄을 바꾼다.
																// 이와 같은 과정을 9까지 한다.