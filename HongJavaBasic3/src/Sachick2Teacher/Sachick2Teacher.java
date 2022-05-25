// 프로그램에서 값을 누적(sum)하는 경우는 무진장 많다
// 변수를 선언 후 초기화하고, 반복문을 통하여 계속적으로 더한 값을 쌓는 기법
// 계산기에 M+ M- 버튼을 잘 사용하는가?

package Sachick2Teacher;

public class Sachick2Teacher {

	public static void main(String[] args) {

		int k07_sum = 0; // 변수 선언 및 초기화
		
		for(int k07_i=1; k07_i<101; k07_i++) {  // 1부터 100까지 더한다.
			k07_sum = k07_sum + k07_i; 			// 누적해서 더해진다.
		}
		System.out.printf("### : %d, %d", k07_sum, k07_sum/100);   // 합계와 평균을 출력한다.
		
		int [] k07_v = {1,2,3,5,66};  // 가변 배열을 선언한다.
		
		int k07_vSum = 0;  // 누적할 것이기 때문에 배열 변수를 초기화해준다.
		
		for(int k07_i=0; k07_i<k07_v.length; k07_i++) {   // 0부터 개수만큼 더한다
			k07_vSum = k07_vSum + k07_v[k07_i];	 		  // 누적한다.
		}
		System.out.printf("@@@ : %d, %d", k07_vSum, k07_vSum/k07_v.length);  // 가변배열의 합계와 평균을 출력한다.
		
	}

}
