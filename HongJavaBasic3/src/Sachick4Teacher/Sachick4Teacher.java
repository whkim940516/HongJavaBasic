// # 반올림을 처리
// 10으로 나누고 나눈 것을 10을 곱함
// 100으로 나누고 나눈 것을 100을 곱함

package Sachick4Teacher;

public class Sachick4Teacher {

	public static void main(String[] args) {

		int i = 12345;
		int j = (i/100)*100;
		System.out.printf("-->%d\n", j);
		
		i = 12342;
		j = ((i+5)/10)*10;
		System.out.printf("-->%d\n", j);
		
	}

}
