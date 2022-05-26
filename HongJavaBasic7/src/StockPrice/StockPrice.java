package StockPrice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StockPrice {

	public static void main(String[] args) throws IOException {

		File f = new File("");  // 주가 데이터 full 경로
		BufferedReader br = new BufferedReader(new FileReader(f));		// 버퍼로 읽어오기
		
		String readtxt;
		int LineCnt = 0;
		int n = 1;	// 읽은 개수 체크
		StringBuffer s = new StringBuffer();	// 스트링 버퍼
		
		while(true) {		// 무한 반복
			char[] ch = new char[1000];	// char배열로 읽어오기
			
			n = br.read(ch);		// 배열로 쓰기
			
			if(n == -1) break;	// 마지막 -1 값이 없으면 while 빠져 나오기
			
			// for(char c : ch) // char 배열만큼 반
			for(char c : ch) {	// char 배열만큼 반복
				if(c == '\n') {	// 개행
					System.out.printf("[%s]***\n", s.toString());	// 출력문
					s.delete(0,  s.length());
				} else {		// 개행이 아닐시
					s.append(c);	// append로 더하기
				}
			}
			
			LineCnt++;
		}
		System.out.printf("[%s]***\n", s.toString());	// 출력
		br.close();	// 버퍼 닫아주기
		
	}

}
