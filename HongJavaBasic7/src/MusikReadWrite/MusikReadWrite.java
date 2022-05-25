package MusikReadWrite;

import java.io.File;		
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MusikReadWrite {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\김우형\\Desktop\\jukadata\\test.txt");	// 해당 파일이 있는 Full 경로를 적어줘야 한다.
		FileWriter fw = new FileWriter(f);		// 디스크가 깨졌다거나 파일이 없다거나 할 수 있기 때문에 try catch로 닫거나 main throws IOException을 사용하면 에러를 해결할 수 있다.
		
		fw.write("안녕파일\n");		// 파일에 write를 해주고 줄을 바꿔주었다.
		fw.write("hello hello 헬로\n");	// 파일에 write를 해주고 줄을 바꿔주었다.
		
		fw.close();		// FileWriter를 닫아준다.
		
		FileReader fr = new FileReader(f);		// 읽는거는 FileReader를 이용한다.
		
		int n = -1;		// n이 아무것도 없다는 의미
		char [] ch;		// char의 배열에 ch로 읽는다
		
		while(true) {	// 무한 루프문을 사용하였다.
			ch = new char[1000];	// 한꺼번에 1000개씩 읽어라
			n = fr.read(ch);		// fr.read(ch);  최대 1000개씩 읽고 만약에 없다 하면 몇개 까지 읽었는지 n으로 들어간다.
			if(n < 0) break;   // n이 0보다 작을 경우 while문을 탈출 한다.
			
			for(int i = 0; i < n; i++) {	// i는 0부터 n까지 1씩 증가한다.
				System.out.printf("%c", ch[i]);		// char 1개 찍으며 읽은걸 하나씩 찍는다.
			}
		}
		fr.close();		// FileReader를 닫아준다.
		System.out.printf("FILE PROCESS END \n");	// 해당 문장을 출력하도록 해주었다
	}

}
