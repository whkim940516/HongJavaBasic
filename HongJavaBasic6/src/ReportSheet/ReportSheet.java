package ReportSheet;

import InputData.InputData;

public class ReportSheet {

	public static void main(String[] args) {

		int iPerson = 10;		// �������·� �Ͽ� 10�� ���� �ִ¸�ŭ ����Ҹ� �����Ѵ�.
		
		InputData inData = new InputData(iPerson);  // iPerson�� ���ڸ� ���� ����ŭ �迭�� ������ش�.
		
		// �Է� �����͸� ���Ƿ� �����Ҵ�.
		for(int i = 0; i < iPerson; i++) {					//k07_i�� 0���� 9���� 1�� �����Ѵ�.
			String name = String.format("ȫ��%02d", i);		// �̸��� ������־���.
			int kor = (int)(Math.random()*100);				// Math.random()�� ���� ���������� ���Ƿ� ����� �־���.
			int eng = (int)(Math.random()*100);				// ���������� ���Ƿ� ����� �־���.
			int mat = (int)(Math.random()*100);				// ���������� ���Ƿ� ����� �־���.
			inData.InputData(i, name, kor, eng, mat);		// Ŭ�������� ���� �Է����־���.
		}
		
		for(int i = 0; i < iPerson; i++) {					// k07_i�� 0���� 9���� 1�� �����Ѵ�.
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",		// ��ȣ �̸� ���� ���� ���� ���� ��� ������ ������ش�.
					i, inData.nameArray[i], inData.korArray[i], inData.engArray[i], inData.mathArray[i], inData.sumArray[i], inData.aveArray[i]);
		}
	}

}
