package InputData2;

public class InputData2 {

	public String[] nameArray;			// �̸��� ���� �迭�� �������ش�.
	public int[] korArray;				// ���� ������ ���� �迭�� �������ش�.
	public int[] engArray;				// ���� ������ ���� �迭�� �������ش�.
	public int[] mathArray;				// ���� ������ ���� �迭�� �������ش�.
	public int[] sumArray;				// ���� ������ ���� �迭�� �������ش�.
	public double[] aveArray;			// ��հ��� ���� �迭�� �������ش�.
	
	public InputData2(int iPerson) {			// ���������� k07_iperson�� ���ڷ� �ϴ� k07_InputData �޼��带 ������ش�.
		nameArray = new String[iPerson];	// �̸� �迭�� ũ�⸦ �����ִ� ��ü�� ������־���.
		korArray = new int[iPerson];		// �������� �迭�� ũ�⸦ �����ִ� ��ü�� ������־���.
		engArray = new int[iPerson];		// �������� �迭�� ũ�⸦ �����ִ� ��ü�� ������־���.
		mathArray = new int[iPerson];		// �������� �迭�� ũ�⸦ �����ִ� ��ü�� ������־���.
		sumArray = new int[iPerson];		// �����հ� �迭�� ũ�⸦ �����ִ� ��ü�� ������־���.
		aveArray = new double[iPerson];		// ������� �迭�� ũ�⸦ �����ִ� ��ü�� ������־���.
	}
	
	public void InputData2(int i, String name, int kor, int eng, int math) {	// ��ȣ,�̸�,��������,��������,���� ������ ���ڷ� �ް� �� �迭�� �־��ش�.
		
		nameArray[i] = name;		// k07_i ���ڿ� �°� �� �迭���� �̸��� �迭�� �־��ش�.
		korArray[i] = kor;			// k07_i ���ڿ� �°� �� �迭���� ���������� �迭�� �־��ش�.
		engArray[i] = eng;			// k07_i ���ڿ� �°� �� �迭���� ���������� �迭�� �־��ش�.
		mathArray[i] = math;		// k07_i ���ڿ� �°� �� �迭���� ���������� �迭�� �־��ش�.
		sumArray[i] = kor + eng + math;		// k07_i ���ڿ� �°� �� �迭���� �����հ踦 �迭�� �־��ش�.
		aveArray[i] = sumArray[i] / 3.0;	// k07_i ���ڿ� �°� �� �迭���� ��������� �迭�� �־��ش�.
	}
}
