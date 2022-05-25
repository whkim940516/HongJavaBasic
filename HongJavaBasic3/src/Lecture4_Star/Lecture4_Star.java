// for문 대신 while, break를 써봤다.
// 초기화 및 누적위치를 눈 여겨 보자

package Lecture4_Star;

public class Lecture4_Star {

	public static void main(String[] args) {

		int k07_iA, k07_iB;
		
		k07_iA = 0;  // iA변수 초기화
		while(true) {
			
			k07_iB = 0;  // iB변수 초기화
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
