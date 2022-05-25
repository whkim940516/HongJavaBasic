package BasicForWhile;

/* for문과 while문은 문장 또는 문장들을 반복해서 수행할 때 사용한다.
   조건식과 수행할 블럭{} 또는 문장으로 구성되어 있다.
   반복시 Count 변수를 유용히 쓸 경우 for문을 그외에는 while문을 사용한다.
   for문과 while문은 서로 변경이 가능하다.
   do-while문은 while문의 변형으로 블럭 {}이 최소한 한번은 수행될 것을 보장한다. */

public class BasicForWhile {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 5; i++) {  // 반복문을 시작하는 변수명을 kopo07_i로 짓고 형태는 int로 하여 1부터 5까지 반복하는데 1씩 증가하도록 하였다. 
//			System.out.println(i);	   // 반복문이 돌면서 kopo07_i를 출력하도록 하였다.
//		}
		
//		int k07_i = 1;     // k07_i 변수를 int 형태로 하고 1의 값을 대입해주었다.
//		
//		while(k07_i <= 5) {		// k07_i 는 5까지 반복된다
//			System.out.println(k07_i);		// k07_i가 출력된다.
//			k07_i++;						// k07_i가 1씩 증가되도록 한다.
//		}
		
		int k07_i = 0;		// k07_i 변수를 int형태로 0의 값을 대입해준다.(초기화)
		
		do {				// do while문은 while문 안의 코드가 성립하면 do를 수행한다.
			k07_i++;		// k07_i 는 1씩 증가한다.
			System.out.println(k07_i);	// k07_i를 출력하며 println을 사용했기 때문에 다음 값은 다음 문장에 출력된다.
		} while(k07_i<=5);	// k07_i가 5보다 작거나 같을 경우 do를 돈다.
	}						// k07_i는 0부터 시작했기 때문에 do를 돌면서 1 2 3 4 5 6이 출력된다.

}
