package gugu1;

public class gugu1 {							   				    // #구구단 헤드 부분 이해
												   					//	 	  i   i+1   i+2
	public static void main(String[] args) {       					// i=1:	  1    2     3      i = i+3 -> 4
												   					// i=2:   4	   5     6	    i = i+3 -> 7
		for(int k07_i = 1; k07_i < 10; k07_i=k07_i+3) {			    // i=3:   7    8     9
			System.out.printf("***************\t***************\t***************\n");				  // 정수형태 서식 %d와 띄어쓰기 위해 \t 사용
			System.out.printf("   구구단 %d 단   \t   구구단 %d 단   \t   구구단 %d 단   \t\n", k07_i, k07_i+1, k07_i+2); // 1,2,3 찍고 줄바꾸고 4,5,6 찍고 줄바꾸고 
			System.out.printf("***************\t***************\t***************\n");				  // 7,8,9가 찍힌다
			for(int k07_j = 1; k07_j < 10; k07_j++) {												// 외부 for문이 수행되면서 내부 for문이 1~9까지 수행된다.
				System.out.printf("   %d * %d = %d\t", k07_i, k07_j, k07_i * k07_j);					// 구구단 1단     구구단 2단     구구단 3단
				System.out.printf("   %d * %d = %d\t", k07_i+1, k07_j, (k07_i+1) * k07_j);				// 1x1 = 1	   2x1 = 2      3x1 = 3
				System.out.printf("   %d * %d = %d\n", k07_i+2, k07_j, (k07_i+2) * k07_j);				// 1x2 = 2     2x2 = 4      3x2 = 6 
																						// .. 이와 같은 방식으로 진행된다.
			}																			// 그리고 식 하나를 쓰고 칸을 띄워줘야하기 때문에 \t를 사용하였고
		}																				// 마지막 식에서는 줄을 바꿔줘야하기 때문에 \n을 사용했다.
	}
}

