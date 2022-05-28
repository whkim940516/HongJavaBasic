package BufferedReadWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWrite {
	
	public static void FileWrite() throws IOException {
		
		File f = new File("C:\\Users\\김우형\\Desktop\\jukadata\\Mytest.txt"); // 해당 파일이 있는 Full 경로를 적어주고 f 리모콘에 연결해주었다.
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));	// BufferedWriter에 FileWriter한 것을 집어넣었다.(이렇게 하면 Buffer 처리가 된다.)
		
		// 버퍼 처리가 된다.
		bw.write("안녕 파일");		// bufferedWriter를 통해 만든 객체 bw에 write 메서드를 사용하여 파일에 해당 문장을 적어주었다.
		bw.newLine();		// 개행(줄바꿈)을 할 때에는 "\r\n"을 write하거나 newLine() 함수를 사용한다.
		bw.write("hello 헬로");	// bufferedWriter를 통해 만든 객체 bw에 write 메서드를 사용하여 파일에 해당 문장을 적어주었다.
		bw.newLine();		// 개행(줄바꿈)을 할 때에는 "\r\n"을 write하거나 newLine() 함수를 사용한다.
		
		bw.close();			// BufferedWriter를 닫아주었다.
	}		// 결국 FileWrite 메서드를 통해 해당 파일에 적고싶은 내용을 적고 줄바꿈을 해주는 식으로 하고 파일을 닫아주었다.
	
	public static void FileRead() throws IOException {		
		
		File f = new File("C:\\Users\\김우형\\Desktop\\jukadata\\Mytest.txt");	// 해당 파일이 있는 Full 경로를 적어주고 f 리모콘에 연결해주었다.
		BufferedReader br = new BufferedReader(new FileReader(f));		// BufferedReader를 쓰면 readLine() 문장을 쓸 수 있다.
		
		String readtxt;		// readtxt를 String으로 선언해주었다.
		
													// br 객체를 통해 읽은 문장을 readtxt에 대입하고 그것이 null값이 아니면 모두 읽을 수 있도록 하였다.
		while((readtxt = br.readLine()) != null) {	// BufferedReader를 쓰면 readLine()으로 한줄씩 읽을 수 있다.
			System.out.printf("%s\n", readtxt);		// 읽는 문장이 null 값이 아니면 모두 읽어들이도록 하며 String이기 때문에 %s서식을 사용하였고 줄바꿈을 위해 \n을 사용해주었다.
		}
		
		br.close();		// BufferedReader 객체를 통해 생성된 br을 닫아주었다.
	}		// 결국 FileRead 메서드를 통해 해당 파일안에 있는 내용이 Null값이 아니면 모두 읽을 수 있도록 하였다.
	
	public static void main(String[] args) throws IOException {		// 메인 메서드

		FileWrite();	// FileWrite 메서드를 호출해주었다.
		FileRead();		// FileRead 메서드를 호출해주었다.
	}

}

// 앞의 무식하게 읽고쓰기와의 차이점 즉, BufferedReader를 안하고 읽었을 때와 어떤 차이가 있는지 비교하면서 커멘트 달기

