package ReportSheet2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import InputData2.InputData2;

public class ReportSheet2 {

	public static void main(String[] args) {

		int iPerson = 30;		// 30 ��ŭ ����Ҹ� �����Ѵ�.
		
		InputData2 inData2 = new InputData2(iPerson);		// Ŭ������ �޾� ��ü�� ����� �ν��Ͻ��� �����Ͽ� ��ü�� �����Ѵ�.
		
		Calendar cal = Calendar.getInstance();  // Calendar Ŭ������ ���� �ν��Ͻ� ��ü�� �����´�.
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("ȫ��%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			inData2.InputData2(i, name, kor, eng, mat);
		}
		
		
		System.out.printf("%25s\n", "��������ǥ");
		System.out.printf("%26s%s\n", "������� : ", sdt.format(cal.getTime()));
		System.out.println("==============================================");
		System.out.printf("%s%6s%6s%5s%5s5s%5s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.println("==============================================");
		
		for(int i = 0; i < iPerson; i++) {
			System.out.printf("03d%8s%7d%7d7d%7d%7d\n",
					i+1, inData2.nameArray[i], inData2.korArray[i], inData2.engArray[i], inData2.mathArray[i], inData2.sumArray[i], (int)(inData2.aveArray[i]));
		}
	
		System.out.println("==============================================");
		
		int korTotal = 0, engTotal = 0, mathTotal = 0, sumTotal = 0, aveTotal = 0,
				
	}

}
