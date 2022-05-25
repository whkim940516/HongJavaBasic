package ReportSheet2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import InputData2.InputData2;

public class ReportSheet2 {

	public static void main(String[] args) {

		int iPerson = 30;		// 30 만큼 저장소를 생성한다.
		
		InputData2 inData2 = new InputData2(iPerson);		// 클래스를 받아 객체를 만들고 인스턴스를 생성하여 객체에 연결한다.
		
		Calendar cal = Calendar.getInstance();  // Calendar 클래스를 통해 인스턴스 객체를 가져온다.
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("홍길%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			inData2.InputData2(i, name, kor, eng, mat);
		}
		
		
		System.out.printf("%25s\n", "성적집계표");
		System.out.printf("%26s%s\n", "출력일자 : ", sdt.format(cal.getTime()));
		System.out.println("==============================================");
		System.out.printf("%s%6s%6s%5s%5s5s%5s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("==============================================");
		
		for(int i = 0; i < iPerson; i++) {
			System.out.printf("03d%8s%7d%7d7d%7d%7d\n",
					i+1, inData2.nameArray[i], inData2.korArray[i], inData2.engArray[i], inData2.mathArray[i], inData2.sumArray[i], (int)(inData2.aveArray[i]));
		}
	
		System.out.println("==============================================");
		
		int korTotal = 0, engTotal = 0, mathTotal = 0, sumTotal = 0, aveTotal = 0,
				
	}

}
