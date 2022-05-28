package Wifi01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Wifi01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\김우형\\Desktop\\무료와이파이정보.txt");  // 경로를 받아온 후 f 리모콘에 연결해주었다.
		BufferedReader br = new BufferedReader(new FileReader(f));	// BufferedReader에 FileReader한 것을 집어넣었다. -> 버퍼처리
		
		String readtxt;		// readtxt를 String 형태로 선언하였다.
		if((readtxt = br.readLine()) == null) {	// br객체를 통해 한줄씩 읽은 문장을 readtxt에 대입하였고 그 값이 null이면
			System.out.printf("빈 파일입니다\n");	// 빈파일이라고 출력하도록 하였다.
		}
		
		String [] field_name = readtxt.split(",");	// readtxt에서 ,를 통해 쪼갠 것을 field_name이라는 String 배열에 넣어주었다.
		
		int Linecnt = 0;		// 몇번째 까지 읽었는지 확인하기 위한 변수 Linecnt를 사용하기 위해 변수 초기화 해주었다.
		while((readtxt = br.readLine()) != null) {	// br 객체를 통해 읽은 문장을 readtxt에 대입하고 그 값이 null이 아니면 
			Linecnt++;								// Linecnt가 하나씩 올라가도록 하였다
			String [] field = readtxt.split(",");	// readtxt를 ,를 통해 쪼갠 것을 field 라는 String 배열에 넣어주었다.
			System.out.printf("==[%d번째 항목]==============\n", Linecnt);  // 몇 번째 항목까지 출력했는지 확인할 수 있도록 sysout을 걸어서 출력문이 나오도록 하였다..
			for(int i = 0; i < field_name.length; i++) {		// i는 0부터 field_name배열의 길이까지 1씩 증가한다.
				System.out.printf("%s : %s\n", field_name[i], field[i]);	// field_name[i]과 field[i]의 내용이 출력하도록 field_name[i]과 field[i]의 
			}
			System.out.printf("========================\n");	// 필드가 구분될 수 있도록 추가해준 출력문이다.
		}
		
		br.close(); 
		
	}

}

// 읽어보니 탭으로 분리하여 txt파일로 저장하고 다시 열어서 사용해야할거 같다.
// 출력해봤더니 원하는 대로 나오지 않는 상황

