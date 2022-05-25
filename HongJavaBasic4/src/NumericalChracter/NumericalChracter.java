package NumericalChracter;

/* 숫자는 정수형, 실수형 비교에 주의하자
   유효숫자에 유의하자
   char 1개는 a = 'a'로 비교가 가능하다.
   String은 클래스 함수 .equal(" ")를 사용한다.
   아니다는 !이다. */

public class NumericalChracter {

	public static void main(String[] args) {
		
		int k07_ii;   
		double k07_iD;
		
		k07_ii = 10/3;		// int이기 때문에 3이 나올 것이다.
		k07_iD = 10/3.0;	// double이기 때문에 3.33333 이 나올 것이다.
		
		// int와 double은 정수형 연산과 실수형 연산이다.
		if (k07_ii == k07_iD) System.out.printf("equal\n");						// k07_ii와 k07_iD 가 같으면 equal을 출력하지만 
		else System.out.printf("Not equal[%f][%f]\n", (double)k07_ii, k07_iD);	// 그렇지 않으면 그 결과를 알 수 있으며 %f는 서식을 사용했으므로 실수형태로 나타나게 된다.
																		// k07_ii는 원래 int였으나 출력부에서 double을 붙여주었고 %f서식을 사용했으므로 실수 형태로 나오게 되고
		// 단지 유효숫자까지 표시된 것 뿐이지 다르다.								// k07_iD는 원래 double 형태였고 %f 서식을 사용했으므로 실수형태로 나오게 된다.또한 다음 문장을 위해 줄바꿈 기호 \n를 사용했다.
		if (k07_iD==3.333333) System.out.printf("equal\n");					
		else System.out.printf("Not equal[3.333333][%f]\n", k07_iD);		// k07_iD는 3.333333이 아니므로 Not equal~이 후의 내용들이 출력된다.또한 다음 문장을 위해 줄바꿈 기호 \n를 사용했다.
		
				
		k07_iD = (int)k07_iD;													// k07_iD를 정수 형태로 하고 이를 k07_iD에 대입한다.
		if(k07_ii == k07_iD) System.out.printf("equal\n");						// k07_ii는 정수 형태이고 k07_iD도 정수 형태이기 때문에 
		else System.out.printf("Not equal[%f][%f]\n", (double)k07_ii, k07_iD);	// equal이 출력된다.또한 다음 문장을 위해 줄바꿈 기호 \n를 사용했다.
		
		System.out.printf("int로 인쇄[%d][%f]\n", k07_ii, k07_iD);				// k07_ii는 int이기 때문에 %d 형식으로 나오도록 했고 k07_iD는 실수형태이기 때문에 %f 형식으로 나오도록 했다.
		System.out.printf("double로 인쇄[%f][%f]\n", (double)k07_ii, k07_iD);		// 이번엔 위와 달리 k07_ii를 double형태로 바꾸어주었기 때문에 %f를 사용하였으며 출력물 또한 실수 형태로 출력된다.
		
		char k07_a = 'c';													// c라는 문자를 a에 대입하여 char 형태로 선언한다.
		
		if (k07_a == 'b') System.out.printf("a는 b이다\n");
		if (k07_a == 'c') System.out.printf("a는 c이다\n");					// 위에서 a == 'c' 였으므로 해당 조건을 만족하기 때문에 a는 c이다 의 결과가 출력된다.
		if (k07_a == 'd') System.out.printf("a는 d이다");
		
		String k07_aa = "abcd";												// abcd라는 문자를 aa에 대입하여 String 형태로 선언한다.
		
		if(k07_aa.equals("abcd")) System.out.printf("aa는 abcd이다\n");   // 수치형과 달리 String에서는 equal("") 함수를 사용하여 같은지 아닌지를 비교한다.
		else System.out.printf("aa는 abcd이 아니다\n");				// 따라서 if 안의 문장을 만족하므로 aa는 abcd이다 가 출력된다.
		
		boolean k07_bb = true;											// boolean 형태는 true와 false로 나타낸다. 여기서 bb는 true로 하여 boolean 형태로 선언하였다.
		
		if(!!k07_bb) System.out.printf("bb가 아니고 아니면 참이다.\n");   // !!은 참이다. 따라서 bb는 참이니까 bb가 아니고 아니면 참이다가 출력된다.
		else System.out.printf("bb가 아니고 아니면 거짓이다.\n");
	}

}
