// for�� ��� while, break�� ��ô�.
// �ʱ�ȭ �� ������ġ�� �� ���� ����

package Lecture4_Star;

public class Lecture4_Star {

	public static void main(String[] args) {

		int k07_iA, k07_iB;
		
		k07_iA = 0;  // iA���� �ʱ�ȭ
		while(true) {
			
			k07_iB = 0;  // iB���� �ʱ�ȭ
			while(true) {
				System.out.printf("*");
				
				if(k07_iA==k07_iB) break;
				k07_iB++;
			}
			System.out.println("\n");
			k07_iA++;
			if(k07_iA == 30) break;
		}
	}

}
