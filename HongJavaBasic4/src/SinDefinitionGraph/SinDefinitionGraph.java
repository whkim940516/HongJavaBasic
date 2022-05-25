package SinDefinitionGraph;

// 360도 = 2pi
// sin 함수는 -1 ~ 1 까지 나온다.
// 양수화 하여 1을 더하면 0~2까지 나온다.
// 곱하기 50을 하면 0~100 까지 표현 가능하다.
// 그 값 만큼 띄어 쓴 다음 별 하나 찍어보기

public class SinDefinitionGraph {

	public static void main(String[] args) {

		double k07_fSin;		// double 형태로 k07_fSin을 선언해주었다
		
		for(int k07_i = 0; k07_i < 360; k07_i++) {	// k07_i는 0부터 359까지 1씩 증가한다.
			k07_fSin = Math.sin(k07_i * 3.141592/180);  // 라디안 값으로 변경하기 위한 공식을 계산한 값을 k07_fSin에 대입해주었다.
			
			int iSpace = (int)((1.0 - k07_fSin) * 50);   // 1에서 k06_fSin을 빼준 후 50을 곱해서 그만큼 띄어주고 int 형태로 k07_iSpace에 대입해준다.
			for(int k07_j = 0; k07_j < iSpace; k07_j++) System.out.printf(" ");  // k07_j는 0부터 k07_iSpace 만큼 띄어주며 1씩 증그한다. 
			System.out.printf("*[%f][%d]\n", k07_fSin, iSpace);			//  k07_fSin과 k07_iSpace에 해당하는 값들이 출력되며 띄어쓰기도 그에 맞게 출력된다.
		}
	
	
	}
}
