package Lecture4_gugu;

public class Lecture4_gugu {

	public static void main(String[] args) {

		for(int k07_i = 1; k07_i < 10; k07_i++) {
			System.out.printf("************************\n", k07_i);
			System.out.printf("       구구단 %d 단 \n", k07_i);
			System.out.printf("************************\n", k07_i);
			for(int k07_j = 1; k07_j < 10; k07_j++) {
				System.out.printf(" %d * %d = %d \n", k07_i, k07_j, k07_i * k07_j);
			}
		}
	}

}
