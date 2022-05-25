package Pyramid;

// 피라미드
// 피라미드는 가운데를 중심으로 띄어쓰기는 한 칸 줄어들고 있고, 별은 두 개씩 늘어난다.

public class Pyramid {

	public static void main(String[] args) {

		int k07_n,k07_m;		// k07_n과 k07_m을 int 형태로 선언한다. 
		
		k07_m = 20; k07_n = 1;	// 그 값은 20과 1로 한다.
		
		while(true) {  // while(true)는 무한 반복과 같다.
			
			for(int i = 0; i < k07_m; i++) System.out.printf(" ");	// k07_i는 0부터 20까지 1씩 증가한다
			for(int i = 0; i < k07_n; i++) System.out.printf("*");	// k07_i는 0부터 1까지 1씩 증가한다.
			System.out.printf("\n");							// 줄 바꿈 기호 \n을 적어준다.
																// 즉 처음에는 20개의 공백을 찍고 별 1개를 찍고 줄을 바꾼다.
			k07_m = k07_m - 1;											// m = m-1이므로 20 - 1 = 19 개의 공백을 찍고 n = n+2이므로 별 3개를 찍고 줄을 바꾼다. 					
			k07_n = k07_n + 2;											// 그리고 이와 같은 과정을 반복하여 
			
			if(k07_m < 0) break;									// k07_m이 0보다 작아지면 반복문을 탈출한다.
		}
	}

}
