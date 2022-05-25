package ReportSheet;

import InputData.InputData;

public class ReportSheet {

	public static void main(String[] args) {

		int iPerson = 10;		// 정수형태로 하여 10의 값을 주는만큼 저장소를 생성한다.
		
		InputData inData = new InputData(iPerson);  // iPerson의 인자를 받은 수만큼 배열을 만들어준다.
		
		// 입력 데이터를 임의로 만들어보았다.
		for(int i = 0; i < iPerson; i++) {					//k07_i는 0부터 9까지 1씩 증가한다.
			String name = String.format("홍길%02d", i);		// 이름을 만들어주었다.
			int kor = (int)(Math.random()*100);				// Math.random()을 통해 국어점수를 임의로 만들어 주었다.
			int eng = (int)(Math.random()*100);				// 영어점수를 임의로 만들어 주었다.
			int mat = (int)(Math.random()*100);				// 수학점수를 임의로 만들어 주었다.
			inData.InputData(i, name, kor, eng, mat);		// 클래스내에 값을 입력해주었다.
		}
		
		for(int i = 0; i < iPerson; i++) {					// k07_i는 0부터 9까지 1씩 증가한다.
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",		// 번호 이름 국어 영어 수학 총점 평균 순서로 출력해준다.
					i, inData.nameArray[i], inData.korArray[i], inData.engArray[i], inData.mathArray[i], inData.sumArray[i], inData.aveArray[i]);
		}
	}

}
