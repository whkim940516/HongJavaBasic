package DistanceCalculation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DistanceCalculation {

	public static void main(String[] args) throws IOException {

		// \는 특수문자이므로 \\ 두개를 써야한다.
		File f = new File("C:\\Users\\김우형\\Desktop\\무료와이파이정보.txt");  // 풀 경로
		BufferedReader br = new BufferedReader(new FileReader(f));	// BufferedReader에 FileReader한 것을 집어넣었다. -> 버퍼처리
		
		String readtxt;	// readtxt를 String으로 선언하였다.
		
		if((readtxt = br.readLine()) == null) {	// 한줄씩 읽은 것을 readtxt에 넣고 그 값이 null 이면
			System.out.printf("빈 파일입니다\n");		// 빈파일이라고 출력한다.
			return;
		}
		
		String[] field_name = readtxt.split("\t");	// readtxt를 탭을 기준으로 쪼갠 것을 field_name 배열에 넣어주었다.
		
		// 융합기술 우리집 위도 경도, 지도에서 알아보기  = > 해야됨
		double lat = 37.3860521;		// 융기원 위도
		double lng = 127.1214038;		// 융기원 경도
		
		int LineCnt = 0;		// 몇번째 항목까지 확인할 수 있도록 LineCnt변수를 초기화해주었다.
		while((readtxt = br.readLine()) != null) {	// br객체를 통해 한줄씩 읽은 것을 readtxt에 대입하고 그 값이 null이 아니면 루프를 돌도록 하였다.
			
			String[] field = readtxt.split("\t");	// readtxt를 탭을 기준으로 쪼갠 것을 field라는 이름으로 String 배열로 선언해주었다. 
			System.out.printf("**[%d번째 항목]*******************\n", LineCnt);		// 몇번째 항목인지 확인할 수 있도록 LineCnt를 출력해주었다.
			System.out.printf(" %s : %s\n", field_name[9], field[9]);	// 9번 : 지번주소 를 출력할 수 있도록 하였고 문자열이기 때문에 %s 서식을 사용했다.
			System.out.printf(" %s : %s\n", field_name[13], field[13]);	// 13번 : 위도주소 를 출력할 수 있도록 하였고 문자열이기 때문에 %s 서식을 사용했다.
			System.out.printf(" %s : %s\n", field_name[14], field[14]);	// 14번 : 경도주소 를 출력할 수 있도록 하였고 문자열이기 때문에 %s 서식을 사용했다.
			
			// 점과 점사이의 거리를 통해 현재 지점과의 거리를 확인할 수 있다.
			double dist = Math.sqrt(Math.pow(Double.parseDouble(field[13])-lat, 2)
						+ Math.pow(Double.parseDouble(field[14]) - lng, 2));
			System.out.printf("현재 지점과 거리 : %f\n", dist);	// 13번 : 경도 주소 를 출력할 수 있도록 하였고 %f서식을 사용하였다.
			System.out.printf("**********************************\n");
			
			LineCnt++;	// 그리고 나서 몇번째 까지 했는지 확인해주기 위해 LineCnt가 1씩 증가하도록 하였다.
		}
		br.close();		// BufferedReader를 닫아주었다.
	}

}
