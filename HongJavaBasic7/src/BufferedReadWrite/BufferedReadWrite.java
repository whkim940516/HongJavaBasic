package BufferedReadWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWrite {
	
	public static void FileWrite() throws IOException {
		
		File f = new File("C:\\Users\\김우형\\Desktop\\jukadata\\Mytest.txt"); // 해당 파일이 있는 Full 경로를 적어준다.
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));	// BufferedWriter에 FileWriter한 것을 집어넣었다.(이렇게 하면 Buffer 처리가 된다.)
		
		bw.write("안녕 파일");		// bufferedWriter를 통해 만든 객체 bw에 write 메서드를 사용하여 파일에 해당 문장을 적어주었다.
		bw.newLine();		// 개행(줄바꿈)을 할 때에는 "\r\n"을 write하거나 newLine() 함수를 사용한다.
		bw.write("hello 헬로");	// bufferedWriter를 통해 만든 객체 bw에 write 메서드를 사용하여 파일에 해당 문장을 적어주었다.
		bw.newLine();		// 개행(줄바꿈)을 할 때에는 "\r\n"을 write하거나 newLine() 함수를 사용한다.
		
		bw.close();			// BufferedWriter를 닫아주었다.
	}
	
	public static void FileRead() throws IOException {		
		
		File f = new File("C:\\Users\\김우형\\Desktop\\jukadata\\Mytest.txt");	// 해당 파일이 있는 Full 경로를 적어준다.
		BufferedReader br = new BufferedReader(new FileReader(f));		// BufferedReader를 쓰면 readLine() 문장을 쓸 수 있다.
		
		String readtxt;		// readtxt를 String으로 선언해주었다.
		
		while((readtxt = br.readLine()) != null) {	// BufferedReader를 쓰면 readLine() 문장으로 불러다 쓸 수 있다.
			System.out.printf("%s\n", readtxt);		// 읽는 문장이 null 값이 아니면 모두 읽어들이도록 하며 String이기 때문에 %s서식을 사용하였다.
		}
		
		br.close();		// BufferedReader 객체를 통해 생성된 br을 닫아주었다.
	}
	public static void main(String[] args) throws IOException {

		FileWrite();
		FileRead();
	}

}

