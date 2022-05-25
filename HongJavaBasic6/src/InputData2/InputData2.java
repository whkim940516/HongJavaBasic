package InputData2;

public class InputData2 {

	public String[] nameArray;			// 이름에 담을 배열을 선언해준다.
	public int[] korArray;				// 국어 점수를 담을 배열을 선언해준다.
	public int[] engArray;				// 영어 점수를 담을 배열을 선언해준다.
	public int[] mathArray;				// 수학 점수를 담을 배열을 선언해준다.
	public int[] sumArray;				// 총합 점수를 담을 배열을 선언해준다.
	public double[] aveArray;			// 평균값을 담을 배열을 선언해준다.
	
	public InputData2(int iPerson) {			// 정수형태인 k07_iperson을 인자로 하는 k07_InputData 메서드를 만들어준다.
		nameArray = new String[iPerson];	// 이름 배열의 크기를 정해주는 객체를 만들어주었다.
		korArray = new int[iPerson];		// 국어점수 배열의 크기를 정해주는 객체를 만들어주었다.
		engArray = new int[iPerson];		// 영어점수 배열의 크기를 정해주는 객체를 만들어주었다.
		mathArray = new int[iPerson];		// 수학점수 배열의 크기를 정해주는 객체를 만들어주었다.
		sumArray = new int[iPerson];		// 점수합계 배열의 크기를 정해주는 객체를 만들어주었다.
		aveArray = new double[iPerson];		// 점수평균 배열의 크기를 정해주는 객체를 만들어주었다.
	}
	
	public void InputData2(int i, String name, int kor, int eng, int math) {	// 번호,이름,국어점수,영어점수,수학 점수를 인자로 받고 각 배열에 넣어준다.
		
		nameArray[i] = name;		// k07_i 인자에 맞게 들어간 배열에서 이름을 배열에 넣어준다.
		korArray[i] = kor;			// k07_i 인자에 맞게 들어간 배열에서 국어점수를 배열에 넣어준다.
		engArray[i] = eng;			// k07_i 인자에 맞게 들어간 배열에서 영어점수를 배열에 넣어준다.
		mathArray[i] = math;		// k07_i 인자에 맞게 들어간 배열에서 수학점수를 배열에 넣어준다.
		sumArray[i] = kor + eng + math;		// k07_i 인자에 맞게 들어간 배열에서 점수합계를 배열에 넣어준다.
		aveArray[i] = sumArray[i] / 3.0;	// k07_i 인자에 맞게 들어간 배열에서 점수평균을 배열에 넣어준다.
	}
}
